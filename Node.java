public class Node{
  
  Node left;
  Node right;
  String str;
  //default constructor
  public Node(){
    this.left = null;
    this.right = null;
    str = null;
  }
  //overloading Constructor
  public Node(String s, Node l, Node r){
    this.str = null;
    this.left = l;
    this.right = r;
  }
  // The Get methods
  public Node getLeft(){
    return this.left;
  }
  public Node getRight(){
    return this.right;
  }
  public String getValue(){
    return this.str;
  }
  
}