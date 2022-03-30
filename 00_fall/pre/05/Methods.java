public class Methods {
  public static boolean isDivisible(int n, int m){
    if (n%m == 0){
      return true;
    } else{
      return false;
    }
  }

  public static boolean isTriangle(int a, int b, int c){
    if ((a + b) > c){
      if ((b + c) > a){
        if ((c + a) > b){
          return true;
        } else{
          return false;
        }
      } else{
        return false;
      }
    } else{
      return false;
    }
  }

  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    } else if (m > 0 && n == 0){
      return ack(m - 1, 1);
    } else if (m > 0 && n > 0){
      return ack(m-1, ack(m, n-1));
    }
    return ack(m,n);
  }

  public static void main(String[] args){
    System.out.println(isDivisible(16, 2));
    System.out.println(isTriangle(16,4,5));
    System.out.println(ack(2,1));
  }
}
