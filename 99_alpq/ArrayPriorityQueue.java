//temp solution if the size is 0, returning null instead of exception
//will figure out

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
  ArrayList<Integer> pq;

  public ArrayPriorityQueue() {
    pq = new ArrayList();
  }

  public void add(Integer x) {
    pq.add(x);
  }

  public boolean isEmpty() {
    if (pq.size() != 0) {
      return false;
    }
    return true;
  }

  public Integer peekMin() {
    Integer min = (Integer)pq.get(0);
    if (pq.size() == 0) {
      return null;
    }
    if (pq.size() == 1) {
      return min;
    }
    for (int i = 1; i < pq.size(); i++) {
      if (min.compareTo((Integer)pq.get(i)) == 1) {
        min = (Integer)pq.get(i);
      }
    }
    return min;
  }

  public Integer removeMin() {
    Integer min = (Integer)pq.get(0);
    int minInd = 0;
    if (pq.size() == 0) {
      return null;
    }
    if (pq.size() == 1) {
      return min;
    }
    for (int i = 1; i < pq.size(); i++) {
      if (min.compareTo((Integer)pq.get(i)) == 1) {
        min = (Integer)pq.get(i);
        minInd = i;
      }
    }
    pq.remove(minInd);
    return min;
  }

  //for easier viewing, not sure if this is the best toString
  public String toString() {
    String output = "";
    for (int i = 0; i < pq.size(); i++) {
      output += pq.get(i) + ", ";
    }
    return output;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue apq = new ArrayPriorityQueue();
    System.out.println(apq.isEmpty()); //true
    apq.add(-50);
    for (int i = 0; i < 10; i++) {
      apq.add(i);
    }
    apq.add(-100);
    System.out.println(apq.isEmpty()); //false
    System.out.println(apq);
    System.out.println(apq.peekMin());
    System.out.println(apq.removeMin());
    System.out.println(apq + "\n");

    while (apq.isEmpty() == false) {
      System.out.println(apq.removeMin());
      System.out.println(apq);
    }
  }
}
