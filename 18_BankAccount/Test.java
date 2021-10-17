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
  
  public String setName( String newName ) {
    fullName = newName;
    return fullName;
  }
  
  public String setPasswd( String newPasswd ) {
    password = newPasswd;
    return password;
  }
  
  public short setPin( short newPin ) {
    pin = newPin;
    return pin;
  }

  public int setAcctNum( int newAcctNum ) {
    accNum = newAcctNum;
    return NewAcctNum;
  }

  public double setBalance( double newBalance ) {
    accBal = newBalance; 
    return accBal;
  }
  
  // -------------------------------------------------------------------------
  
  public void deposit( double depositAmount ) {
    accBal = accBal + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    accBal = accBal - withdrawAmount;
  }

  
  public String toString() {
    String a = pin + accNum + accBal;
    System.out.println(a);
    return(a);
  }
  
  public static void main( String[] args ) {
    toString();
  }

}
