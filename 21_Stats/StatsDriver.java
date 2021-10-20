/**
Team NBJ: Nada, Brian K., Jun Hong
APCS PD6
HW ?? -- ??
2021-10-20
**/

  //main method for testing functionality (moved from Stats.java)
  //calls method from outside the class
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
