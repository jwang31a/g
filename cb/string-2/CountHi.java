public class CountHi {
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
}
