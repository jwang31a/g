//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW89 - Queue Two Ways
//2022-04-11m
//time spent: 0.7 hr
/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

/*
DISCO:

QCC:
We were thinking about generalizing the code, so that instead of using specifically LL or AL methods, we could just use List methods.
What does Queue by default actually use? (like if we imported a queue?)
It seems inefficient for us to add at index 0 every time for ALQueue, making enqueue a O(n) operation.
However, we don't see a way for us to implement ALQueue so that both enqueue and dequeue can be O(1).
*/

public interface Queue<DEEZNUTS>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public DEEZNUTS dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( DEEZNUTS x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public DEEZNUTS peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
