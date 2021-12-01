public class Rational {
  int n, d;
  float r;
  
  public Rational() {
    n = 0;
    d = 1;
    r = n / d;
  }
  
  public Rational(int p, int q) {
    n = p;
    d = q;
    r = p / q;
  }
  
  public float floatValue() {
    return r;
  }
  
  public String toString() {
    String str = p + "/" + q;
    return str;
  }
  
  /*
  multiply
  */
  
  public static void main(String[] args) {
  
  }
}
