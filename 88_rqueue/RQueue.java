//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW88 - BPC Kiddies Do Not Wait in Line Either
//2022-04-03m
//time spent: 0.75 hr
/*
DISCO:
Sample only needs to randomize the fornt as that is the only thing ever being removed form the Queue
QCC:
What are the practical uses for an RQueue?
*/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    sample();
    SWASHBUCKLE retVal = _front.getCargo();
    _front = _front.getNext();

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;
  }//O(1)


  public SWASHBUCKLE peekFront()
  {
    sample();
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   1) Choose random LLNode in the queue
   *   2) Swap its cargo with that of the front LLNode
   **/
  public void sample ()
  {
    LLNode<SWASHBUCKLE> temp = _front;
    //for (int i = 0; i < _size; i++) {
    temp = _front;
    int rand = (int)(Math.random() * _size);
    for (int p = 0; p < rand; p++) {
      temp = temp.getNext();
    }
    SWASHBUCKLE movingVal = temp.getCargo();
    SWASHBUCKLE frontVal = _front.getCargo();
    temp.setCargo(frontVal);
    _front.setCargo(movingVal);
    //}
  }//O(n)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String foo = "";
    LLNode<SWASHBUCKLE> tmp = _front;
    while ( tmp != null ) {
      foo += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    return foo;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {


    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
