//Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
//APCS
//HW#13_hatch, Where do BigSibs Come From?, 
//use constructor (special method that runs automatically at the beginning) to make Greet.java run without setHelloMsg.
//2021-10-06

//Discoveries:
//Constructor method is very useful, and will help with condensing code down.

//QCC

public class Greet {
 	public static void main( String[] args ){
 		String greeting;
 		BigSib richard = new BigSib();

		richard.HelloMsg = "Word up";
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		
		greeting = richard.greet("Dr. Spaceman");
		System.out.println(greeting);

		greeting = richard.greet("Kong Fooey");
		System.out.println(greeting);

		greeting = richard.greet("mom");
		System.out.println(greeting);
	}
}
