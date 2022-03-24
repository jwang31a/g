/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW55 -- Never Fear, Big Oh Is Here! (OrderedArrayList)
2021-1-11
Time Spent: 0.5 hours
DISCO:
We figured out that amorized means not always something, which applies to add, since there is a possibility for it to be O(n) instead of O(1).
QCC:
What are the time complexities of addBinary and addLinear?
*/

public class OrderedArrayList {
  public OrderedArrayList()
  {
    _data = new int[10];
    _size = 0;
  }

  //output SuperArray in [a,b,c] format
  //O(n), there is no best/worst case scenario, since it will have to iterate through the array once to get all the values
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  //double capacity of SuperArray
  //O(n), because it has to iterate through the array once, copying the items
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }

  //accessor -- return value at specified index
  //O(1), since it doesn't matter what the index is, it'll take the same amount of time regardless
  public int get( int index )
  {
    return _data[index];
  }

  //mutator -- set value at index to newVal,
  //           return old value at index
  //O(1), since it only sets the value at an index to a new value
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    if (index > _size - 1){
      _size ++;
    }
    return temp;
  }

  //adds an item after the last item
  //O(1) in best case, if there is enough space for new elements
  //O(n) in worst case, since if there isn't enough space, we will need to use expand(), which is an O(n) time operation
  public void add( int newVal )
  {
    if(_size == _data.length){
      expand();
    }
    _data[_size] = newVal;
    _size += 1;
  }

  //inserts an item at index
  //O(n), since it will add at that index, then copy the values after that index to shift the rest of the array to the right
  public void add( int index, int newVal )
  {
    if (_size == _data.length){
      expand();
    }
    for (int i = _size; i > index; i --){
      _data[i] = _data[i-1];
    }
    _data[index] = newVal;
    _size += 1;
  }

  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  //O(n), since it will remove the index, then copy over the values after that index to shift the rest of the array to the left
  public void remove( int index )
  {
    for (int i = index+1; i < _size; i ++){
      _data[i-1] = _data[i];
    }
    _size -= 1;
  }

  //return number of meaningful items in _data
  //O(1), since it only has to return the size
  public int size()
  {
    return _size;
  }
}
