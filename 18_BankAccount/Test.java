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
  private int pin = 0;
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
  
  public int setPin( int newPin ) {
    pin = newPin;
    return pin;
  }

  public int setAcctNum( int newAcctNum ) {
    accNum = newAcctNum;
    return accNum;
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

  
  public void outputInfo() {
   System.out.println(fullName);
   System.out.println(accNum);
   System.out.println(accBal);
  }
  
  public static void main( String[] args ) {
    Test acct1 = new Test();
    
    acct1.setName("test name");
    acct1.setPasswd("testpassword");
    acct1.setPin(1234);
    acct1.setAcctNum(123456789);
    acct1.setBalance(100);

    acct1.deposit(99.99);
    acct1.withdraw(9.99);
    
    acct1.outputInfo();
  }

}
