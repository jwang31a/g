/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW49 -- Compliance
2021-12-23
Time Spent: 0.75 hours
DISCO:
We didn't need to implement interface comparable in the heading of class Rational.
QCC:
How can we deal with raising rationals to the power of?
How would we raise integers to the power of rationals?
*/

public class Rational {
  private int n, d;
  private double r;

  //constructors
  public Rational() {
    n = 0;
    d = 1;
    r = n / d;
  }

  public Rational(int p, int q) {
    this();
    if (q == 0) {
      n = 0;
      d = 1;
      System.out.println("Invalid denominator of 0, number's value set to 0/1.");
    } else {
      n = p;
      d = q;
    }
    r = (double)p / (double)q;
  }

  //old code from last hw
  public double floatValue() {
    return r;
  }

  public String toString() {
    String str = n + "/" + d;
    return str;
  }

  //two helper methods for multiply and divide
  public int getN() {
    return(n);
  }

  public int getD() {
    return(d);
  }

  public void multiply(Rational input) {
    n = n * input.getN();
    d = d * input.getD();
    r = n / d;
  }

  public void divide(Rational input) {
    if (input.getN() == 0 || n == 0) {
      System.out.println("Division by 0 error, invalid numerator");
    } else {
      n = n * input.getD();
      d = d * input.getN();
      r = n / d;
    }
  }
  //end of old code

  //beginning of new code

  public static int gcdER(int a, int b) {
     // If a is our bigger number and both a and b are bigger than 0, we take the smaller number (b) and the bigger number (a) minus the smaller one (b)
     if (a > b && b > 0){
        return gcdER(b, (a - b));
     // When b reaches 0, we return the other number (a)
     }else if(b == 0){
        return a;
     }
     // If a is our bigger number and both a and b are bigger than 0, we take the smaller number (b) and the bigger number (a) minus the smaller one (b)
     else if (a < b && a > 0){
        return gcdER(a, (b - a));
     // Then a will reach 0 first, so we return b.
     }else{
        return b;
     }
  }
  public void add(Rational r) {
    n = (this.n * r.d) + (this.d * r.n);
    d = this.d * r.d;
    this.r = (double)n / d;
  }

  public void subtract(Rational r) {
    n = (this.n * r.d) - (this.d * r.n);
    d = this.d * r.d;
    this.r = (double)n / d;
  }

  public int gcd() {
    int a = this.n;
    int b = this.d;
    int i = 0;

    //to find smaller number
    if (a == b) {
      i = a;
    } else if (a >= b) {
      i = b;
    } else if (b >= a) {
      i = a;
    }

    while ((a % i != 0) || (b % i != 0)) {
      i--;
    }
    return i;
  }

  public void reduce() {
    int g = this.gcd();
    this.n = this.n / g;
    this.d = this.d / g;
  }

  public int compareTo(Object input) {
    if (input instanceof Rational){
      Rational r = (Rational) input;
      return n * r.d - d * r.n;
    }
    throw new ClassCastException("\ncompareTo() input not a Rational");
  }

  public boolean equals(Object input){
    if (input instanceof Rational){
      Rational r = (Rational) input;
      if (n * r.d - d * r.n == 0){
        return true;
      }
    }
    return false;
  }
  //end of new code

  public static void main(String[] args) {
    Rational r = new Rational(2,3); //Stores the rational number 2/3
    Rational s = new Rational(1,2); //Stores the rational number 1/2
    Rational t = new Rational(4,18); //Stores the rational number 4/18
    Rational p = new Rational(6,9);
    r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
    System.out.println(r.toString());
    r.subtract(s);
    System.out.println(r.toString()); //should return 2/3, just not simplified yet
    r.reduce();
    System.out.println(r.toString());

    System.out.println("gcd is " + t.gcd());
    t.reduce(); //Changes t to 2/9
    System.out.println(t.toString());

    System.out.println("\n" + r.compareTo(s)); //0 means the numbers are (approximately) equal, 1 means r is bigger, -1 means s is bigger
    System.out.println("\n" + r.compareTo(p));
  }
}
