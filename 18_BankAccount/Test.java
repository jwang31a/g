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
  
  public String setName( String newName ) {
    fullName = newName;
    return fullName;
  }



  
  public static void main( String[] args ) {
    Ssytem.out.println(setName);
  }

}