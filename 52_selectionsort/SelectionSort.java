// Team Deltamath: Kevin Xiao + Mr. Swag, Jun Hong Wang + Bob
// APCS pd6
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: 0.5 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 * We search for the smallest value available, then swap it with the place that it's supposed to be in.
   So on swap 1, we swap the smallest element to position 1.
   On swap 2, we swap the next smallest element to position 2, etc.
   After length-1 swaps, everything is sorted, and we can stop sorting. 
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?(  ) {(  ) {
 * a0:
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
 * q1: What do you know after pass p?
 * a1: We know that p elements of the array are in the correct spot.
 * q2: How do you know if sorted?
 * a2: If we swap length-1 times, all the elements are guaranteed to be in the correct position, so it would be swapped.
 * q3: What does a pass boil down to?
 * a3: It's a search, then a swap.
       Not sure what else happens other than these 2 things.
 ******************************/

import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
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
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order(  ) {


  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    boolean hit = false;
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = data.size()-1;
    int pass = data.size()-1;
    for(int i = 0; i < data.size()-1; i++  ) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag


      for(int n = 0; n <= pass;n++  ) {
        if ((Integer)data.get(n) > (Integer)data.get(maxPos)){
          maxPos = n;
         hit = true;
        }
      }
      if (hit == true){
         Comparable temp = data.get(maxPos);
         data.set(maxPos, data.get(pass));
         data.set(pass, temp);
      }
       pass -= 1;
       hit = false;
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
       maxPos = pass;

      System.out.println( "after swap: " +  data );//diag
    }
  }


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );

    /*===============for VOID methods=============
      ============================================*/


      ArrayList glen1 = new ArrayList<Integer>();
      glen1.add(7);
      glen1.add(1);
      glen1.add(5);
      glen1.add(12);
      glen1.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen1 );
      ArrayList glenSorted = selectionSort( glen1 );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen1 );
      ArrayList coco1 = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco1 );
      ArrayList cocoSorted = selectionSort( coco1 );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco1 );
      System.out.println( coco1 );
          /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
