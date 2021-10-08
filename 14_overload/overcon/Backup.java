public class BigSib {
	private String HelloMsg1 = "Word up";
	private String HelloMsg2 = "Salutations";
	private String HelloMsg3 = "Hey ya";
	private String HelloMsg4 = "Sup";
	private String[] list = {HelloMsg1,HelloMsg2,HelloMsg3,HelloMsg4};
	public String output = "";
	
	public BigSib(int input, String string) {
		System.out.println(list[input]);
		output = list[input] + " " + string;
	}
}
