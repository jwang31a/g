/*****************************************************
Team Gamma Ray: Kevin Xiao + Mr. Swag, Jun Hong Wang, Jomin Zhao
APCS
HW38- slots
2021-11-17
time spent: 0.5 hours

DISCO:
QCC:
The reason why I have this file is because I worked in parallel with my group, the actual work is in Slots.java.
Both will work, and this should pretty much be the exact same.
 *****************************************************/

public class MySlots {
  //instance variable to represent master copy for slot machine
  private static final String[] FRUITS = {
    "lime", "lime", "lime",
    "lemon", "lemon", "lemon",
    "cherry", "cherry", "cherry",

    "orange", "orange", "orange",
    "grapefruit", "grapefruit", "grapefruit",
    "tangerine", "tangerine", "tangerine",
    "ugli", "ugli", "ugli",

    "peach", "peach", "peach"
  };

  private String[] _fruits; //to be init'd by each instance

  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public MySlots()
  {
    //allocate memory for _fruits based on size of FRUITS:
    _fruits = new String[FRUITS.length - 1];

    //copy elements of FRUITS into _fruits:
    for (int i = 0; i < FRUITS.length - 1; i++) {
      _fruits[i] = FRUITS[i];
    }
  }

  /*=====================================
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString()
  {
    String zero = "";
    String one = "";
    String two = "";
    for (int i = 0; i < 3; i++) {
      zero += _fruits[i] + "\t";
    }
    return zero;
  }

  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/

  private void swap( int i, int j )
  {
    String a = _fruits[i];
    String b = _fruits[j];
    _fruits[i] = b;
    _fruits[j] = a;
  }

  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
  {
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
    for(int i = 0; i < _fruits.length; i++) {
      swap(i, (int)(Math.random() * _fruits.length - 1));
    }
  }

  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
    boolean retBoo = false;
    if (_fruits[0].equals("lemon") && _fruits[1].equals("lemon") && _fruits[2].equals("lemon")) {
      retBoo = true;
    }

    return retBoo;
  }

  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct,
    false otherwise
    =====================================*/
  public boolean miniWin()
  {
    boolean retBoo = false;
    if (jackpot() == true || (!(_fruits[0].equals(_fruits[1])) && !(_fruits[1].equals(_fruits[2])) && !(_fruits[2].equals(_fruits[0])))) {
      retBoo = true;
    }
    return retBoo;
  }
  /*
*/

  //for testing purposes, can be commented out later
  public String stringify(String[] a) {
    String str = "";
    for (int i = 0; i <= a.length - 1; i++) {
      if (i != a.length - 1) {
        str += a[i] + ",";
      } else {
        str += a[i];
      }
    }
    return str;
  }

  //main() method for testing
  public static void main( String[] args ) {
    //usage: move bar below down 1 line at a time to test functionality...
    MySlots machine01 = new MySlots();
    MySlots machine02 = new MySlots();

    //test to verify slot machines function indepently
    System.out.println();
    System.out.println( "Machine01 initial state:\t" + machine01 );
    System.out.println( "Machine02 initial state:\t" + machine02 );

    System.out.println( "\nSpinning machine01...\n" );

    machine01.spinOnce();

    System.out.println();
    System.out.println( "Machine01 state:\t" + machine01 );
    System.out.println( "Machine02 state:\t" + machine02 );
    System.out.println();

    //test gamble-until-you-win mechanism
    System.out.println( "Preparing to spin until a mini win! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "WIN\n" );

    System.out.println( "Preparing to spin until...jackpot! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.jackpot() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "JACKPOT!\n" );
  }//end main
}//end class MySlots
