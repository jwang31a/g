// Team Benjamin: Jun Hong Wang + Brian Wang + Nicole Zhou
// APCS pd6
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent: 1.0 hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 * We start with a knight at some location, then check one of the 8 locations by calling that method, with a different location and an incremented move counter.
   If that method call reaches the solved base case, then we have found a knight's tour, and we display it to the user and return.
   If the method reaches a tile that isn't available (explored or not in board), then we go back to the previous state, and try the next possible position of the knight.
   If the location is available, then we move the knight there, and recursively call this method.

   At the end, if all tiles are visited, then we display the board and return.
   If there is no possible knight's tour, then we return.

 * DISCO
 *
 * QCC
 * What would the time complexity of this algorithm be?
   We have a hunch that it's O(n!) (or maybe exponential?), since the number of branches on a tree depends on the number of available moves a knight can make (8), and each increase in input size creates extra layers in the branch.
 * Mean execution times for boards of size n*n:
 * n=5   0.1561s    across 10 executions
 * n=6   0.1923s    across 10 executions
 * n=7   0.3568s    across 10 executions (mean time would be higher, but it seems that some runs weren't returning anything)
 * n=8   1.73s    across 5 executions (mean time should be much higer, but I didn't count the ones that didn't return anything for a while. )
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    //tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    int startX = (int)(Math.random() * n) + 2;
    int startY = (int)(Math.random() * n) + 2;
    tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n + 4][n + 4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int i = 0; i < _board.length; i++) {
      for (int j = 0; j < _board.length; j++) {
        if (i < 2 ||
        i > n + 1 ||
        j < 2 ||
        j > n + 1) {
          _board[i][j] = -1;
        } else {
          _board[i][j] = 0;
        }
      }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
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
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/

  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved == true ) System.exit(0);

    //primary base case: tour completed
    if ( moves == _sideLength * _sideLength &&
      _board[x][y] == 0) {
      _solved = true;
      _board[x][y] = moves;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if (x < 2 ||
      x > _board.length - 3 ||
      y < 2 ||
      y > _board.length - 3 ||
      _board[x][y] > 0) {
        //can be simplified with != 0
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      //System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/

      findTour(x + 1, y + 2, moves + 1);
      findTour(x + 2, y + 1, moves + 1);
      findTour(x + 2, y - 1, moves + 1);
      findTour(x + 1, y - 2, moves + 1);
      findTour(x - 1, y - 2, moves + 1);
      findTour(x - 2, y - 1, moves + 1);
      findTour(x - 2, y + 1, moves + 1);
      findTour(x - 1, y + 2, moves + 1);

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] -= moves;

      //System.out.println( this ); //refresh screen
    }

  }//end findTour()

}//end class TourFinder
