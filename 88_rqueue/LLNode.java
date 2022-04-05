//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW88 - BPC Kiddies Do Not Wait in Line Either
//2022-04-03m
//time spent: 0.75 hr
public class LLNode<SWASHBUCKLE>
{
  //instance vars
  private SWASHBUCKLE _cargo;    //cargo may only be of type T
  private LLNode<SWASHBUCKLE> _nextNode; //pointer to next LLNode<T>

  // constructor -- initializes instance vars
  public LLNode( SWASHBUCKLE value, LLNode<SWASHBUCKLE> next ) {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public SWASHBUCKLE getCargo() { return _cargo; }

  public LLNode<SWASHBUCKLE> getNext() { return _nextNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo ) {
    SWASHBUCKLE foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<SWASHBUCKLE> setNext( LLNode<SWASHBUCKLE> newNext ) {
    LLNode<SWASHBUCKLE> foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }

}//end class LLNode
