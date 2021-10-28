/**
Team NBJ: Nada, Brian K., Jun Hong
APCS PD6
HW26: GCD Three Ways
2021-10-27
30 minutes as of 9:22

DISCO:

QCC:
	
ALGO:

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
	
	//recursive method
	/* 
	public static int gcdER(int a, int b) {
		int output = 0;
		if (a == b) {
			output = a;
			return(output);
		} else if (a < b) {
			if (b % a == 0) {
				output = a;
				return(output);
			} else {
				gcdER(a-1, b);
			}
		} else if (b < a) {
			if (a % b == 0 ) {
				output = b;
				return(output);
			} else {
				gcdER(a, b-1);
			}
		}
	}
	*/
	
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
			orig = b
			if (a % b == 0 && orig % b == 0) {
				output = b;
			} else {
				gcdER(a, b-1);
			}
		}
		return(output);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(6,8));
		System.out.println(gcdER(6,8));
	}
}
