public class Rof {
	//fence using for loop, this works
	public static String fenceF(int posts) {
		String result = "|";
		for (int postCounter = 1; postCounter < posts; postCounter++) {
			result += "--|";
		}
		return result;
	}
	
	//reversing string using for loop
	public static String reverseF(String s) {
		String result = "";
		for (int character = s.length()-1; character>=0;character--){
			result+=s.substring(0,1);
		}
		return result;
		
	}
	
	//reversing string using recursion, not working right now
	/*
	public static String reverseR(String s){
		if (s.length()==1){
			return s;
		}
		return reverseR(s.substring(1))+s[0];
	}
	*/
	
	public static void main(String[] args) {
		System.out.println(fenceF(3));
		reverseF("joe mama");
	}
}
