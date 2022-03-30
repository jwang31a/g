import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{
  ArrayList<PANCAKE> _stax;

  //pretty sure we don't need size instance var
  public ALStack() {
    _stax = new ArrayList();
  }

  public boolean isEmpty() {
    return (_stax.size() == 0);
  }

  public PANCAKE peekTop() {
    return _stax.get(_stax.size() - 1);
  }

  //prob could just return the output from that method
  public PANCAKE pop() {
    if (isEmpty()) {
      return null;
    }
    else {
      return _stax.remove(_stax.size() - 1);
    }
  }

  public void push(PANCAKE x) {
    _stax.add(x);
  }
}
