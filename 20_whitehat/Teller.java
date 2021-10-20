/**
  Team NBJ, Jun Hong Wang, Brian K., Nada Hameed
  APCS pd6
  HW20 -- External Audit
  2021-10-19
  
  DISCO:
  
  QCC:
  
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
    System.out.println("Authentication " + ba.authenticate(123456789, "PepeIsGod"));
    
//prints full info
  short pin = 1234;
    ba.setName("Pepe");
    ba.setPasswd("PepeIsGod");
    ba.setPin(pin);
    ba.setAcctNum(123456789);
    System.out.println(ba.toString());
    ba.setBalance(10000000.00);
    ba.deposit(-200000.00);
    ba.withdraw(200.00);
    System.out.println("Authentication " + ba.authenticate(123456789, "PepeIsGod"));
  }
}
