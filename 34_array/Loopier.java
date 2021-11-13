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
    int index = a.length - 1;
    int[] array = new int[a.length - 1];
    if (a[a.length-1] != target && a.length > 1) {
      for (int i = array.length-1; i >0; i-=1){
        array[i] = a[i];
      }
      return linSearchR(array, target);
    } else if (a[a.length-1] == target){
      for (int i = array.length-1; i >0; i-=1){
        array[i] = a[i];
      }
      return linSearchR(array, target);
    } else if (index >= 0){
      return index;
    } else {
      return -1;
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

  public static int[] freqR(int[] a, int target) {
    int[] array = new int[a.length - 1];

    for (int i = 0; i <= array.length - 1; i++) {
      array[array.length - (1 + i)] = a[i];
    }
    return array;

    //if (a[a.length - 1] == target) {

    //}
  }


  public static void main(String[] args) {
    int[] a = new int[7];
    int[] apple = {1,2,4,5,3,6,7,2,1};
    System.out.println(stringify(arrayGen(a)));
    System.out.println(linSearch(apple, 3));
    System.out.println(linSearchR(apple, 5));
    System.out.println(freq(apple, 4));
    System.out.println(stringify(freqR(apple, 4)));
  }
}
