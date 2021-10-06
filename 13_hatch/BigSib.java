public class BigSib {
	public String HelloMsg = "";
	
	public BigSib(String input) {
		HelloMsg  = input;
	}
	
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
}
