// Gnocchi: Hugo + Boary, Ryan + Jon, Brian + Vivian
// APCS pd6
// HW71: Whut Dis.
// 2022-03-08
// time spent: 1.0 hrs

public class Mysterion
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int partition(int[],int,int,int)
   * moves everything less than value at partitionIdx in the range [start, end]
   * to the left of the value and everything greater to thte right
   *
   * @param arr
   * @param start: has to be < arr.length
   * @param end: has to be > start and < arr.length
   * @param partitionIdx: has to be < arr.length
   * @return int: value at partitionIdx
   *
   */
  public static int partition( int[] arr, int start, int end, int partitionIdx)
  {
      int partitionValue = arr[partitionIdx];
      swap(partitionIdx, end, arr);
      int swaps = start;
      for (int i = start; i <= end - 1; i++ ) {
        if (arr[i] < partitionValue) {
          swap(swaps, i, arr);
          swaps++;
        }
      }
      swap(end, swaps, arr);
      return partitionValue;
  }//end partition
}//end class partition
