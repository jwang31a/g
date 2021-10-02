public class Greet {
 	public static void main(String[] args) {
   	greet("Flim");
   	greet("Flam");
   	greet("Kazaam");
 	}
 	public static String greet(String string) {
		String output = "";
		output = "Why, hello there, " + string + ". How do you do?";
		System.out.println(output);
		return(output);
 	}
}
