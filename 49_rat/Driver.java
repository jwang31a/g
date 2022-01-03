public class Driver{
  public static void main(String[] args){
    Rational x = new Rational(1,2);
    Rational y = new Rational(2,4);
    Rational z = new Rational(1,3);
    Rational negative = new Rational(-1,3);
    Integer w = 12;
    System.out.println(negative.compareTo(x));
    System.out.println(x.compareTo(negative));
    System.out.println(x.compareTo(y)); // Equal
    System.out.println(y.compareTo(z));
    System.out.println(z.compareTo(y));
    //System.out.println(z.compareTo(w));
    System.out.println(z.equals(x));
    System.out.println(x.equals(y));
    System.out.println(x.equals(z));
  }
}
