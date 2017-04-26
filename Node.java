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
  //The set methods
  public void setLeft(Node l){
    this.left = l;
  }
  public void setRight(Node r){
    this.right = r;
  }
  public void setValue(String s){
    this.str = s;
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
  public void print(){
    System.out.print(str +" ");
  }
}