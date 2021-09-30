public class Greet1 {
	public static void main(String[] args) {
		greet("person 1");
		greet("person 2");
		greet("person 3");
	}
	
	public static String greet(String string) {
		String output = "";
		output = "Why, hello there, " + string + ". How do you do?";
		System.out.println(output);
		return(output);
	}
}
