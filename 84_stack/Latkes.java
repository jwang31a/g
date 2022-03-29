//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW83 - Stacks on Stacks
//2022-03-28
//time spent: 0.8h

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO

    QCC
    Should the stack expand when an element is added when the stack is full?
    (so something like how ArrayLists automatically expand if we try to add something when list is full)
 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    if (!isFull()) {
      _stack[_stackSize] = s;
    } else if (isFull()) {
      String[] newStack = new String[_stack.length * 2];
      for (int i = 0; i < _stack.length; i++) {
        newStack[i] = _stack[i];
      }
      newStack[_stackSize] = s;
      _stack = newStack;
    }
    _stackSize++;
    return;
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(1)


  //means of removal
  public String pop( )
  {
    if (!isEmpty()) {
      String ret = _stack[_stackSize - 1];
      _stack[_stackSize - 1] = null;
      _stackSize--;
      return ret;
    }
    return null;
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(n)


  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return (_stackSize == _stack.length);
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(12);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");
    tastyStack.push("extra");
    tastyStack.push("latkes");
    tastyStack.push("pushin");
    for (int i = 0; i < tastyStack._stackSize; i++) {
      System.out.println(tastyStack._stack[i]);
    }

    System.out.println("\nnow popping\n");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
