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
		
		System.out.println(richard.HelloMsg[0]);
		
 		BigSib richard1 = new BigSib(0,"Word up");
		greeting = richard1.output;
		System.out.println(greeting);
		
		BigSib richard2 = new BigSib(1,"Salutations");
		greeting = richard2.output;
		System.out.println(greeting);

		BigSib richard3 = new BigSib(2,"Hey ya");
		greeting = richard3.output;
		System.out.println(greeting);

		BigSib richard4 = new BigSib(3,"Sup");
		greeting = richard4.output;
		System.out.println(greeting);
	}
}
