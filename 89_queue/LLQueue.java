import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LLQueue<DEEZNUTS> implements Queue<DEEZNUTS> {
  private LinkedList<DEEZNUTS> _deez;

  public LLQueue() {
    _deez = new LinkedList<DEEZNUTS>();
  }

  public DEEZNUTS dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    DEEZNUTS retVal = (DEEZNUTS)_deez.getLast();
    _deez.removeLast();
    return retVal;
  }

  public void enqueue(DEEZNUTS x) {
    _deez.add(0, x);
  }

  public boolean isEmpty() {
    return _deez.getFirst().equals(null);
  }

  public DEEZNUTS peekFront() {
    return (DEEZNUTS)_deez.getLast();
  }

  //main method with test cases, same as the ones in alqueue, should be the same output
  public static void main(String[] args) {
    LLQueue<String> nuts = new LLQueue();

    //these all output peanuts, expected output
    nuts.enqueue("peanuts");
    System.out.println(nuts.peekFront());
    nuts.enqueue("almonds");
    System.out.println(nuts.peekFront());
    nuts.enqueue("pistachios");
    System.out.println(nuts.peekFront());
    nuts.enqueue("cashews");
    System.out.println(nuts.peekFront());
    nuts.enqueue("hazelnuts");
    System.out.println(nuts.peekFront() + "\n");

    //peanuts
    System.out.println(nuts.dequeue());
    //almonds
    System.out.println(nuts.dequeue());
    //pistachios
    System.out.println(nuts.dequeue());
    //cashews
    System.out.println(nuts.dequeue());
    //hazelnuts
    System.out.println(nuts.dequeue());
  }
}
