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
	public static int gcdER(int a, int b) {
		if (a == b) {
			return(a);
		} else if (a < b) {
			if (b % a == 0) {
				return(a);
			} else {
				gcdER(a-1, b);
			}
		} else if (b < a) {
			if (a % b == 0 ) {
				return(b);
			} else {
				gcdER(a, b-1);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(6,8));
		System.out.println(gcdER(6,8));
	}
}
