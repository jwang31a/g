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
		
		BigSib a = new BigSib("Word up","freshman");
		BigSib richard1 = new BigSib();
		greeting = richard1.output;
		System.out.println(greeting);
		
		BigSib b = new BigSib("Salutations","Dr. Spaceman");
		BigSib richard2 = new BigSib();
		greeting = richard2.output;
		System.out.println(greeting);

		BigSib c = new BigSib("Hey ya","Kong Fooey");
		BigSib richard3 = new BigSib();
		greeting = richard3.output;
		System.out.println(greeting);

		BigSib d = new BigSib("Sup","mom");
		BigSib richard4 = new BigSib();
		greeting = richard4.output;
		System.out.println(greeting);
	}
}
