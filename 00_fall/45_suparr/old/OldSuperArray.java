/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW 45- Array of Titanium
2021-12-09
Time Spent : 0.0 hours

DISCO:
An interface in Java is just a collection of abstract methods, or methods without a body.
We still have to follow Java conventions, so after the declaration of a method, we have put semicolons.
In another class, that class can implement those methods, meaning that it will take those methods and fill out the body.

QCC:
Why were interfaces made?
Of course they serve the purpose of making inheritance easier, but are there any other reasons?
*/

public class OldSuperArray implements OldListInt {
  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray

  //default constructor – initializes 10-item array
  public OldSuperArray() {
    _data = new int[10];
    _size = 0;
  }

  //output SuperArray in [a,b,c] format
  public String toString() {
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
  private void expand() {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }

  //accessor -- return value at specified index
  public int get( int index ) {
    return _data[index];
  }

  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal ) {
    int temp = _data[index];
    _data[index] = newVal;
    if (index > _size - 1){
      _size ++;
    }
    return temp;
  }

  //adds an item after the last item
  public void add( int newVal ) {
    if(_size == _data.length){
      expand();
    }
    _data[_size] = newVal;
    _size += 1;
  }

  //inserts an item at index
  public void add( int index, int newVal ) {
    if (index >= _size) {
      System.out.println("Index value greater than size of array, no change to array.");
    } else {
      if (_size == _data.length){
        expand();
      }
      for (int i = _size; i > index; i --){
        _data[i] = _data[i-1];
      }
      _data[index] = newVal;
      _size++;
    }
  }

  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index ) {
    for (int i = index+1; i < _size; i ++){
      _data[i-1] = _data[i];
    }
    _size -= 1;
  }

  //return number of meaningful items in _data
  public int size() {
    return _size;
  }

  //main method for testing
  public static void main( String[] args ) {
    OldSuperArray testing = new OldSuperArray();

    //testing add() method
    System.out.println("add method testing");
    for (int i = 0; i < 6; i++) {
      testing.add(i);
    }
    System.out.println(testing);

    //testing add-at-index method
    System.out.println("\n" + "add-at-index method testing");
    for (int i = 1; i < 5; i++) {
      testing.add(i, i * 100);
      System.out.println(testing);
    }

    //testing remove
    System.out.println("\n" + "remove method testing");
    testing.remove(3);
    System.out.println(testing);
    testing.remove(3);
    System.out.println(testing);
    testing.remove(3);

    System.out.println("\n" + "size of array is " + testing.size());
  }//end main()
}//end class
