public class BigSib {
	public String HelloMsg = "";
	
	public BigSib() {
		HelloMsg  = "Word up";
	}
	
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
}
