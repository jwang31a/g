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

  /*
  under construction
  public static int linSearchR(int[] a, int target) {
    int[] array = new int[a.length - 2];
    if (a[0] == target) {
      return
    }
  }
  */

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
    int[] apple = {1,2,4,5,3,6,7,2,1};
    System.out.println(stringify(arrayGen(a)));
    System.out.println(linSearch(apple, 3));
    //System.out.println(linSearchR(apple, 5));
    System.out.println(freq(apple, 4));
  }
}
