/**
   Jun Hong Wang
   APCS pd6
   HW18 -- CPA-One
   2021-10-17
   
   instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance
   
   and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

public class BankAccount {
  private String fullName = "";
  private String password = "";
  private short pin = "";
  private int accNum = "";
  private double accBal = "";
  
   
   
   
  
  //mutators
  public String setName( String newName ) {
    // INSERT YOUR CODE HERE
  }

  public String setPasswd( String newPasswd ) {
    // INSERT YOUR CODE HERE
  }

  public short setPin( short newPin ) {
    // INSERT YOUR CODE HERE
  }

  public int setAcctNum( int newAcctNum ) {
    // INSERT YOUR CODE HERE
  }

  public double setBalance( double newBalance ) {
    // INSERT YOUR CODE HERE
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    // INSERT YOUR CODE HERE
  }

  public void withdraw( double withdrawAmount ) {
    // INSERT YOUR CODE HERE
  }


  //overridden toString()
  public String toString() {
    // INSERT YOUR CODE HERE
  }


  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
  }//end main()

}//end class BankAccount
