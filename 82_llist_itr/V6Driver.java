/***
 * class V6Driver
 * ...for testing implementation of Iterable interface
 *    (ability to run a FOREACH loop over your LList)
 *
 * Assumes local version of List.java, overriding Java standard library interface
 **/

import java.util.Iterator;

public class V6Driver
{
  public static void main( String[] args )
  {
    List<String> wu = new LList<String>();

    System.out.println(wu);
    wu.add("RZA");
    wu.add("GZA");
    wu.add("ODB");
    wu.add("Inspectah Deck");
    wu.add("Raekwon the Chef");
    wu.add("U-God");
    wu.add("Ghostface");
    wu.add("Method Man");
    System.out.println(wu);

    for( String s : wu ) {
      System.out.println(s + " raps for the Wu");
    }

    System.out.println("\nusing an iterator\n");

    //extra test cases using the iterator instead of foreach loop
    Iterator it = wu.iterator();

    //printing out list using iterator
    while (it.hasNext()) {
      System.out.println( it.next() + " raps for the Wu");
    }

    List numbers = new LList<Integer>();
    for (int i = 0; i < 11; i++) {
      numbers.add((Integer)i);
    }

    System.out.println("\n" + numbers);
    Iterator innit = numbers.iterator();

    while (innit.hasNext()) {
      Integer n = (Integer)innit.next();
      if (n % 2 == 1) {
        innit.remove();
      }
      System.out.println(numbers);
    }

    System.out.println(numbers);
  }//end main()

}//end class
