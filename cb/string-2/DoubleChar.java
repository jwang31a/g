public class DoubleChar {
  public String doubleChar(String str) {
    String output = "";
    for (int counter = 0; counter <= str.length() - 1; counter++) {
      output += str.substring(counter, counter + 1);
      output += str.substring(counter, counter + 1);
    }
    return output;
  }
}
