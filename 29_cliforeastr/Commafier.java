/*
Team NBJ: Nada, Brian K., Jun Hong Wang
APCS PD6
HW29: Which Way Do You Roll?
2021-11-1
Time Spent: (30 minutes on iterative method)

DISCO:
I have a much better understanding of recursion in java now.
Instead of returning a recursive call only, we have to return something + a recursive call, so that when we reach the base case, we get all the outputs from before as well.
I also found out that Integer.parseInt() isn't a perfect method, since it gets rid of leading zeros.
For example, when I try Integer.parseInt("0000000000"), the zeros get removed, and it returns 0.
I understand how to do a for each loop now so that I can input arguments via the command line.

QCC:
The code is definitely very inefficient, since I didn't really think about simplifiying the code.
It would have probably been easier if I just thought about the method a little more before implementing it into Java.

In the recursive method, is there a way to keep the zeros?
The method only works in the first digit of a set (so something like ",000" or ",010") isn't 0.
However, the iterative one works perfectly fine.

I'm not sure how to do the for each loop such that I can input via the command line.
This has been fixed now, I I understand this a lot more.
Since this is in the main method, the array args is a String array, so all inputs will be interpreted as Strings, so we have to convert it from a String into an int for the method to work.
*/

public class Commafier {
  public static void main(String[] args) {

    /*explicit calls, commented out
    System.out.println(commafyR(1));
    System.out.println(commafyR(10));
    System.out.println(commafyR(100));
    System.out.println(commafyR(1000));

    System.out.println("\n");

    System.out.println(commafyF(1));
    System.out.println(commafyF(10));
    System.out.println(commafyF(101));
    System.out.println(commafyF(1000));
    System.out.println(commafyF(12345));

    System.out.println("\n");
    */

    for (String i: args) {
      System.out.println(commafyR(Integer.parseInt(i)));
      System.out.println(commafyF(Integer.parseInt(i)));
    }
  }

  //recursive commafy, done slightly differently than the iterative one
  //the problem here is that Integer.parseInt("000") returns 0, not 000. (this problem has been fixed)
  //Is there a way to convert from a String to int that preserves the 0?
  //I could write a helper method, but I'm not sure if that's allowed, or if it preserves the leading 0s.
  //this is working now

  public static String commafyR(int n) {
    String input = Integer.toString(n);
    String output = "";
    int newInput = 0;

    if (input.length() <= 3) {
      output = input;
      return output;
    }

    if (input.length() % 3 == 2) {
      output = input.substring(0, 2) + ",";
      newInput = Integer.parseInt(input.substring(2));
      return output + commafyR(newInput);
    } else if (input.length() % 3 == 1) {
      output = input.substring(0, 1) + ",";
      newInput = Integer.parseInt(input.substring(1));
      return output + commafyR(newInput);
    } else if (input.length() % 3 == 0 && input.length() >= 3) {
      output = "," + input.substring(input.length() - 3, input.length());
      newInput = Integer.parseInt(input.substring(0, input.length()-3));
      return commafyR(newInput) + output;
    }

    return output;
  }


  //using iteration (for loop)
  //this is very inefficient I think, and I could have probably done it much more easily
  public static String commafyF(int n) {
    String input = Integer.toString(n);
    String newInput = "";
    String output = "";

    if (input.length() <= 3) {
      output = input;
      return output;
    }

    if (input.length() % 3 == 2) {
      output += input.substring(0, 2) + ",";
      newInput = input.substring(2, input.length());
    } else if (input.length() % 3 == 1) {
      output += input.substring(0,1) + ",";
      newInput = input.substring(1, input.length());
    } else if (input.length() % 3 == 0) {
      newInput = input;
    }

    for (int i = 0; i + 3 <= newInput.length(); i += 3) {
      if (newInput.length() % 3 != 0) {
        output = output + "," + newInput.substring(i, i + 3);
      } else {
        if (i + 3 != newInput.length()) {
          output =  output + newInput.substring(i, i + 3) + ",";
        } else {
          output = output + newInput.substring(i, i + 3);
        }
      }
    }

    return output;
  }
}
