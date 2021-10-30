public class CountCode {
  //counts the number of times String "code" appears, but the third letter doesn't matter
  public static int countCode(String str) {
    int counter = 0;
    for (int index = 0; index + 4 <= str.length(); index++) {
      String s = str.substring(index, index + 4);
      if (s.substring(0,3).equals("co") && s.substring(3,4).equals("e")) {
        counter++;
      }
    }
    return counter;
  }
  
  public static void main(String[] args) {
    Systen.out.println(countCode("aaacodebbb"));
    Systen.out.println(countCode("codexxcode"));
    Systen.out.println(countCode("cozexxcope"));
  }
}
