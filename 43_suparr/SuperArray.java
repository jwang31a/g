// Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
// APCS pd6
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07

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
    _size = 10;
  }

  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String output = "{";
    for (int i = 0; i < this._size; i++) {
      if (i == 0) {
        output += this._data[i];
      } else {
        output += "," + this._data[i];
      }
    }
    output += "}";
    return output;
  }

  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = _data;
    _data = new int[_size * 2];
    _size *= 2;
    //not sure if we need to copy old values over to expanded array, but there's code for it
    for (int i = 0; i < temp.length; i++) {
      _data[i] = temp[i];
    }
  }

  //accessor -- return value at specified index
  public int get( int index )
  {
    return this._data[index];
  }

  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = this._data[index];
    this._data[index] = newVal;
    return temp;
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
  }//end main()
}//end class
