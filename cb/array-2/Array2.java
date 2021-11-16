/*
Team Gamma Ray: Kevin Xiao + Mr. Swag, Jun Hong Wang, Jomin Zhao
APCS
HW37: PPMP[]
2021-11-16
Time Spent: 0.5 hrs

DISCO:

QCC:
*/

// I had to change everything to static for the method calls from main to work

public class Array2 {
  public static void main(String[] args) {

  }

  public int countEvens(int[] nums) {
    int counter = 0;
    for(int i = 0; i < nums.length; i ++){
      if (nums[i] % 2 == 0){
        counter += 1;
      }
    }
    return counter;
  }

  public int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for (int i = 0; i< nums.length; i ++){
      if (nums[i] > max){
        max = nums[i];
      } else if(nums[i] < min) {
        min = nums[i];
      }
    }
    return max - min;
  }

  public int centeredAverage(int[] nums) {
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

  /* broken code right now
  public int sum67(int[] nums) {
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
