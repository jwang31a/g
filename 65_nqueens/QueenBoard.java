/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    if (solveH(0) == true) {
      printSolution();
      return true;
    }
    return false;
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
  {
    //printSolution();
    if (col == _board.length) {
      return true;
    }
    if (col < _board.length) {
      for (int row = 0; row < _board.length; row++) {
        if (addQueen(row, col)) {
          if (solveH(col + 1)) {
            return true;
          } else {
            removeQueen(row, col);
          }
        }
      }
    }
    return false;
  }


  /** Print board, a la toString...
  Except:
  all negs and 0's replaced with underscore
  all 1's replaced with 'Q'
  */
  public void printSolution()
  {
    System.out.println(toString());
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

    QueenBoard test = new QueenBoard(8);
    System.out.println(test.solve());

    QueenBoard seven = new QueenBoard(7);
    System.out.println(seven.solve());

    QueenBoard nine = new QueenBoard(9);
    System.out.println(nine.solve());
  }

}//end class
