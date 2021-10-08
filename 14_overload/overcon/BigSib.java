/*
Team Triple J, Jefford, Jeffrey, Jun Hong; (turtles) Dylan, Mathias, Bob
APCS
HW#14_overload, Customize Your Creation, 
use default and overloaded constructor to set the value for a variable.
2021-10-07

Discoveries:

QCC
*/

import java.util.ArrayList;

public class BigSib {
	private String HelloMsg1 = "";
	private String HelloMsg2 = "";
	private String HelloMsg3 = "";
	private String HelloMsg4 = "";
	private String[] list = {};
	public String output = "";
	
	public BigSib(String one, String two, String three, String four) {
		HelloMsg1 = one;
		HelloMsg2 = two;
		HelloMsg3 = three;
		HelloMsg4 = four;
	}
	
	public void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(HelloMsg1);
		list = list1
	}
	
	public BigSib(int input, String string) {
		System.out.println(list);
		output = list[input] + " " + string;
	}
}
