public class BigSib {
	private String HelloMsg1 = "";
	private String HelloMsg2 = "";
	private String HelloMsg3 = "";
	private String HelloMsg4 = "";
	
	public BigSib() {
		HelloMsg1 = "Word up";
		HelloMsg2 = "Salutations";
		HelloMsg3 = "Hey ya";
		HelloMsg4 = "Sup";
	}
	
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
}
