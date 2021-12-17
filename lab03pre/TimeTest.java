public class TimeTest {
  public static void main(String[] args) {
    long a = System.currentTimeMillis();
    System.out.println("epic games epic games epic games epic games");
    int qwer = 0;
    for (int i = 0; i < 50000; i++) {
      qwer += i;
    }
    System.out.println(qwer);
    long b = System.currentTimeMillis();
    long c = b - a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    //difference is only "1 millisecond" (or even sometimes 0?), but operation feels like it takes much longer than that.
    //using the same code, but instead of System.currentTimeMillis(), we can use System.nanoTime()
    //to get much more accurate time (4ms instead)
    long z = System.nanoTime();
    System.out.println("epic games epic games epic games epic games");
    int uiop = 0;
    for (int j = 0; j < 50000; j++) {
      uiop += j;
    }
    System.out.println(uiop);
    long y = System.nanoTime();
    long x = y - z;
    System.out.println(z);
    System.out.println(y);
    System.out.println((double)x/100000);
    //the discrepancy between the times told comes from the "granularity" of how your operating system measures time
    //for example, I use Windows 10, which does not measure time in ms, but rather every few ms.
    //let's say it measures every 5 ms
    //then 1 ms from currentTimeMillis() would actually be closer to 5 ms in runtime
  }
}
