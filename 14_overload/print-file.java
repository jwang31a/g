/*
Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
APCS
HW#14_overload, Customize Your Creation, 
use default and overloaded constructor to set the value for a variable.
2021-10-07

Discoveries:
Overloaded constructors can really help with simplifying code. 
As long as the arguments of a constructor are different between constructors, these are interpreted as different methods.

QCC:
I'm not sure if the .concat method is necessary, but I just used it for safety reasons. 
How does overloading work in Java?
*/

public class BigSib {
	public String HelloMsg1 = "";
	public String HelloMsg2 = "";
	public String HelloMsg3 = "";
	public String HelloMsg4 = "";
	
	public BigSib() {
		HelloMsg1 = "Word up";
		HelloMsg2 = "Salutations";
		HelloMsg3 = "Hey ya";
		HelloMsg4 = "Sup";
	}
}

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

public class BigSib {
	private static String HelloMsg = "";
	private static String greeting = "";
	public String output = "";
	
	public BigSib(String input1, String input2) {
		HelloMsg = input1;
		greeting = input2;
	}
	
	public BigSib() {
		output = output.concat(HelloMsg + " " + greeting);
	}
}

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
