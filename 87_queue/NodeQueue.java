//Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
//APCS pd6
//HW87 - The British Do Not Wait in Line For Soup
//2022-04-02m
//time spent: 0h

public class NodeQueue<QUASAR> {
  private LLNode<QUASAR> head;

  public NodeQueue() {
    head = new LLNode(null, null);
  }

  public QUASAR dequeue() {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }

    LLNode temp = head;
    QUASAR removed;
    //System.out.println(temp.getCargo());
    while (temp.getNext().getNext() != null) {
      temp = temp.getNext();
      //System.out.println(temp.getCargo());
    }
    removed = (QUASAR)temp.getCargo();
    temp.setNext(null);
    return removed;
  }

  public void enqueue(QUASAR x) {
    LLNode temp = head;
    head = new LLNode(x, temp);
    //System.out.println(head.getCargo());
  }

  public boolean isEmpty() {
    return (head.getCargo() == null);
  }

  public QUASAR peekFront() {
    if (isEmpty()) {
      return null;
    } else {
      LLNode temp = head;
      QUASAR front;
      while (temp.getNext().getNext() != null) {
        temp = temp.getNext();
        //System.out.println(temp.getCargo());
      }
      front = (QUASAR)temp.getCargo();
      return front;
    }
  }

  //main method with test cases:
  public static void main(String[] args) {
    NodeQueue<String> lemon = new NodeQueue();
    System.out.println(lemon.isEmpty()); //true
    lemon.enqueue("orange");
    lemon.enqueue("lemon");
    lemon.enqueue("mandarin");
    lemon.enqueue("grapefruit");
    lemon.enqueue("citron");
    System.out.println(lemon.isEmpty()); //false

    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());
    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());
    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());
    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());
    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());

    //this should give exception since there is nothing to dequeue
    System.out.println("front is " + lemon.peekFront());
    System.out.println("thing dequeued is " + lemon.dequeue());
  }
}
