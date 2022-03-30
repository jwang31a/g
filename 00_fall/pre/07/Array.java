import java.util.Arrays;

public class Array{
  public static void main(String[] args){
    double[] a = new double[5];
    a[0] = 1.1;
    a[1] = 2.2;
    a[2] = 3.3;
    a[3] = 4.4;
    a[4] = 5.5;
    powArray(a);
  }

  public static double[] powArray(double[] a){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++){
      b[i] = a[i] * a[i];
    }
    System.out.print(Arrays.toString(b));
    return(b);
  }
}
