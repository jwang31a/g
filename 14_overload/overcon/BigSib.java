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
	private String HelloMsg = "";
	
	public BigSib(string input) {
		HelloMsg = input;
	}
	
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
}
