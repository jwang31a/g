/*
NIWWD: Kevin Xiao + Mr. Swag, Jun Hong Wang, Jomin Zhao
APCS
HW35
2021-11-15
time spent: 
*/
/*
DISCO:

QCC:

*/
public class Loopier {
  public static int[] arrayGen(int[] a) {
    for (int i = 0; i <= a.length - 1; i++) {
      a[i] = (int)(Math.random() * 100);
    }
    return a;
  }

  public static String stringify(int[] a) {
    String str = "";
    for (int i = 0; i <= a.length - 1; i++) {
      if (i != a.length - 1) {
        str += a[i] + ",";
      } else {
        str += a[i];
      }
    }
    return str;
  }

  public static int linSearch(int[] a, int target) {
    for (int i = 0; i <= a.length - 1; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }
  public static int linSearchR(int[] a, int target) {
      return helper(a, target, false,1);
  }
  public static int helper(int[] a, int target, boolean condition,int counter){
      if (a.length > 1 && condition == false){
        int[] array = new int[a.length-1];
          for (int i = 0; i < array.length-1 ; i+=1){
            array[i] = a[i+1];
          }
        if (a[0] != target && a.length > 2) {
          return helper(array,target,false, counter += 1) + 1;
        } else if (a[0] == target){
          return helper(array,target,true, counter);
        } else{
          return helper(array,target,false,counter);
        }
      } else if (a.length <= 1 && condition == false){
        return -counter;
      } else{
        return 0;
      }
  }
  

  public static int freq(int[] a, int target) {
    int count = 0;
    for (int i = 0; i <= a.length - 1; i++) {
      if (a[i] == target) {
        count++;
      }
    }
    return count;
  }

  public static int freqR(int[] a, int target) {
    if (a.length > 0){
      int[] array = new int[a.length-1];
        for (int i = array.length-1; i > 0; i-=1){
          array[i] = a[i];
        }
      if (a[a.length-1] == target) {
        return freqR(array, target) + 1;
      } else {
        return freqR(array,target);
      }
    } else{
      return 0;
    }
  }


  public static void main(String[] args) {
    int[] a = new int[7];
    int[] apple = {1,2,4,5,3,6,7,2,2,2,2,2};
    int[] banana = {1,2,3,4,5};
    System.out.println(stringify(arrayGen(a)));
    System.out.println(linSearch(apple, 3));
    System.out.println(linSearchR(apple, 5));
    System.out.println(linSearchR(apple, 8));
    System.out.println(linSearchR(banana, 6));
    System.out.println(linSearchR(apple, 1));
    System.out.println(freqR(apple, 5));
    System.out.println(freqR(apple, 2));
    System.out.println(freqR(banana, 6));
    System.out.println(freq(apple, 4));
  }
}
