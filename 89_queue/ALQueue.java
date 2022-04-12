import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ALQueue<DEEZNUTS> implements Queue<DEEZNUTS> {
  private ArrayList<DEEZNUTS> _deez;

  public ALQueue() {
    _deez = new ArrayList<DEEZNUTS>();
  }

  public DEEZNUTS dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    DEEZNUTS retVal = (DEEZNUTS)_deez.remove(_deez.size() - 1);
    return retVal;
  }

  public void enqueue(DEEZNUTS x) {
    _deez.add(0, x);
  }

  public boolean isEmpty() {
    return (_deez.size() == 0);
  }

  public DEEZNUTS peekFront() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    DEEZNUTS retVal = (DEEZNUTS)_deez.get(_deez.size() - 1);
    return retVal;
  }

  //main method with test cases, same as the ones in llqueue, should be the same output
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
