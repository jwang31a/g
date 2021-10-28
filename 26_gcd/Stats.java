/**
	Team NBJ: Nada, Brian K., Jun Hong
  APCS PD6
  HW26: GCD Three Ways
  2021-10-27
	
  DISCO:

	QCC:
	
	ALGO:

 **/

public class Stats {
	//brute force method
	public static int gcd(int a, int b) {
		int output = 1;
		int d = 1;
		
		while (d != a || d != b) {
			if (a % d == 0 && b % d == 0) {
				output = d;
			}
			d++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		gcd(8,16);
	}
}
