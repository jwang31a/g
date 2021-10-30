public class XyzThere {
  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
  }
  //I feel like this code is long winded, and probably isn't the most efficient way of doing things.
  //How can I do this more efficiently, but also more concisely?
  public static boolean xyzThere(String str) {
    boolean output = false;
    for (int index = 0; index + 4 <= str.length(); index++) {
      if (str.substring(index + 1, index + 4).equals("xyz")) {
        if (str.substring(index, index + 1).equals(".")) {
          output = false;
        } else {
          output = true;
        }
      }
    }
    if (str.length() >= 3) {
      if (str.substring(0,3).equals("xyz")) {
        output = true;
      }
    }
    return output;
  }
}
