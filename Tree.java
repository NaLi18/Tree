public class Tree{
  
  Node root;
  int size;
  //default constructor 
  public Tree(){
    root = null;
    size = 0;
  }
  /*
   * the search method that finds and returns the node that matches a search key 
   */
  public Node search(String str){
    Node temp = root;
    boolean found = false;
    while(!found){
      if(temp.getValue() == str){
        found = true;
      }
      else {
        if(temp.getLeft() != null){
          temp = temp.getLeft();
        }
        else{
          temp = temp.getRight();
        }
      }
    }
    return temp;
  }
}