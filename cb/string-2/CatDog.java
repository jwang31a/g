public class CatDog {
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
}
