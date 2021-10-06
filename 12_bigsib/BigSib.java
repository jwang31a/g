 public class BigSib {
 	public static void main( String[] args ){
 		String greeting;
 		BigSib richard = new BigSib();
		// Still a bit confused as to what richard is, but I think it just takes the place of BigSib here?

        richard.setHelloMsg("Word up");
		// This sets the variable HelloMsg to whatever string is typed in here
        greeting = richard.greet("freshman");
        System.out.println(greeting);

        richard.setHelloMsg("Salutations");
        greeting = richard.greet("Dr. Spaceman");
        System.out.println(greeting);

        richard.setHelloMsg("Hey ya");
        greeting = richard.greet("Kong Fooey");
        System.out.println(greeting);

        richard.setHelloMsg("Sup");
        greeting = richard.greet("mom");
        System.out.println(greeting);
    }
}
