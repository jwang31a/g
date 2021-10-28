// time spent: about 15 minutes right now

public class Rof {
	//fence using for loop, this works
	public static String fenceF(int posts) {
		String result = "|";
		for (int postCounter = 1; postCounter < posts; postCounter++) {
			result += "--|";
		}
		return result;
	}
	
	//reversing string using for loop, this works
	public static String reverseF(String s) {
		String result = "";
		for (int character = s.length(); character>=0;character--){
			if (character != 0){
				result+=s.substring(character - 1,character);
			} else {
				break;
			}
		}
		return result;
		
	}
	
	//reversing string using recursion, not working right now (not working on this right now)
	public static String reverseR(String s){
		if (s.length()==1){
			return s;
		}
		return reverseR(s.substring(1))+s[0];
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(3));
		System.out.println(fenceF(10));
		System.out.println(reverseF("joe mama"));
		System.out.println(reverseF(reverseF("reversed reverse")));
		System.out.println(reverseR("joe mama"));
		System.out.println(reverseF(reverseR("reversed reverse")));
	}
}
