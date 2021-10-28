public class Rof {
	public String fenceF(int posts) {
		String result = "|";
		for (int postCounter = 1; postCounter < posts; postCounter++) {
			result += "--|"
		}
		return result;
	}

	public String reverseF(String s) {
		String result = "";
		for (int character = s.length()-1; character>=0;character--){
			result+=s[character];
		}
		return result;
		
	}

	public String reverseR(String s){
		if (s.length()==1){
			return s
		}
		return reverseR(s.substring(1))+s[0];
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(3));
	}
}
