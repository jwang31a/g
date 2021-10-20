/**
  Team NBJ, Jun Hong Wang, Brian K., Nada Hameed
  APCS pd6
  HW20 -- External Audit
  2021-10-19
  
  DISCO:
  I don't think this is intended, but setting the account balance, and depositing into the account can be done regardless of if authenicate works or not. Not only that, but I'm not sure if their withdraw and deposit methods work as intended.
  
  QCC:
  
  What operations are possible from BankAccount's main method but not Teller's?
  Initially, authenticate() was a private method, only accessible from BankAccount.java, but we changed it to public so it could be accessed here.
**/

public class Teller {
  public static void main( String[] args ) {
    BankAccount ba = new BankAccount();
    System.out.println(ba.toString());
  //prints errors
    
    short badPin = 0100;
    ba.setName("badPepe");
    ba.setPasswd("PepeIsBad");
    ba.setPin(badPin);
    ba.setAcctNum(000000001);
    System.out.println(ba.toString());
    ba.setBalance(1000.00);
    ba.deposit (200.00);
    ba.withdraw(10000.99);
    System.out.println("Authentication " + ba.authenticate(0000000001, "PepeIsBad"));
    
//prints full info
  short pin = 1234;
    ba.setName("Pepe");
    ba.setPasswd("PepeIsGod");
    ba.setPin(pin);
    ba.setAcctNum(123456789);
    System.out.println(ba.toString());
    ba.setBalance(10000000.00);
    ba.deposit(0);
    ba.withdraw(0);
    System.out.println("Authentication " + ba.authenticate(123456789, "PepeIsGod"));
  }
}
