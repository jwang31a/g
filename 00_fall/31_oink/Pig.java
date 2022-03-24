/***
 * Jun Hong Wang
 * APCS PD6
 * HW31 -- Pig Latin
 * 2021-11-04
 * time spent: 0.4 hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!

 DISCO:

 QCC:
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    boolean output = false;
    for (int i = 1; i <= w.length(); i++) {
      if (w.substring(i - 1, i).equals(letter)) {
        output = true;
      }
    }
    return output;
  }//end hasA()

  //=====================================
  //boolean isAVowel(String) -- tells whether a letter is a vowel
  //precondition: letter.length() == 1
  //=====================================
  public static boolean isAVowel( String letter )
  {
    boolean output = false;
    for (int i = 1; i <= VOWELS.length(); i++) {
      if (letter.equals(VOWELS.substring(i - 1, i))) {
        output = true;
      }
    }
    return output;
  }


  //=====================================
  //int countVowels(String) -- counts vowels in a String
  //pre:  w != null
  //post: countVowels("meatball") -> 3
  //=====================================
  public static int countVowels( String w )
  {
    int output = 0;
    for (int i = 1; i <= w.length(); i++) {
      if (isAVowel(w.substring(i - 1, i)) == true) {
        output += 1;
      }
    }
    return output;
  }


  //=====================================
  //boolean hasAVowel(String) -- tells whether a String has a vowel
  //pre:  w != null
  //post: hasAVowel("cat") -> true
  //hasAVowel("zzz")       -> false
  //=====================================
  public static boolean hasAVowel( String w )
  {
    boolean output = false;
    for (int i = 1; i <= w.length(); i++) {
      if (isAVowel(w.substring(i - 1, i)) == true) {
        output = true;
      }
    }
    return output;
  }


  //=====================================
  //String allVowels(String) -- returns vowels in a String
  //pre:  w != null
  //post: allVowels("meatball") -> "eaa"
  //=====================================
  public static String allVowels( String w )
  {
    String output = "";
    for (int i = 1; i <= w.length(); i++) {
      if (isAVowel(w.substring(i - 1, i)) == true) {
        output += w.substring(i - 1, i);
      }
    }
    return output;
  }

  /*
  */

  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "a"));
    System.out.println(hasA("cat", "b"));

    System.out.println(isAVowel("a"));
    System.out.println(isAVowel("b"));

    System.out.println(countVowels("aeiou"));
    System.out.println(countVowels("vowels"));

    System.out.println(hasAVowel("no vowels"));
    System.out.println(hasAVowel("n vwls"));

    System.out.println(allVowels("qwertyuiopasdfghjklzxcvbnm"));
    System.out.println(allVowels("qwrtasdf;"));
  }//end main()

}//end class Pig
