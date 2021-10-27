public class Repeater{
  String output="|";
  
  public String getOutput() {
    return(output);
  }
  
  String fenceW(int numPosts){
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
  
  String fenceR(int numPosts){
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
    fenceW(0);
    fenceW(1);
    fenceW(2);
    fenceR(0);
    fenceR(1);
    fenceR(2);
  }
}
