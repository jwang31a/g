public class Loops{
  public static void main(String[] args){
    power(2, 10);
    System.out.print("\n");
    factorial(10);
  }

  public static double power(double x, int n){
    double y = 1;
    if (n > 0){
      while (n > 0){
        y = y * x;
        n = n - 1;
      }
    } else if (n == 0){
      y = 1;
    } else{
        while (n < 0){
          y = y * x;
          n = n + 1;
        }
        y = 1 / y;
      }
    System.out.print(y);
    return(y);
  }

  public static int factorial(int x){
    int y = 1;
    int i;
    for (i = 1; i <= x; i = i + 1){
      y = y * i;
    }
    System.out.print(y);
    return(y);
  }
}
