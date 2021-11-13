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
    int[] array = new int[a.length - 2];
    if (a[a.length-1] == target){
      return a.length-1;
    }
    else {
      for (int i = 1; i <= a.length -2; i++) {
        array[i] = a[i];
      }
      return linSearchR(array, target);
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

  /*
  under construction
  public static int freqR(int[] a, int target) {
    int count = 0;
    if (a[i] == target) {
      count++;
    }
    return(count);
  }
  */

  public static void main(String[] args) {
    int[] a = new int[7];
    int[] apple = {1,2,3,4,5,4,5,2,3,4,1,3};
    System.out.println(stringify(arrayGen(a)));
    System.out.println(linSearch(apple, 3));
    System.out.println(linSearchR(apple, 3));
    System.out.println(freq(apple, 4));
  }
}
