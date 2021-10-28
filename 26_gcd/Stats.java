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
	
	//using while loop
	public static int gcdEW(int a, int b) {
		int output = 0;
		if (a == b) {
			output = a;
		} else if (a < b) {
			while (b % a != 0 && a % a != 0) {
				a = a - 1;
				if (b % a == 0 && a % a == 0) {
					break;
				}
			}
			output = a;
		} else if (b < a) {
			while (a % b != 0 && b % b != 0) {
				b = b - 1;
				if (a % b == 0 && b % b == 0) {
					break;
				}
			}
			output = b;
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(6,8));
		//System.out.println(gcdER(6,8));
		System.out.println(gcdEW(6,14));
	}
}
