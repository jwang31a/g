/***
 * class ALStack
 * Implements ADT Stack, generically typed.
 * Uses an ArrayList as underlying container.
 **/

import java.util.ArrayList;

public class ALStack<T> implements Stack<T>
{
  private ArrayList<T> _stack;

  //constructor
  public ALStack()
  {
    _stack = new ArrayList<T>();
  }


  //means of insertion
  public void push( T s )
  {
    _stack.add(s);
  }


  //means of viewing top element without removing
  public T peekTop( )
  {
    T retVal = null;
    if ( isEmpty() )  return null;
    retVal = _stack.get( _stack.size()-1 );
    return retVal;
  }


  //means of removal
  public T pop( )
  {
    T retVal = null;
    if ( isEmpty() )  return null;
    retVal = _stack.remove( _stack.size()-1 );
    return retVal;
  }


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stack.size() == 0;
  }
}//end class ALStack
