public class Tree{
  
  Node root;
  int size;
  //default constructor 
  public Tree(){
    root = null;
    size = 0;
  }
  /*
   * The search method that finds and returns the node that matches a search key 
   * @param str the possible value of node
   * @return the found node which has the value of the paramter
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
  /*
   * the insert method which inserts a node to a tree
   * @param n the node will be add to the tree
   */
  public void insert(Node n){
    if(this.isEmpty()){
      root = n;
    }
    else{
      Node temp = root;
      while(temp!=null)
      {
        if(temp.getValue().compareTo(n.getValue())>0){
          temp = temp.getRight();
        }
        else if(temp.getValue().compareTo(n.getValue())<0){
          temp = temp.getLeft();
        }
        else{
          if(temp.getValue().compareTo(n.getValue())<0)
          temp.setLeft(n);
          else
          temp.setRight(n);
        }
      }
    }
  }
  //Empty method
  public boolean isEmpty(){
    return root == null;
  }
  /*
   * The inorder traversal to print the tree
   */
  public void inorderPrint(Node r){
     if(r != null){
         inorderPrint(r.getLeft());
         System.out.print(r.getValue()+" ");
         inorderPrint(r.getRight());
       }
  }
  
}