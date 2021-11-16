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

  public static boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length-1] == 6;
  }

  public static boolean sameFirstLast(int[] nums) {
    return nums.length >= 1 && nums[0] == nums[nums.length-1];
  }

  public static int[] makePi() {
    int[] makePi = {3,1,4};
    return makePi;
  }

  public static boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
  }

  public static int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
  }

  public static int[] rotateLeft3(int[] nums) {
    int a = nums[0];
    int b = nums[1];
    int c = nums[2];
    nums[0] = b;
    nums[1] = c;
    nums[2] = a;
    return nums;
  }

  public static int[] reverse3(int[] nums) {
    int a = nums[0];
    int b = nums[1];
    int c = nums[2];
    nums[0] = c;
    nums[1] = b;
    nums[2] = a;
    return nums;
  }

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

  public static int sum2(int[] nums) {
    if (nums.length >= 2){
      return nums[0] + nums[1];
    } else if (nums.length == 1){
      return nums[0];
    } else{
      return 0;
    }
  }

  public static int[] middleWay(int[] a, int[] b) {
    int[] array = {a[1], b[1]};
    return array;
  }

  public static int[] makeEnds(int[] nums) {
    int[] array = {nums[0], nums[nums.length-1]};
    return array;
  }

  public static boolean has23(int[] nums) {
    return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
  }

  public static boolean no23(int[] nums) {
    return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
  }

  public static int[] makeLast(int[] nums) {
    int[] array = new int[nums.length * 2];
    array[array.length-1] = nums[nums.length-1];
    return array;
  }

  public static boolean double23(int[] a) {
    if (a.length > 1){
      return (a[0] == 2 && a[1] == 2) || (a[0] == 3 && a[1] == 3);
    } else{
      return false;
    }
  }
}
