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
	public String[] list = {HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4};
	public String output = "";
	
	public BigSib() {
		HelloMsg1 = HelloMsg1.concat("Word up");
		HelloMsg1 = HelloMsg1.concat("Salutations");
		HelloMsg1 = HelloMsg1.concat("Hey ya");
		HelloMsg1 = HelloMsg1.concat("Sup");
	}
	
	public BigSib(int input, String string) {
		String output = "";
		output = list[input] + " " + string;
	}
}
