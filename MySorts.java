import java.util.ArrayList;

public class MySorts {
  //vanilla bubble sort without early exit functionality/optimization
  /*

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
