public class EndOther {
  //returns true if the ending of longering is "abc", disregarding capitalization
  //utilizes the longer.toLowercase() method

  //I feel like this code is a bit long though, is there an easier way to do this?
  //Both more concisely and in a smarter way?
  public static boolean endOther(String a, String b) {
    boolean output = false;
    String longer = "";
    String shorter = "";
    if (a.length() == b.length()) {
      longer = a.toLowerCase();
      shorter = b.toLowerCase();
    } else if (a.length() <= b.length()) {
      longer = b.toLowerCase();
      shorter = a.toLowerCase();
    } else if (a.length() >= b.length()) {
      longer = a.toLowerCase();
      shorter = b.toLowerCase();
    }
    for (int index = 0; index + shorter.length() <= longer.length(); index++) {
      if (longer.substring(index, index + shorter.length()).equals(shorter)) {
        output = true;
      } else {
        output = false;
      }
    }
    return output;
  }

  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
  }
}
