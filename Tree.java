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
    return search(root,str);
  }
  
  public Node search(Node temp, String str){
    if(temp!= null){
      if(temp.getValue().equals(str)){
        return temp;
      }
      else if(temp.getValue().compareTo(str)>0){
          return this.search(temp.getLeft(),str);
        }
      else{
          return this.search(temp.getRight(), str);
        }
    }
    else{
      return temp;
    }
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
            //System.out.println("add " + str +" to the left of the " + temp.getValue());
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
           // System.out.println("add " + str +" to the right of the " + temp.getValue());
            temp.setRight(n);
            n.setParent(temp);
           }
        }
        else{
          temp.setCounter();
          //System.out.println(temp.getValue()+" add " + temp.getCounter()+" times.");
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
      System.out.println(r.getValue()+" "+r.getCounter());
      inorderPrint(r.getRight());
    }
  }
  /*
   * The delete method that deletes a node from the tree
   */
  public void delete(String s){
    if(search(s)!=null){
      Node temp = search(s);
      if(temp.getParent()==null){
        Node temp1;
        if(temp.getLeft()!=null){
          if(temp.getRight()!=null){
          root = temp.getLeft();
          root.setParent(null);
          root.getRight().move(temp.getRight());
          }
          else{
            root = temp.getLeft();
            root.setParent(null);
          }
        }
      }
      else{
        if(temp.getParent().getValue().compareTo(s)>0){
          if(temp.getLeft()!= null){
            temp.getParent().setLeft(temp.getLeft());
            temp.getLeft().setParent(temp.getParent());
            if(temp.getRight()!=null){
              temp.getLeft().move(temp.getRight());
            }
          }
          else{
            if(temp.getRight()!=null){
              temp.getParent().setLeft(temp.getRight());
              temp.getRight().setParent(temp.getParent());
            }
            else{
            temp.getParent().setLeft(null);
            temp = null;
            }
          }
        }
        else{
          if(temp.getRight()!= null){
            temp.getParent().setRight(temp.getRight());
            temp.getRight().setParent(temp.getParent());
            if(temp.getLeft()!=null){
              temp.getRight().move(temp.getLeft());
            }
          }
          else{
            if(temp.getLeft()!=null){
              temp.getParent().setRight(temp.getLeft());
              temp.getLeft().setParent(temp.getParent());
            }
            else{
            temp.getParent().setRight(null);
            temp = null;
            }
          }
        }
      }
    }
    else{
      System.out.println(s+" doesn't exsit on the tree");
    }
  }
   /*
   * The Postorder traversal to print the tree
   */
  public void printPostorder(){
    this.printPostorder(root);
  }
  public void printPostorder(Node r){
    if(r!=null){
      inorderPrint(r.getLeft());
      inorderPrint(r.getRight());
      System.out.println(r.getValue()+" "+r.getCounter());
    }
  }
   /*
   * The Preorder traversal to print the tree
   */
  public void printPreorder(){
    this.printPreorder(root);
  }
  public void printPreorder(Node r){
    System.out.println(r.getValue()+" "+r.getCounter());
    inorderPrint(r.getLeft());
    inorderPrint(r.getRight());
  }
  /*
   * The is isBalance method(need complete)
   */
  public boolean isBalance(){
    return false;
  }
   /*
   * Balance the tree
   */
  public void balance(){
    
  }
 }