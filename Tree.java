public class Tree{
  
  private Node root;
  private int size;
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
  public void insert(String str){
    insert(root,str);
  }
 public void insert(Node temp, String str){
    Node n = new Node(str);
    if(this.isEmpty()){
      root = new Node(str);
       System.out.println("add " + str +" as root");
    }
    else{
      if(temp!=null){
        if(str.compareTo(temp.getValue())<0){
         // System.out.println("the " + str +" is less than "+ temp.getValue());
          if(temp.getLeft()!=null){
            insert(temp.getLeft(),str);
          }
          else{
            System.out.println("add " + str +" to the left of the " + temp.getValue());
            temp.setLeft(n);
            n.setParent(temp);
          }
        }
        else if(str.compareTo(temp.getValue())>0){
           //System.out.println("the " + str +" is greater than "+ temp.getValue());
           if(temp.getRight()!=null){
            insert(temp.getRight(),str);
           }
           else{
            System.out.println("add " + str +" to the right of the " + temp.getValue());
            temp.setRight(n);
            n.setParent(temp);
           }
        }
        else{
          System.out.println("add " + str +" more than one "+ " times");
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
  public void printInorder(){
    inorderPrint(root);
  }
  
  public void inorderPrint(Node r){
    if(r!=null){
      inorderPrint(r.getLeft());
      System.out.print(r.getValue()+" ");
      inorderPrint(r.getRight());
    }
  }
  /*
   * The delete method that deletes a node from the tree
   */
  public void delete(String s){
    if(search(s)!=null){
      Node temp = search(s);
      if(temp.getRight()!= null){
        temp.getRight().setLeft(temp.getLeft());
        temp = temp.getRight();
      }
      else if(temp.getLeft()!=null){
        temp = temp.getLeft();
      }
      else
        temp = null;
    }
    else
    {
      System.out.println(s + " doesn't exist on the tree");
    }
  }
  //The counter method 
  public int counter(String str){
    int wordsCounter = 0;
    if(search(str)!=null){
      wordsCounter++;
    }
    return wordsCounter;
    }
 }