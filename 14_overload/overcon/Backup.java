public class BigSib {
	private String HelloMsg1;
	private String HelloMsg2;
	private String HelloMsg3;
	private String HelloMsg4;
	private String[] list = {HelloMsg1,HelloMsg2,HelloMsg3,HelloMsg4};
	public String output = "";
	
	public BigSib(String one, String two, String three, String four) {
		HelloMsg1 = one;
		HelloMsg2 = two;
		HelloMsg3 = three;
		HelloMsg4 = four;
	}
	
	public BigSib(int input, String string) {
		System.out.println(list[input]);
		output = list[input] + " " + string;
	}
}
