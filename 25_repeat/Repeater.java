public class Repeater{
  /*
  String output="|";
  
  
  public String getOutput() {
    return(output);
  }
  */
  
  static String fenceW(int numPosts){
    String output = "|";
    if(numPosts-1==0){
      System.out.println(output);
    }
    else{
      if (numPosts != 0){
        output+="--|";
        fenceW(numPosts-1);
      }
      else{
        output=" ";
        return output;
      }
    }
  }
  
  static String fenceR(int numPosts){
    String output = "|";
      while (numPosts>1){
        output+="|--";
        numPosts-=1;
       }
        output+="|";
        if (numPosts==0){
          output=" " ;
        }
    return output;
  }

  public static void main (String [] args){
    System.out.println(fenceW(0));
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceR(0));
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
  }
}
