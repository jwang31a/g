public class Rof {
	public static String fenceF(int posts) {
		String result = "|";
		for (int postCounter = 1; postCounter < posts; postCounter++) {
			result += "--|";
		}
		return result;
	}

	public static String reverseF(String s) {
		String result = "";
		char[] ch = s.ToCharArray();
		for (int character = s.length()-1; character>=0;character--){
			result+=ch[character];
		}
		result = ch.toString();
		return result;
		
	}

	public static String reverseR(String s){
		if (s.length()==1){
			return s;
		}
		return reverseR(s.substring(1))+s[0];
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(3));
	}
}
