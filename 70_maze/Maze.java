// Jun Hong Wang, Ari Gurovich, Jing Yi Feng
// APCS pd6
// HW70 -- maze solving (blind, depth-first)
// 2022-03-03r
// time spent: 2 hrs

/***
 * SKEELTON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 *  <INSERT YOUR SUMMARY OF ALGO HERE>
 * 1) We check if the maze is solved, by using the boolean variable.
   2) We check if we are on the exit, and if we are, solved becomes true.
   3) If the coordinates are not on a path, then we return (to backtrack).
   4) Otherwise, we set the character at the coordinates to a hero, and we recursively call the method for each of the 4 directions.
   5) At the end, if none of them return anything, the character at the coordinate becomes a visited path.
   6) Eventually, the method will either reach the base case of the maze being solved, or the maze is impossible.
   7) If the maze is impossible (like in our 11.maze file), then the program will just return, and every tile will be visited.
 * DISCO
 * System.exit(int a) will terminate the program.
   if a is 0, the termination is successful, and if it isn't 0, then it isn't successful.
 * QCC
 * When the maze is solved, do we need to turn our heroes into visited paths?
   What are the uses of System.exit(not 0)?
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 200;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if (_solved) {
      //SOP statement used to see if this was reached
      //System.out.println(_solved);
	    System.exit(0);
    }
    //other base cases
    else if (_maze[y][x] == EXIT) {
      _solved = true;
      solve(x, y);
    }
    else if (_maze[y][x] != PATH) {
      return;
    }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
	    _maze[y][x] = HERO;
      System.out.println( this ); //refresh screen

      // if (_maze[y - 1][x] == PATH) {
      //   solve(x, y - 1);
      //   _maze[y - 1][x] = VISITED_PATH;
      // } else if (_maze[y][x - 1] == PATH) {
      //   solve(x - 1, y);
      //   _maze[y][x - 1] = VISITED_PATH;
      // } else if (_maze[y + 1][x] == PATH) {
      //   solve(x, y + 1);
      //   _maze[y + 1][x] = VISITED_PATH;
      // } else if (_maze[y][x + 1] == PATH){
      //   solve(x + 1, y);
      //   _maze[y][x + 1] = VISITED_PATH;
      // }

      solve(x, y - 1);
      solve(x - 1, y);
      solve(x, y + 1);
      solve(x + 1, y);

      _maze[y][x] = VISITED_PATH;

      System.out.println( this ); //refresh screen
      return;
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    return (_maze[y][x] == PATH);
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    //ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    int startX = 0;
    int startY = 0;
    while (ms.onPath(startX, startY) == false) {
      startX = (int)(Math.random() * 25);
      startY = (int)(Math.random() * 80);
    }
    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
