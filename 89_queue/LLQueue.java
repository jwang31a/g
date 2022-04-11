import java.util.LinkedList;

public class LLQueue<DEEZNUTS> implements Queue<DEEZNUTS> {
  private LinkedList<DEEZNUTS> deez;
  private LLNode<DEEZNUTS> _head;
  private LLNode<DEEZNUTS> _tail;

  public LLQueue() {
    _head = _tail = null;
    deez = new LinkedList<DEEZNUTS>(null, null);
  }

  public DEEZNUTS dequeue() {
    DEEZNUTS retVal = (DEEZNUTS)_head.getCargo();
    _head = _head.getNext();
    return retVal;
  }

  public void enqueue(DEEZNUTS x) {
    _tail.setNext(new LLNode<DEEZNUTS>(x,null));
  }

  public boolean isEmpty() {
    return _head.equals(null);
  }

  public DEEZNUTS peekFront() {
    return (DEEZNUTS)_head.getCargo();
  }
}
