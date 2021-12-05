/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW42 -- Be More Rational
2021-12-4
Time Spent:  hours

DISCO:

QCC:

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

  //doesn't work, missing return statement, not sure what's happening here
  //i'm thinking it could be something related to floating-point numbers and figuring out which is larger
  public int compareTo(Rational input) {
    if (this.r == input.r) {
      return 0;
    } else if (this.r < input.r) {
      return 1;
    } else if (this.r > input.r) {
      return -1;
    }
  }
  //end of new code

  public static void main(String[] args) {
    //test cases copied from hw website
    Rational r = new Rational(2,3); //Stores the rational number 2/3
    Rational s = new Rational(1,2); //Stores the rational number 1/2
    Rational t = new Rational(4,18); //Stores the rational number 4/18
    r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
    System.out.println(r.toString());
    r.subtract(s);
    System.out.println(r.toString()); //should return 2/3, just not simplified yet
    r.reduce();
    System.out.println(r.toString());

    System.out.println("gcd is " + t.gcd());
    t.reduce(); //Changes t to 2/9
    System.out.println(t.toString());

    //System.out.println("\n" + r.compareTo(s));
  }
}
