/**
   Jun Hong Wang
   APCS pd6
   HW18 -- CPA-One
   2021-10-17
   
   DISCO:
   
   QCC:
   
   Q2 Response:
   
   Q3 Response:
**/

public class Test {
  private String fullName = "";
  private String password = "";
  private short pin = 0;
  private int accNum = 0;
  private double accBal = 0;
  
  public static String setName( String newName ) {
    fullName = newName;
    return fullName;
  }



  
  public static void main( String[] args ) {
    setName("test name");
    System.out.println(fullName);
  }

}
