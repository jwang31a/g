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
		
		BigSib.input("Word up");
		BigSib.greet("freshman");
		BigSib richard1 = new BigSib();
		greeting = richard1.output;
		System.out.println(greeting);
		
		BigSib.input("Salutations");
		BigSib.greet("Dr. Spaceman");
		BigSib richard2 = new BigSib();
		greeting = richard2.output;
		System.out.println(greeting);

		BigSib.input("Hey ya");
		BigSib.greet("Kong Fooey");
		BigSib richard3 = new BigSib();
		greeting = richard3.output;
		System.out.println(greeting);

		BigSib.input("Sup");
		BigSib.greet("mom");
		BigSib richard4 = new BigSib();
		greeting = richard4.output;
		System.out.println(greeting);
	}
}
