import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {
  LinkedList<PANCAKE> _stax;

  public LLStack() {
    _stax = new LinkedList();
  }

  public boolean isEmpty() {
    return (_stax.size() == 0);
  }

  public PANCAKE peekTop() {
    return _stax.getLast();
  }

  public PANCAKE pop() {
    if (isEmpty()) {
      return null;
    } else {
      return _stax.removeLast();
    }
  }

  public void push(PANCAKE x) {
    _stax.add(x);
  }
}
