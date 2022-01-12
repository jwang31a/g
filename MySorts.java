import java.util.ArrayList;

public class MySorts {
  //vanilla bubble sort without early exit functionality/optimization
  /*
  The vanilla bubble sort does not have an early exit boolean/counter that allows it to stop sorting once we know things are sorted.
  After length - 1 passes in bubble sort, all the elements are guaranteed to be sorted, which is why we only iterate through the array that many times.
  This algorithm starts at one end, and will iterate over to the other end.
  Bubble sort will compare two adjacent elements in the AL, then move the elements if they are out of order.
  This way, for every p passes, p elements are in the right place.
  It will then iterate through the array again, comparing and swapping if necessary, until it reaches the end of the first loop.
  */
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for (int i = 0; i < data.size(); i++){
      for (int j = data.size() - 1; j > 0; j--) {
        if ((Integer)data.get(j - 1) > (Integer)data.get(i)) {
          Comparable temp = data.get(j - 1);
          data.set(j - 1, data.get(j));
          data.set(j, temp);
        }
      }
    }
  }

  //non vanilla bubble sort with early exit functionality/optimization built in
  /*
  This works in the same way as the vanilla bubble sort, but it has two extra variables inside the method.
  The first one is a boolean that will be default set to false, and will tell us if the AL is sorted or not, which is used a while loop.
  The way we know that the array is sorted is by using an int counter that will tell us the amount of swaps that happened during a pass.
  If that number is 0, then no elements are out of place, the AL is sorted, and we can exit early.
  */
  public static void bubbleSortNV( ArrayList<Comparable> data )
  {
    boolean measure = false;
    int swap = 0;
    while (measure == false){
      for (int i = data.size() - 1; i > 0; i--) {
        if ((Integer)data.get(i - 1) > (Integer)data.get(i)) {
          Comparable temp = data.get(i - 1);
          data.set(i - 1, data.get(i));
          data.set(i, temp);
          swap += 1;
        }
      }
      if (swap == 0){
        measure = true;
      }
      swap = 0;
    }
  }

  /*
  Selection sort will have two partitions (areas): a sorted one and an unsorted one.
  At the beginning, that partition size is 0, meaning that no elements are guaranteed to be in the right place.
  Selection sort will iterate through the array, comparing adjacent elements, to find the smallest remaining element in the unsorted partition.
  It will then swap that smallest element with the element in the index that it's supposed to be in.
  The partition size will be increased by 1, and all further additions to the sorted partition will be added to the left/right of that partition, depending on which way we iterate through the array.
  In our sort, we iterate left to right, so the elements are placed on the right of the sorted partition.
  We iterate through the whole array once, since after length - 1 passes, all the elements are guaranteed to be sorted.
  */
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    boolean hit = false;
    int swaps = 0;
    int comp = 0;
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = data.size()-1;
    int pass = data.size()-1;
    int passes = 0;
    for(int i = 0; i < data.size()-1; i++  ) {
      for(int n = 0; n <= pass;n++  ) {
        if ((Integer)data.get(n) >= (Integer)data.get(maxPos)){
          maxPos = n;
         hit = true;
        }
      }
      if (hit == true){
         Comparable temp = data.get(maxPos);
         data.set(maxPos, data.get(pass));
         data.set(pass, temp);
         swaps += 1;
      }
       pass -= 1;
       hit = false;
       maxPos = pass;
       comp += 1;
       passes += 1;
    }
      System.out.println("Comparisons made:" + comp);
      System.out.println("Swaps made:" + swaps);
      System.out.println("Passes made:" + passes);
  }

  /*
  In insertion sort, there is a partition that will be set to 1 by default.
  This means that the first element of the AL will be assumed to be sorted.
  It will compare the first unsorted element to the elements in the sorted partition, and when it finds an element that it is greater than, it will insert (swap) that element to that place.
  The partition size will be increased by 1, and it will repeat those steps of comparing and swapping.
  We iterate through the whole array once, since after length passes, all the elements are guaranteed to be sorted. 
  */
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    boolean sorted = false;
    int comp = 0;
    int swaps = 0;
    int passes = 0;
    for(int in = 0; in < data.size(); in++  ) {
      //partition marks first item in unsorted region
      int partition = in;
      //traverse sorted region from right to left
      for( int i = in + 1; i > 0; i-- ) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (i == data.size()) {
          break;
        }
        else if ( (Integer)data.get(i) < (Integer)data.get(i - 1)) {
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i -1, temp);
          swaps += 1;
        }
        comp += 1;
      }
      passes += 1;
    }
      System.out.println("Comparisons made:" + comp);
      System.out.println("Swaps made:" + swaps);
      System.out.println("Passes made:" + passes);
  }
}
