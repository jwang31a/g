/**
   Team NBJ, Jun Hong Wang, Brian K., Nada Hameed
   APCS pd6
   HW20 -- External Audit
   2021-10-19
**/

public class BankAccount{

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if ((newPin > 1000) && (newPin < 9998)) {
      pin = newPin;
      return oldPin;
    } else {
      pin = 9999;
      System.err.println("New pin is not within range [1000, 9998].");
      return oldPin;
    }
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if ((newAcctNum >= 100000000) && (newAcctNum <= 999999998)) {
      acctNum = newAcctNum;
      return oldAcctNum;
    } else {
      acctNum = 999999999;
      System.err.println("New account number is not within the range [100000000, 999999998].");
      return oldAcctNum;
    }
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    if (withdrawAmount > balance) {
      System.err.println(false + " - account doesn't have enough money.");
    } else {
      balance = balance - withdrawAmount;
      System.out.println (true + " - withdrawal success");
  }
}

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

public boolean authenticate( int accNum, String pass ) {
  if ((accNum == acctNum) && (pass == passwd)) {
    return (true);
  } else {
    return (false);
  }
}
}//end class BankAccount
