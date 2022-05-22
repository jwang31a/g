// Big Bird :: Raven (Ruiwen) Tang, Jun Hong Wang, Michael Kamela
// APCS pd6
// HW103 -- Erica's Friends, Hugo, and The One in the Middle
// 2022-05-17w
// time spent: 1.0 hrs

/*
DISCO:
We can java FileName < InputFile to use a file for input.

QCC:
We decided to add a size method to both of the heaps, since we didn't how else we could balance the heaps.
We also did not use our implementation of the heaps and took from the library instead, because the library code was cleaner and more manageable.

We added a balance method to clean up code.

In the driver file, we removed the print statements, but everything works as expected.

Is the median supposed to be 499999.5?

ALGO:
If bigVals is empty, we add to lilVals.
Otherwise, we compare the value of the new value to the roots of the two heaps.
If it's smaller than the root of the maxheap, we add it there.
Otherwise, we add to the minheap.
After everything, we balance the heaps.

Our balance method doesn't do anything if the difference isn's greater than or equal to 2.
However, if it is, it will remove the root of one heap and add it to the other heap.
*/

public class RunMed {
  private ALHeapMax lilVals;
  private ALHeapMin bigVals;

  //constructor
  public RunMed() {
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public double getMedian() {
    //if same amount of elements in both heaps take avg of roots
    if (lilVals.size() == bigVals.size()) {
      return (lilVals.peekMax() + bigVals.peekMin()) / 2.0;
    }
    //if lilvals has more
    else if (lilVals.size() > bigVals.size()) {
      return lilVals.peekMax();
    }
    //if bigvals mas more
    else {
      return bigVals.peekMin();
    }
  }

  public void add(Integer newVal) {
    //for beginning (first two adds) when bigvals is empty
    if (bigVals.peekMin() == null) {
      lilVals.add(newVal);
    }
    //for second addition, when lilVals has something, but bigVals doesn't
    else {
      if (newVal <= lilVals.peekMax()) {
        lilVals.add(newVal);
      } else {
        bigVals.add(newVal);
      }
    }
    //balance after everything is done, doesn't necessarily do anything
    balance();
  }

  //helper method
  private void balance() {
    //lilvals is bigger, not balanced
    //move from lilVals to bigVals
    if (lilVals.size() - bigVals.size() >= 2) {
      bigVals.add(lilVals.removeMax());
    }
    //bigvals is bigger, not balanced
    //move from big to small
    else if (bigVals.size() - lilVals.size() >= 2) {
      lilVals.add(bigVals.removeMin());
    }
  }
}
