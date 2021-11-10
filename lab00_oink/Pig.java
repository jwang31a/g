/***
 * Clyde "Thluffy" Sinclair
 * APCS
 * HW31 -- deploying linear search on Strings, using helper methods
 * 2021-11-04r
 * time spent: .5hrs
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
 ***/

//only kind of works: it compiles, with extra functionality added, but not fully functional

public class Pig {

  private static final String VOWELS = "aeiouyAEIOUY";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";

  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;

    /* equiv code, wo using indexOf()...
       boolean ans = false;

       for( int i = 0; i < w.length(); i++ ) {

       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
    */
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter.toLowerCase() ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {

    return allVowels(w).length();

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {

       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ){
     for (int i = 0; i < w.length(); i++){
       for (int j = 0; j < VOWELS.length(); j ++){
         if (w.substring(i,i+1).equals(VOWELS.substring(j,j+1))){
           return true;
         }
       }
     }

     return false;
     /* YOUR IMPLEMENTATION HERE */
   }
  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1).toLowerCase() );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/



  public static String engToPig( String w ) {

    String ans = "";
    int vPos = w.indexOf( firstVowel(w) );

    if (isPunc(w.substring(0,1))) {
      String first = w.substring(0,1);
      w = w.substring(1);
      return(first + engToPig(w));
    } else if (isPunc(w.substring(w.length() - 1, w.length()))) {
      String first = w.substring(w.length() - 1, w.length());;
      return(engToPig(w.substring(0, w.length() - 1)) + first);
    }

    if (beginsWithUpper(w)) {
      if ( beginsWithVowel(w) ){
        ans = w + "way";
      }
      else {
        ans = w.substring(vPos, vPos + 1).toUpperCase() + w.substring(vPos + 1) + w.substring(0,vPos).toLowerCase() + "ay";
      }
    } else {
      if ( beginsWithVowel(w) ) {
      ans = w + "way";
    }
      else {
        ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
      }
    }


    return ans;
  }



/*
  public static String engtoPig(String w) {
    String ans = "";
    if (beginsWithUpper) {

    } else {

    }
  }
  */


    /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
  public static boolean isPunc( String symbol ) {
	   return PUNCS.indexOf( symbol ) != -1;
  }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
  public static boolean isUpperCase( String letter ) {
    return (CAPS.indexOf(letter, 0) > 0);
  }



    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false
      =====================================*/

  public static boolean hasPunc( String w ) {
    boolean output = false;
    for (int i = 1; i <= w.length(); i++) {
      if (PUNCS.indexOf(w.substring(i - 1, i), i) > 0) {
        output = true;
      }
    }
    return output;
  }



    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/

  public static boolean beginsWithUpper( String w ) {
	  return isUpperCase(w.substring(0,1) );
  }


  public static void main( String[] args ) {
    String output = "";
    for( String word : args ) {
      //System.out.println( "allVowels \t" + allVowels(word) );
      //System.out.println( "firstVowels \t" + firstVowel(word) );
      //System.out.println( "countVowels \t" + countVowels(word) );
      //System.out.println( "engToPig \t" + engToPig(word) );
      //System.out.println( "---------------------" );
      output += engToPig(word) + " ";
    }
    //System.out.println(isUpperCase("T"));
    //System.out.println(hasPunc("T"));
    //System.out.println(hasPunc("T.;"));
    //System.out.println(beginsWithUpper("Upper"));
    //System.out.println(beginsWithUpper("not Upper"));

    System.out.println(output);
  }//end main()

}//end class Pig
