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
	private String HelloMsg1 = "Word up";
	private String HelloMsg2 = "Salutations";
	private String HelloMsg3 = "Hey ya";
	private String HelloMsg4 = "Sup";
	public String[] list = {};
	public String output = "";
	
	public BigSib() {
		String[] HelloMsg = HelloMsg.add(HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4);
	}
	
	public BigSib(int input, String string) {
		String output = "";
		output = list[input] + " " + string;
	}
}
