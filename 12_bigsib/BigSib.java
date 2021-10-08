public class BigSib {
	String HelloMsg = "";
	// I thought that things couldn't exist/be defined outside of a method, but we can do it.
	// This changes things, because every method in this class can access this variable, and this be very helpful.
	// I kind of threw out a lot of my Python knowledge, because I thought that Java was pretty differend, but I think that information would have saved a lot of time for me.
	public String greet(String string) {
		String output = "";
		output = HelloMsg + " " + string;
		return(output);
	}
	
	public String setHelloMsg(String string) {
		HelloMsg = string;
		// The point of this method is to set the value of a variable, which is how we can use this variable in greet and get a valid answer.
	}
}
