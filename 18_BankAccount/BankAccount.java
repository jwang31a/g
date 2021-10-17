/**
   Jun Hong Wang
   APCS pd6
   HW18 -- CPA-One
   2021-10-17
   
   DISCO:
   We understood how we can know that Java provides a constructor for us, because when we create a new instance of an object, it does something, even when the method used isn't defined.
   System.out.print will output a string representation of an object.
   
   QCC:
   For the PIN, I tried to do it with a short, but the compiler kept thinking it was a integer, so it changed it to a short.
   
   Q2 Response:
   When we create a new instance of a class, we say new ClassName(), and since ClassName() has parentheses, it is a method.
   We didn't define this method the code but Java includes it for us, which is why we can use it.
   
   Q3 Response:
   We can override the toString method by rewriting the toString method, and it will output a string representation of an object.
   
**/

public class BankAccount {
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
    BankAccount acct1 = new BankAccount();
    
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
