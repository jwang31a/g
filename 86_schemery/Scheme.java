/*
Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
APCS pd6
HW86 - What a Racket
2022-03-31
time spent: h
*/

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. Parse through String, turn it into an array of single character Strings.
 *   3. Declare 2 stacks, one for parentheses, and one for operations.
 *   4. If string contains parentheses or integers, push onto Stack 1, else, push onto stack 2.
 *   5. If we reach a closing parentheses, we don't add it, instead, we pop everything until we reach an opening parentheses.
 *   6. We pop the operation stored in Stack 2, and perform it on the integers we popped off from Stack 1.
 *   7. Push onto the stack the result of that operation, and continue, until the Stack contains one value only, which is the final value.
 *   8. Return this final value as a String.
 *   9. Profit!
 *
 * STACK OF CHOICE: ALStack by library
 * b/c ...
 * we didn't think choosing a specific implementation of stack was too important, so we went with the one we thought we knew better.
 **/

import java.util.ArrayList;

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  //the unload method works, but the evaluate method doesn't
  //it returns null because the numbers stack is somehow empty, so null is returned
  public static String evaluate( String expr )
  {
    String output = "";
    ALStack<String> numbers = new ALStack();
    ALStack<String> operations = new ALStack();
    String[] arr = expr.split("\\s");
    //toString(arr);
    int i = 0;
    while (numbers.size() > 1) {
      if (isNumber(arr[i])) {
        numbers.push(arr[i]);
        i++;
      } else if (arr[i] == "+" || arr[i] == "*" || arr[i] == "-") {
        operations.push(arr[i]);
        i++;
      } else if (arr[i] == ")") {
        String op = operations.pop();
        if (op == "+") {
          String evald = unload(1, numbers);
          numbers.pop();
          numbers.push(evald);
        } else if (op == "-") {
          String evald = unload(2, numbers);
        } else {
          String evald = unload(3, numbers);
        }
      }
    }
    //System.out.println(numbers.isEmpty());
    output = numbers.pop();
    return output;
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  //this method works
  public static String unload( int op, Stack<String> numbers )
  {
    String output = "";
    int combined = 0;
    if (op == 1) {
      while (isNumber(numbers.peekTop())) {
        combined += Integer.parseInt(numbers.pop());
      }
    } else if (op == 2) {
      ArrayList<Integer> storage = new ArrayList();
      while (isNumber(numbers.peekTop())) {
        storage.add((Integer)Integer.parseInt(numbers.pop()));
      }
      combined += storage.get(storage.size() - 1);
      for (int i = storage.size() - 2; i >= 0; i--) {
        combined = combined - storage.get(i);
      }
    } else if (op == 3) {
      combined = 1;
      while (isNumber(numbers.peekTop())) {
        combined = combined * Integer.parseInt(numbers.pop());
      }
    }
    System.out.println(combined);
    numbers.pop();
    output = Integer.toString(combined);
    return output;
  }//end unload()


  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
      return false;
    }
  }
  /*
  */

  //toString method to test
  public static void toString(String[] input) {
    String output = "";
    for (int i = 0; i < input.length; i++) {
      output += input[i] + ",";
    }
    System.out.println(output);
  }

  //main method for testing
  public static void main( String[] args )
  {
    ALStack<String> number = new ALStack();
    number.push("3");
    number.push("4");
    number.push("5");
    unload(2, number);

    String zoo1 = "( + 4 3 )";
    evaluate(zoo1);
    System.out.println(zoo1);
    System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
    //...7
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    String zoo2 = "( + 4 ( * 2 5 ) 3 )";
    System.out.println(zoo2);
    System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
    //...17

    String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
    System.out.println(zoo3);
    System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
    //...29

    String zoo4 = "( - 1 2 3 )";
    System.out.println(zoo4);
    System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
    //...-4
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
