/**
Team NBJ: Nada, Brian K., Jun Hong
APCS PD6
HW26: GCD Three Ways
2021-10-27
2 hours

DISCO:

QCC:
All three of my methods compile without errors, but they don't do what I want them to do. 
For example, the while loop method just skips over the loops completely, and I'm not sure why. 

ALGO:
The first algorithm is the only algorithm that actually works.
We take an input, integers a and b. 
We define two integer variables, output and d, and initialize them to 1.
For the while loop to run, it checks if d is not equal to a and b.
Inside the while loop, it checks if a mod d and b mod d are 0, and if it is, then output will be set to d, and d will be returned.
If it isn't, then d increases by 1, and it goes through another run of the loop.
 **/

public class Stats {
	//brute force method, using while loop
	public static int gcd(int a, int b) {
		int output = 1;
		int d = 1;
		
		while (d != a && d != b) {
			if (a % d == 0 && b % d == 0) {
				output = d;
			}
			d = d + 1;
		}
		return output;
	}
	
	//recursive method (doesn't work)
	/*
	public static int gcdER(int a, int b) {
		int output = 0;
		int orig = 0;
		if (a == b) {
			output = a;
		} else if (a < b) {
			orig = a;
			if (b % a == 0 && orig % a == 0) {
				output = a;
				System.out.println(output);
			} else {
				gcdER(a-1, b);
			}
		} else if (b < a) {
			orig = b;
			if (a % b == 0 && orig % b == 0) {
				output = b;
			} else {
				gcdER(a, b-1);
			}
		}
		return(output);
	}
	*/
	
	//using while loop, doesn't work
	public static int gcdEW(int a, int b) {
		int output = 0;
		int orig = 0;
		if (a == b) {
			output = a;
		} else if (a < b) {
			orig = a;
			while (b % a != 0 && orig % a != 0) {
				a = a - 1;
				output = a;
			}
			output = a;
		} else if (b < a) {
			orig = b;
			while (a % b != 0 && orig % b != 0) {
				b = b - 1;
				output = b;
			}
			output = b;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		System.out.println(gcd(6,8));
		//System.out.println(gcdER(6,8));
		System.out.println(gcdEW(4,18));
	}
}
