public class BigSib {
	private static String HelloMsg = "";
	private static String greeting = "";
	public String output = "";
	
	public static String input(String input) {
		HelloMsg = input;
		return(HelloMsg);
	}
	
	public static String greet(String input) {
		greeting = input;
		return(greeting);
	}
	
	public BigSib() {
		output = output.concat(HelloMsg + " " + greeting);
	}
}
