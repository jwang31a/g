/*
Team Gamma Ray: Kevin Xiao + Mr. Swag, Jun Hong Wang, Jomin Zhao
APCS
HW37: PPMP[]
2021-11-16
Time Spent: 0.5 hrs

DISCO: on other document
QCC:
*/
// I had to change everything to static for the method calls from main to work
public class Array2 {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int[] b = {1,3,5};
    int[] c = {1,2,3,13,5,7,13,56,7};
    System.out.println(countEvens(a));
    System.out.println(countEvens(b));
    System.out.println(bigDiff(a));
    System.out.println(centeredAverage(a));
    System.out.println(sum13(c));
  }

  //counts # of even ints
  public static int countEvens(int[] nums) {
    int counter = 0;
    for(int i = 0; i < nums.length; i ++){
      if (nums[i] % 2 == 0){
        counter += 1;
      }
    }
    return counter;
  }

  //given array length 1 or more, returns difference between largest and smallest values
  public static int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for (int i = 0; i < nums.length; i ++){
      if (nums[i] > max){
        max = nums[i];
      } else if(nums[i] < min) {
        min = nums[i];
      }
    }
    return max - min;
  }

  //returns centered average, or average without the largest and smallest values, using int division
  //pre: array length >= 3
  public static int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int counter = 0;
    for (int i = 0; i< nums.length; i ++){
      if (nums[i] > max){
        max = nums[i];
      } else if(nums[i] < min) {
        min = nums[i];
      }
      counter += nums[i];
    }
    return (counter - max - min)/ (nums.length -2) ;
  }

  //returns sum of all numbers in array, but 13 and the number immediately after it does not count toward the sum
  public static int sum13(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length; i ++){
      if (nums[i] == 13){
        i += 1;
      } else{
        counter += nums[i];
      }
    }
    return counter;
  }

  /* broken code right now
  //returns sum of numbers of array, except sections starting with 6 and ending with 7, returns 0 if no numbers
  //pre: every 6 will be followed by at least one 7
  public static int sum67(int[] nums) {
    int counter = 0;
    int index6 = 100;
    int index7 = 123123;
    for (int i = 0; i < nums.length; i ++){
      if (nums[i] == 6){
        index6 = i;
      } else if (nums[i] == 7){
        index7 = i;
      } else if (i < index6 || i > index7){
        counter += nums[i];
      }
    }
    return counter;
  }
  */
}
