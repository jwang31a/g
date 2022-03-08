/*
Team Benjamin: Jun Hong Wang, Brian Wang, Nicole Zhou
APCS pd6
HW71: Whut Dis?
2022-03-07
Time Spent: 0.5 hrs

DISCO:

QCC:
currently not sure what this method does
sometimes, it returns something that might make some sense, but other times, it seems to return gibberish
however, it seems like a will equal index of first element, b is index of last element, c is some point between the other 2 ints.

Could this be used for quicksort?
Quicksort uses pivot points, which c could be.
However, does quicksort rely on this algorithm? (Is this even a sort?)
*/

public class Mysterion {
  public static int[] mystery(int[] array, int a, int b, int c) {
    int v = array[c];
    swap(array, c, b);
    int s = a;
    for (int i = a; i < b; i++) {
      if (array[i] < v) {
        swap(array, s, i);
        s += 1;
      }
    }
    swap(array, b, s);
    return array;
  }

  public static void swap(int[] array, int a, int b) {
    int swap = array[a];
    array[a] = array[b];
    array[b] = swap;
  }

  public static void toString(int[] array) {
    String output = "";
    for (int i = 0; i < array.length; i++) {
      output += array[i] + ", ";
    }
    System.out.println(output);
  }

  public static void main(String[] args) {
    int[] array1 = {7,1,5,12,3};
    int[] array2 = {1,2,3,4,5};
    int[] array3 = {5,4,3,2,1};
    //array becomes 1,3,5,12,7
    toString(mystery(array1, 0, 4, 2));
    //order untouched
    toString(mystery(array2, 0, 4, 2));
    //array becomes 1.3,2,4,5
    toString(mystery(array3, 0, 4, 1));

    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    // run mystery on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
      System.out.println("arr1: ");
      toString(arr1);
      mystery(arr1,0,4,testC);
      System.out.println("after mystery w/ a=0,b=4,c="
      + testC +"...");
      toString(arr1);
      System.out.println("-----------------------");
      System.out.println("arr3:");
      toString(arr3);
      mystery(arr3,0,4,testC);
      System.out.println("after mystery w/ a=0,b=4,c="
      + testC +"...");
      toString(arr3);
      System.out.println("-----------------------");
      System.out.println("arr4:");
      toString(arr4);
      mystery(arr4,0,4,testC);
      System.out.println("after mystery w/ a=0,b=4,c="
      + testC +"...");
      toString(arr4);
      System.out.println("-----------------------");
      System.out.println("arr5:");
      toString(arr5);
      mystery(arr5,0,4,testC);
      System.out.println("after mystery w/ a=0,b=4,c="
      + testC +"...");
      toString(arr5);
      System.out.println("-----------------------");
    }
  }
}
