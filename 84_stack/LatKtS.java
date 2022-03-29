/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    String ret = "";
    Latkes himbo = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      himbo.push(s.substring(i, i+1));
    }
    while (!himbo.isEmpty()) {
      ret += himbo.pop();
    }
    return ret;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes himbo = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String q = s.substring(i, i+1);
      if (q.equals("(") || q.equals("[") || q.equals("{")) himbo.push(q);
      else {
        if (himbo.isEmpty()) return false;
        String r = himbo.pop();
        if (q.equals(")")) {
          if (!(r.equals("("))) return false;
        }
        if (q.equals("}")) {
          if (!(r.equals("{"))) return false;
        }
        if (q.equals("]")) {
          if (!(r.equals("["))) return false;
        }
      }
    }
    if (himbo.isEmpty()) return true;
    return false;
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
