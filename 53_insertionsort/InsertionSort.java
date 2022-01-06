// Team Deltamath: Kevin Xiao + Mr. Swag, Jun Hong Wang + Bob
// APCS pd6
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent:  hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * We assume that the first element is "sorted".
   There is a partition right after that element, and everything to the left of it is considered sorted.
   We look at the next unsorted element (leftmost element outside of partition), and compare it with the rightmost element of the sorted partition, and swap if it is less than it.
   We repeat that step, and once that element is greater than the element we are comparing it to, it is considred sorted, and we increase the partition size by 1.
   We repeat the last 2 steps, until we iterate through all of the unsorted elements.
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: length-1 passes
 * q1: What do you know after pass p?
 * a1: It's not guaranteed that p elements are sorted, like in the two sorting algorithms.
       However, p elements will be in ascending order.
 * q2: How will you know when sorted?
 * a2: After we iterate through all the elements in the array, comparing and swapping it accordingly.
 * q3: What constitues a pass?
 * a3: One pass will consist of comparisons and swaps.
 * q4: What must you track?
 * a4: The partition size, as well as the element that we are moving.
 ******************************/

import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    boolean sorted = false;
    for(int in = 0; in < data.size(); in++  ) {
      //partition marks first item in unsorted region
      int partition = in;
      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i = in + 1; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (i == data.size()) {
          break;
        }
        else if ( (Integer)data.get(i) < (Integer)data.get(i - 1)) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i -1, temp);
        }
        else
          break;
      }

    }
  }//end insertionSortV

  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

  public static void main( String [] args )
  {
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/

      System.out.println( "*** Testing non-void version... *** " );
      ArrayList glen1 = new ArrayList<Integer>();
      glen1.add(7);
      glen1.add(1);
      glen1.add(5);
      glen1.add(12);
      glen1.add(3);
      System.out.println( "\nArrayList glen1 before sorting:\n" + glen1 );
      ArrayList glenSorted = insertionSort( glen1 );
      System.out.println( "\nsorted version of ArrayList glen1:\n"
      + glenSorted );
      System.out.println( "\nArrayList glen1 after sorting:\n" + glen1 );

      ArrayList coco1 = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco1 before sorting:\n" + coco1 );
      ArrayList cocoSorted = insertionSort( coco1 );
      System.out.println( "\nsorted version of ArrayList coco1:\n"
      + cocoSorted );
      System.out.println( "\nArrayList coco1 after sorting:\n" + coco1 );
      System.out.println( coco1 );
      /*==========for AL-returning methods==========
      ============================================*/
  }//end main
}//end class InsertionSort
