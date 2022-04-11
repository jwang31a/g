//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW88 - BPC Kiddies Do Not Wait in Line Either
//2022-04-03m
//time spent: 0.75 hr
public class LLNode<DEEZNUTS>
{
  //instance vars
  private DEEZNUTS _cargo;    //cargo may only be of type T
  private LLNode<DEEZNUTS> _nextNode; //pointer to next LLNode<T>

  // constructor -- initializes instance vars
  public LLNode( DEEZNUTS value, LLNode<DEEZNUTS> next ) {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public DEEZNUTS getCargo() { return _cargo; }

  public LLNode<DEEZNUTS> getNext() { return _nextNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public DEEZNUTS setCargo( DEEZNUTS newCargo ) {
    DEEZNUTS foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<DEEZNUTS> setNext( LLNode<DEEZNUTS> newNext ) {
    LLNode<DEEZNUTS> foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }

}//end class LLNode
