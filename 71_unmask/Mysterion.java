/*
Team Benjamin: Jun Hong Wang, Brian Wang, Nicole Zhou
APCS pd6
HW71: Whut Dis?
2022-03-07
Time Spent:  hrs

DISCO:

QCC:
currently not sure what this method does
sometimes, it returns something that might make some sense, but other times, it seems to return gibberish
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
  }
}
