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
    int[] array = a[0,a.length-2];
    if (a[a.length-1] == target){
      return a.length-1;
    }
    else {
      return linSearchR(array, target);
    }
  }

  public static void main(String[] args) {
    int[] a = new int[7];
    int[] apple = {1,2,3,4,5};
    System.out.println(stringify(arrayGen(a)));
    System.out.println(linSearch(apple, 3));
  }
}
