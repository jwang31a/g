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
		
 		BigSib richard = new BigSib();
		greeting = richard.HelloMsg1 + " " + "freshman";
		System.out.println(greeting);
		
		greeting = richard.HelloMsg2 + " " + "Dr. Spaceman";
		System.out.println(greeting);

		greeting = richard.HelloMsg3 + " " + "Kong Fooey";
		System.out.println(greeting);

		greeting = richard.HelloMsg4 + " " + "mom";
		System.out.println(greeting);
	}
}
