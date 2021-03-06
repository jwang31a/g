// Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
// APCS PD6
// HW51 -- Dat Bubbly Tho
// 2022-01-04
// time spent: 0.5 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * We iterate through an array from right to left
   We compare the element at an index with the element at the previous index and swap if they are out of order (if element at previous index is bigger than element at current index)
   After this swap, we add 1 to a counter variable.
   We then repeat this with the next index, going down the array.
   After the first pass, we go through it again, and if there are no swaps (from counter), then the array is sorted, boolean variable for sorted set to true, break out of loop
   Depending on method, return AL or nothing.
 * DISCO
 * For ALs, the set method requires 2 parameters, the first one is for the index, and the second is for the element we want to set it to.
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: the array is sorted
 * q1: After pass p, what do you know?
 * a1: the first p elements of the array are in the right position (assuming iteration from right to left)
 * q2: How many passes are necessary to completely sort?
 * a2: the length of the array - 1 is the number of passes
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
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
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
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
    /* YOUR IMPLEMENTATION HERE */
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> copy = input;
    boolean measure = false;
    int swap = 0;
    while (measure == false){
      for (int i = copy.size() - 1; i > 0; i--) {
        if ((Integer)copy.get(i - 1) > (Integer)copy.get(i)) {
          Comparable temp = copy.get(i - 1);
          copy.set(i - 1, copy.get(i));
          copy.set(i, temp);
          swap += 1;
        }
      }
      if (swap == 0){
        measure = true;
      }
      swap = 0;
    }
    return copy;
  }


  public static void main( String [] args )
  {

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/

      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);
      System.out.println( "ArrayList glen2 before sorting:\n" + glen2 );
      ArrayList glenSorted = bubbleSort( glen2 );
      System.out.println( "sorted version of ArrayList glen2:\n"
      + glenSorted );
      System.out.println( "ArrayList glen2 after sorting:\n" + glen2 );

      ArrayList coco2 = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco2 before sorting:\n" + coco2 );
      ArrayList cocoSorted = bubbleSort( coco2 );
      System.out.println( "sorted version of ArrayList coco2:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco2 after sorting:\n" + coco2 );
      System.out.println( coco2 );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
