/**
  Team NBJ, Jun Hong Wang, Brian K., Nada Hameed
  APCS pd6
  HW20 -- External Audit
  2021-10-19
  
  DISCO:
  I don't think this is intended, but setting the account balance, and depositing into the account can be done regardless of if authenicate works or not. Not only that, but I'm not sure if their withdraw and deposit methods work as intended.
  In the first bank account, we were able to subtract money, even when our credentials were false.
  We also went through their code, and the pins 1000 and 9998 aren't valid, when they should be.
  
  QCC:
  The toString method that prints out all of the account information feels like it's in the wrong place, and it might print out outdated information.
  A common issue between BankAccounts is that we don't account for depositing negative numbers, and this pretty much allows us to steal from accounts. 
  In the first account, we were able to empty the bank account using this.
  
  What operations are possible from BankAccount's main method but not Teller's?
  Initially, authenticate() was a private method, only accessible from BankAccount.java, but we changed it to public so it could be accessed here.
**/

public class Teller {
  public static void main( String[] args ) {
    BankAccount ba = new BankAccount();
    System.out.println(ba.toString());
  
    
    short badPin = 0100;
    ba.setName("badPepe");
    ba.setPasswd("PepeIsBad");
    ba.setPin(badPin);
    ba.setAcctNum(000000001);
    ba.setBalance(100000000);
    ba.deposit (-200000000);
    ba.withdraw(0);
    System.out.println("Authentication " + ba.authenticate(0000000001, "PepeIsBad"));
    System.out.println(ba.toString());

  short pin = 1234;
    ba.setName("Pepe");
    ba.setPasswd("PepeIsGod");
    ba.setPin(pin);
    ba.setAcctNum(123456789);
    
    ba.setBalance(20000000.00);
    ba.deposit(0);
    ba.withdraw(0);
    System.out.println("Authentication " + ba.authenticate(123456789, "PepeIsGod"));
    System.out.println(ba.toString());
  }
}
