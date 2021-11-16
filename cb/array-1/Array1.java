/*
Team Gamma Ray: Kevin Xiao + Mr. Swag, Jun Hong Wang, Jomin Zhao
APCS
HW37: PPMP[]
2021-11-16
Time Spent: 0.5 hrs

DISCO:
While putting test calls in the main method, I found that we can't put arrays like {1,2,6} as an argument.

QCC:
Why can't we put arrays of that format as an argument for methods?
Instead, I have to make a variable with the array in it for it to work, otherwise it returns "illegal start of expression".

*/

// I had to change everything to static for the method calls from main to work

public class Array1 {
  public static void main(String[] args) {

  }

  //true if 6 appears as first or last element, pre: array length >= 1
  public static boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length-1] == 6;
  }

  //true if array length >= 1 and first and last element are equal
  public static boolean sameFirstLast(int[] nums) {
    return nums.length >= 1 && nums[0] == nums[nums.length-1];
  }

  //creates array with first 3 digits of pi
  public static int[] makePi() {
    int[] makePi = {3,1,4};
    return makePi;
  }

  //2 arrays, a and b, true if they have same first or last element, pre: array lengths >= 1
  public static boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
  }

  //returns sum of all elements in array of length 3
  public static int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
  }

  //array of ints length 3, array is rotated left, {1,2,3} becomes {2,3,1}
  public static int[] rotateLeft3(int[] nums) {
    int a = nums[0];
    int b = nums[1];
    int c = nums[2];
    nums[0] = b;
    nums[1] = c;
    nums[2] = a;
    return nums;
  }

  //reverses the order of elements in array
  public static int[] reverse3(int[] nums) {
    int a = nums[0];
    int b = nums[1];
    int c = nums[2];
    nums[0] = c;
    nums[1] = b;
    nums[2] = a;
    return nums;
  }

  //finds larger of first or last element, all other elements set to the larger value
  public static int[] maxEnd3(int[] nums) {
    int a = nums[0];
    int b = nums[2];
    if (nums[0] > nums[2]){
      nums[1] = a;
      nums[2] = a;
    } else {
      nums[0] = b;
      nums[1] = b;
    }
    return nums;
  }

  //returns sum of first 2 elements of array, if array length is less than 2, sum up existing elements, if length is 0, returns 0
  public static int sum2(int[] nums) {
    if (nums.length >= 2){
      return nums[0] + nums[1];
    } else if (nums.length == 1){
      return nums[0];
    } else{
      return 0;
    }
  }

  //given 2 int arrays of length 3, returns array of length 2 with middle elements of the 2 arrays
  public static int[] middleWay(int[] a, int[] b) {
    int[] array = {a[1], b[1]};
    return array;
  }

  //given int array, returns new array of length 2 with first and last elements from original array, pre: original array length >= 1
  public static int[] makeEnds(int[] nums) {
    int[] array = {nums[0], nums[nums.length-1]};
    return array;
  }

  //int array length 2, true if it contains 2 or 3
  public static boolean has23(int[] nums) {
    return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
  }

  //given int array length 2, true if doesn't contain 2 or 3
  public static boolean no23(int[] nums) {
    return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
  }

  //returns new array with double original array length, all values are 0 except last one, which will have same value as last element in original
  //pre: original array length >= 1
  public static int[] makeLast(int[] nums) {
    int[] array = new int[nums.length * 2];
    array[array.length-1] = nums[nums.length-1];
    return array;
  }

  //true if array contains 2 or 3 twice
  //pre: length is 0, 1, 2
  public static boolean double23(int[] a) {
    if (a.length > 1){
      return (a[0] == 2 && a[1] == 2) || (a[0] == 3 && a[1] == 3);
    } else{
      return false;
    }
  }
}
