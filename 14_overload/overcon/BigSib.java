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
	public String[] list = {"","","",""};
	public String output = "";
	
	public BigSib(String one, String two, String three, String four) {
		String HelloMsg1 = one;
		String HelloMsg2 = two;
		String HelloMsg3 = three;
		String HelloMsg4 = four;
		String[] list = {HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4};
	}
	
	public BigSib(int input, String string) {
		output = list[input] + " " + string;
	}
}
