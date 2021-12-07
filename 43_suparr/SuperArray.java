/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW43 -- encapsulation (basic SuperArray functionality)
2021-12-07
Time Spent : 0.5 hours

DISCO:
You can modify values directly within superarrays by accessing its index.
Size needs to change along with the size of the array.
QCC:
How would we differentiate between empty values and a zero?
How would we implement left-justify?
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{
  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray

  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = _data.length;
  }

  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String str = "[";
    for (int a: _data){
      str += a + ",";
    }
    return str + "]";
  }

  //double capacity of SuperArray
  private void expand()
  {
    _size = _size * 2;
    int[] _data2 = new int[_size];
    for (int i = 0; i < _data.length; i ++){
      _data2[i] = _data[i];
    }
    _data = _data2;
    
  }
  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }

  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int i = _data[index];
    _data[index] = newVal;
    return i;
  }
  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()
}//end class
