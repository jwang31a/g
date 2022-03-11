
// based on interface List
public interface List {
  //we also need nodes (cons)
  //what should a node do?
  /*
  node should:
  value (string)
  linkage to next node

  get built
  return cargo
  modify cargo
  return next node
  modify next node
  */

  public boolean add(String x);
  public String get(int i);
  public String set(int i, String x);
  public int size();
}
