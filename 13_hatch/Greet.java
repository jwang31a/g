//Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
//APCS
//HW#13_hatch, Where do BigSibs Come From?, 
//use constructor (special method that runs automatically at the beginning) to make Greet.java run without setHelloMsg.
//2021-10-06

//Discoveries:
//Constructor method is very useful, and will help with condensing code down.
//Constructors can have inputs or arguments.
//It can kind of take the place of another method.
//Constructors are called with the new operator.

//QCC

public class Greet {
 	public static void main( String[] args ){
 		String greeting;
 		BigSib richard1 = new BigSib("Word up");
		
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
