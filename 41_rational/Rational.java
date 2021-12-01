/*
Team GammaRay: Jun Hong Wang + Bob, Jomin Zhang + Chompsky, Kevin Xiao + Mr. Swag
APCS pd6
HW41 -- Be Rational
2021-12-1
Time Spent: 0.6 hours

DISCO:
Division by zero errors popped up not only when we were trying to set up a new instance of Rational, but also when we tried to divide two numbers.
If the numerator of the input Rational was 0, then when we flipped the fraction, the denominator of the number would become zero.

QCC:
Is there any other way of accessing the numerator and denominator of Rational without using getValue() methods?
*/

public class Rational {
  private int n, d;
  private double r;

  public Rational() {
    n = 0;
    d = 1;
    r = n / d;
  }

  public Rational(int p, int q) {
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

  public static void main(String[] args) {
    //creation of two rational numbers (instances of class Rational), test calls to test methods
    Rational testing = new Rational(4, 0);
    Rational asdf = new Rational(16, 9);

    //to test out original values of asdf
    System.out.println(asdf.floatValue());
    System.out.println(asdf.toString());
    System.out.println(asdf.getN());
    System.out.println(asdf.getD());
    System.out.println(testing.getN());
    System.out.println(testing.getD());

    asdf.multiply(testing);
    //to test out values of asdf after multply and divide
    System.out.println(asdf.floatValue());
    System.out.println(asdf.toString());
    System.out.println(asdf.getN());
    System.out.println(asdf.getD());
    asdf.divide(testing);
    System.out.println(asdf.floatValue());
    System.out.println(asdf.toString());
    System.out.println(asdf.getN());
    System.out.println(asdf.getD());
  }
}
