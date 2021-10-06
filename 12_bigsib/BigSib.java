public class BigSib {
	String HelloMsg = "";
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
	
	public String setHelloMsg(String string) {
		HelloMsg = string;
		return(HelloMsg);
	}
}
