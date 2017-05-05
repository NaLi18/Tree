public class Node{
  
  private Node left;
  private Node right;
  private Node parent;
  private String str;
  private int counter;
  //default constructor
  public Node(String s){
    this.left = null;
    this.right = null;
    this.parent = null;
    this.str = s;
    this.counter = 1;
  }
  //overloading Constructor
  public Node(String s, Node l, Node r, Node p){
    this.str = null;
    this.left = l;
    this.right = r;
    this.parent = p;
    this.counter = 1;
  }
  //The set methods
  public void setParent(Node p){
    this.parent = p;
  }
  public void setCounter(){
    counter = counter+1;
  }
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
  public int getCounter(){
    return counter;
  }
  public Node getRight(){
    return this.right;
  }
  public String getValue(){
    return this.str;
  }
  public Node getParent(){
    return this.parent;
  }
  //The print method
  public void print(){
    System.out.print(str +" ");
  }
  
  public void move(Node n){
      if(str.compareTo(n.getValue())<0){
        while(this.left!= null){
        this.left.move(n);
        }
        this.left = n;
      }
      else{
        while(this.right!= null){
        this.right.move(n);
        }
        this.right = n;
      }
  }
}