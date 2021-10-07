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
	public String HelloMsg1 = "";
	public String HelloMsg2 = "";
	public String HelloMsg3 = "";
	public String HelloMsg4 = "";
	String[] HelloMsg = {};
	
	public BigSib() {
		HelloMsg1 = "Word up";
		HelloMsg2 = "Salutations";
		HelloMsg3 = "Hey ya";
		HelloMsg4 = "Sup";
		HelloMsg = {HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4};
	}
	
	public BigSib(int input, String string) {
		String output = "";
		output = HelloMsg[input - 1] + " " + string;
		return output
	}
}
