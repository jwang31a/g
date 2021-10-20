/**
   Team NBJ: Nada, Brian K., Jun Hong
   APCS PD6
   HW21 -- STAtisTically Speaking...
   2021-10-20
   
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   
   No TypeCasting
 **/

import java.util.Math;
public class Stats {
	public static int mean(int a, int b) {
		int output = (a + b) / 2;
		return output;
  		}
  
	public static double mean(double a, double b) {
		double output = (a + b) / 2;
		return output;
	}
	
	public static int max(int a, int b) {
		int output = 0;
		if (a >= b) {
			output = a;
		} else if (a < b) {
			output = b;
		}
		return output;
	}
	
		public static double max(double a, double b) {
		double output = 0;
		if (a >= b) {
			output = a;
		} else if (a < b) {
			output = b;
		}
		return output;
		
 	}
	
	
 	public static int geoMean(int a, int b) {
		int output = Math.sqrt((a * b) * (a * b));
		return output;
 	}
	/**
 	public static double geoMean(double a, double b) {
 	}
	
 	public static int max(int a, int b, int c) {
 	}
	
 	public static double max(double a, double b, double c) {
 	}
	
 	public static int geoMean(int a, int b, int c) {
 	}
	
 	public static double geoMean(double a, double b, double c) {
 	}
**/

  //main method for testing functionality
  public static void main( String[] args ) {
	  // should output 1.5, but it seems like it rounds down?
	  System.out.println(Stats.mean(1,2));
	  
	  // should output 1.5, outputs correct mean
	  System.out.println(Stats.mean(1.0,2.0));
	  
	  // should return the bigger of the two numbers, 100
	  System.out.println(Stats.max(1,100));
	  
	  // should return 12.34
	  System.out.println(Stats.max(1,12.34));
	  
	  // should output sqrt(12) in decimal form
	  System.out.println(Stats.geoMean(3,4));
  }
}//end class
