public class Greet1 {
	public static void main(String[] args) {
		greet("person 1");
		greet("person 2");
		greet("person 3");
	}
	
	public static String greet(String string) {
		String output = "";
		// I think the system of creating a new variable and defining it is notable, because it's different from other languages. 
		// In Python, the creation and definition of a variable could be done without stating what type of variable it is. and it was always done on one line.
		output = "Why, hello there, " + string + ". How do you do?";
		System.out.println(output);
		return(output);
		// I think that something notable is that the return statement doesn't also print the text (I could be wrong here, but I remember Python did it).
	}
}
