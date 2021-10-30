public class CatDog {
  public boolean catDog(String str) {
    boolean output;
    int counter = 0;
    for (int index = 0; index + 3 <= str.length(); index++) {
      if (str.substring(index, index + 3).equals("cat")) {
        counter++;
      } else if (str.substring(index, index + 3).equals("dog"))  {
        counter--;
      }
    
    }
    if (counter == 0) {
      output = true;
    } else {
      output = false;
    }
    return output;
  }
}
