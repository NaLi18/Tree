/*
 * Name:Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
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
  /*
   * The move method which move a subtree to another tree
   * @param n the adding subtree
   */
  public void move(Node n){
    if(n != null){
      if(str.compareTo(n.getValue())>0){
        if(this.left!= null){
          this.left.move(n);
        }
        else{
          this.left = n;
          n.setParent(this);
        }
      }
      else{
        if(this.right!= null){
          this.right.move(n);
        }
        else{
          this.right = n;
          n.setParent(this);
        }
      }
    }
  }
  /*
   * The switchNode tree which switch the position of parent and children
   */
  public void switchNode(){
    if(parent!= null){
      if(str.compareTo(parent.getValue())<0){
        if(right!=null){
          right.move(parent);
        }
        right = parent;
        right.setParent(this);
      }
      else{
        if(left!=null){
          left.move(parent);
        }
        
        left = parent;
        left.setParent(this);
      }
    }
  }
}