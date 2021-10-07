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
	private String HelloMsg1 = "";
	private String HelloMsg2 = "";
	private String HelloMsg3 = "";
	private String HelloMsg4 = "";
	String[] HelloMsg = {};
	public String output = ""
	
	public BigSib() {
		HelloMsg1 = "Word up";
		HelloMsg2 = "Salutations";
		HelloMsg3 = "Hey ya";
		HelloMsg4 = "Sup";
		HelloMsg[] = {HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4};
	}
	
	public BigSib(int input, String string) {
		String output = "";
		output = HelloMsg[input - 1] + " " + string;
	}
}
