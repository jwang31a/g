/**
   Team NBJ: Nada, Brian K., Jun Hong
   APCS PD6
   HW21 -- STAtisTically Speaking...
   2021-10-20
   
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   
   No TypeCasting (assigning value of one primitive type to another primitive type)
   
   Disco:
   It seems that when there is a floating-point number in an int, the int will round down.
   Not only that, but integers will automatically round/evaulate non-integer values. For example, when I wanted to take the cube root for geoMean(0), 1/3 was evaluated to 0, and it took the 0th power, which always returns 1.
   
   QCC:
   I wasn't able to do the geoMean() methods, since I kept getting the lossy conversion from double to int error.
   I think
 **/

import java.lang.Math;
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
	
	/** 
	I don't know if there is any other way to get a square root, since the sqrt() and pow() methods return doubles, and I can't put that into a int variable.
	I kept getting this error:
	error: incompatible types: possible lossy conversion from double to int
	**/
	
 	public static int geoMean(int a, int b) {
		int product = a * b;
		long preOutput = Math.round(Math.pow(product, 1.0/2.0));
		int output = Math.toIntExact(preOutput);
		return output;
 	}
	
 	public static double geoMean(double a, double b) {
		double output = Math.sqrt((a * b));
		return output;
 	}
	
 	public static int max(int a, int b, int c) {
		int output = 0;
		if (a >= b && a >= c) {
			output = a;
		} else if (b >= a && b >= c) {
			output = b;
		} else if (c >= a && c >= b) {
			output = c;
		}
		return output;
 	}
	
 	public static double max(double a, double b, double c) {
		double output = 0;
		if (a >= b && a >= c) {
			output = a;
		} else if (b >= a && b >= c) {
			output = b;
		} else if (c >= a && c >= b) {
			output = c;
		}
		return output;
 	}
	
	/**
	I had the same error I had above with the other geoMean() method, since I don't know how I can put a double into a int without the error.
	
	**/
 	public static int geoMean(int a, int b, int c) {
		int product = a * b * c;
		long preOutput = Math.round(Math.pow(product, (1.0/3.0)));
		int output = Math.toIntExact(preOutput);
		return output;
 	}
	
 	public static double geoMean(double a, double b, double c) {
		double product = a * b * c;
		double output = Math.pow(product, (1.0/3.0));
		return output;
 	}


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
	  
	  // geo mean of two integers
	  System.out.println(Stats.geoMean(3,4));
	  
	  // should output sqrt(12) in decimal form, or about 3.464
	  System.out.println(Stats.geoMean(3.0,4.0));
	  
	  // should output the biggest one of the three, or 3 (also with other test examples)
	  System.out.println(Stats.max(1,2,3));
	  System.out.println(Stats.max(3,2,3));
	  System.out.println(Stats.max(1,-2,2));
	  
	  // output the biggest float of the three (with extra test examples)
	  System.out.println(Stats.max(1.1,2.4,1279.8));
	  System.out.println(Stats.max(2.4,-2.4,0.1));
	  System.out.println(Stats.max(-2.4,-2.5,-0.1));
	  
	  // geometric mean of three inputs, returns int
	  System.out.println(Stats.geoMean(3,4,5));
	  
	  // geometric mean of three inputs, should return about 6.88
	  System.out.println(Stats.geoMean(1.1,15.6,19.0));
  }
}//end class
