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
