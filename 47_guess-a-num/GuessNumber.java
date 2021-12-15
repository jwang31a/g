/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW 45- Guess Again- Binary Search
2021-12-15
Time Spent : 0.5 hours
DISCO: Binary search is the process of checking if a number is greater or smaller than a certain index of the domain, and then slowly restricting the
domain of available indexes until we reach an index where we can insert our number.
The recursive method in implementing binary search was easier than the iterative version because with recursion, we could just employ a few if statements
comparing our guess to the target and then calling on the method again recursively.

QCC:
Is binary search more efficient or useful than linear search?
*/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 0;

    //pick random number in range [a,b]
    _target = (int)(Math.random()*(b-a) + a);
    /* YOUR CODE HERE */
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo
    _guessCtr++;
    if (guess == _target) {
      System.out.println("Correct! It took " + _guessCtr + " guesses");
      _guessCtr = 0;
    } else if (guess > _target && guess <= _hi) {
      _hi = guess - 1;
      System.out.println("Too high");
      playRec();
    } else if (guess < _target && guess >= _lo) {
      _lo = guess + 1;
      System.out.println("Too low");
      playRec();
    } else if (guess > _hi || guess < _lo) {
      System.out.println("Out of index");
      playRec();
    }
    /* YOUR CODE HERE */
  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;
    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo
      if (guess == _target) {
        _guessCtr ++;
        System.out.println("Correct! It took " + _guessCtr + " guesses");
        _guessCtr = 0;
        break;
      } else if (guess > _target && guess <= _hi) {
        _hi = guess - 1;
        System.out.println("Too high");
        _guessCtr ++;
      } else if (guess < _target && guess >= _lo) {
        _lo = guess + 1;
        System.out.println("Too low");
        _guessCtr ++;
      } else if (guess > _hi || guess < _lo) {
        System.out.println("Out of index");
        _guessCtr ++;
      }
      /* YOUR CODE HERE */

    }
  }


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);

    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
