/*
Jun Hong Wang
APCS PD6
HW27: FOR the Love of Strings
2021-10-28

Time spent: 0.4 hours (or about 25 minutes)

DICSO:
Before this, I didn't realize that we had to return a method for a recursive method to work. 
I just assumed that to call (invoke) a method within a method, we wouldn't need to return that invoked method.
I also figured out that Strings in java can't be interacted with as arrays.
I just figured that it would be similar to python, where we can access individual characters in an array.
The substring array can kind of substitute as an array, because we can use it to access a character in a string.

Structure of for loop:
for (initialize variable; condition (boolean expression); increment/decrement (or something that changes the value of the counter variable))

QCC:
Why is it that Strings can't be accessed like they are in python?
I think substring kind of provides an alternative to indexing.
*/

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
	
	//reversing string using recursion, working now
	public static String reverseR(String s){
		if (s.length()==1){
			return s;
		}
		return reverseR(s.substring(1))+s.substring(0,1);
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
