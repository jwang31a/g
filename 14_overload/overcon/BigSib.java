/*
Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
APCS
HW#14_overload, Customize Your Creation, 
use default and overloaded constructor to set the value for a variable.
2021-10-07

Discoveries:

QCC
*/

public class BigSib {
	private static String HelloMsg = "";
	private static String greeting = "";
	public String output = "";
	
	public static String input(String input1, String input2) {
		HelloMsg = input1;
		greeting = input2;
		return(HelloMsg);
		return(greeting);
	}
	
	public BigSib() {
		output = output.concat(HelloMsg + " " + greeting);
	}
}
