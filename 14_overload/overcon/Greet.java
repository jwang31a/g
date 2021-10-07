/*
Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
APCS
HW#14_overload, Customize Your Creation, 
use default and overloaded constructor to set the value for a variable.
2021-10-07

Discoveries:

QCC
*/

public class Greet {
 	public static void main( String[] args ){
 		String greeting;
		
 		BigSib richard1 = new BigSib();
		greeting = richard1.greet("freshman");
		System.out.println(greeting);
		
		BigSib richard2 = new BigSib("Salutations");
		greeting = richard2.greet("Dr. Spaceman");
		System.out.println(greeting);

		BigSib richard3 = new BigSib("Hey ya");
		greeting = richard3.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib richard4 = new BigSib("Sup");
		greeting = richard4.greet("mom");
		System.out.println(greeting);
	}
}
