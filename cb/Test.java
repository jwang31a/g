/*
Jun Hong Wang
APCS PD6
HW28: PPMP
2021-10-31
Time Spent: 0.6 hours (about 35 minutes)

DISCO:
While trying to figure out how to do endOther(), I learned how to use the str.toLowerCase() method.
We take a string, for example str, and put .toLowerCase() at the end.
This is also the same with the .toUpperCase method.

QCC:
I used a lot of for loops during this homework, and I understand them a lot more than I used to.

I know there is definitely a more efficient way to do this homework because my code is likely not the most efficient, but how can I do this more efficiently?
How can I shorten and condense my code without sacrificing readibility?
*/

public class Test {
  public String helloName(String name) {
    String output = "Hello" + " " + name + "!";
    return output;
  }

  public String makeAbba(String a, String b) {
    String output = a + b + b + a;
    return output;
  }

  //compares the amount of times Strings "cat" and "dog" appear, and returns true if they appear the same amount of times, false if they don't appear the same amount of times.
  public boolean catDog(String str) {
    boolean output;
    int counter = 0;
    // this for loop goes through the string, looks for cat and dog, and adds/subtracts one depending on which one it finds
    for (int index = 0; index + 3 <= str.length(); index++) {
      if (str.substring(index, index + 3).equals("cat")) {
        counter++;
      } else if (str.substring(index, index + 3).equals("dog"))  {
        counter--;
      }
    }
    //this counter is then used to see if it equals 0, if it does, it sets output to true, if not, it sets it to false
    if (counter == 0) {
      output = true;
    } else {
      output = false;
    }
    return output;
  }

  //counts the number of times String "code" appears, but the third letter doesn't matter
  public static int countCode(String str) {
    int counter = 0;
    for (int index = 0; index + 4 <= str.length(); index++) {
      String s = str.substring(index, index + 4);
      if (s.substring(0,2).equals("co") && s.substring(3,4).equals("e")) {
        counter++;
      }
    }
    return counter;
  }

  //counts number of times String "hi" has appeared
  public int countHi(String str) {
    int output = 0;
    for (int index = 0; index + 2 <= str.length(); index++) {
      if (str.substring(index, index + 2).equals("hi")) {
        output++;
      }
    }
    return output;
  }

  //each letter in the string is repeated
  public String doubleChar(String str) {
    String output = "";
    for (int counter = 0; counter <= str.length() - 1; counter++) {
      output += str.substring(counter, counter + 1);
      output += str.substring(counter, counter + 1);
    }
    return output;
  }

  //returns true if the ending of longering is "abc", disregarding capitalization
  //utilizes the str.toLowercase() method

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

  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
  }
}
