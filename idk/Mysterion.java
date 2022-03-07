public class Mysterion {
  public void mystery(int[] array, int a, int b, int c) {
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
  }

  public static void swap(int[] array, int a, int b) {
    int swap = array[a];
    array[a] = array[b];
    array[b] = swap;
  }
}
