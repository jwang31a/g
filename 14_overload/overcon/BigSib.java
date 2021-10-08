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
	private String[] list = {};
	public String output = "";
	
	public String[] setHelloMsg(String one, String two, String three, String four) {
		HelloMsg1 = one;
		HelloMsg2 = two;
		HelloMsg3 = three;
		HelloMsg4 = four;
		String[] list = {HelloMsg1, HelloMsg2, HelloMsg3, HelloMsg4};
		return(list);
	}
	
	}
	
	public BigSib(int input, String string) {
		System.out.println(list);
		output = list[input] + " " + string;
	}
}
