import java.util.Scanner;
import java.io.*;

public class Demo{
  public static void main(String[] args)throws IOException
  {
    String filename;
    Tree trees = new Tree();
    Scanner keyboard = new Scanner(System.in);
   /*
    System.out.print("Enter the filename");
    filename = keyboard.nextLine();
    PrintWriter outputFile = new PrintWriter(filename);
    //Write data to the file
    //This sentence repeats words because a sentence that repeats words makes a good example sentence.
    System.out.println("Adding the data to the file");
    outputFile.println("this");
    outputFile.println("sentence");
    outputFile.println("repeats");
    outputFile.println("words");
    outputFile.println("because");
    outputFile.println("a");
    outputFile.println("sentence");
    outputFile.println("that");
    outputFile.println("repeats");
    outputFile.println("words");
    outputFile.println("makes");
    outputFile.println("a");
    outputFile.println("good");
    outputFile.println("example");
    outputFile.println("sentence");
    outputFile.close();
 */
    // Reading  the data from the file
    File myFile = new File("StudentData");
    Scanner inputFile = new Scanner(myFile);
    while(inputFile.hasNext()){
    String line = inputFile.nextLine();
    trees.insert(line);
    }
    // System.out.println("The first line of the file is: " + line);
    inputFile.close();
    System.out.println("Traversal in inorder " );
    trees.printInorder();
    System.out.println("Traversal in preorder " );
    trees.printPreorder();
    System.out.println("Traversal in postorder " );
    trees.printPostorder();
    /*
    //Debugger and Testing the search method
    System.out.println(trees.search("a"));
    System.out.println(trees.search("this"));
    System.out.println(trees.search("repeats"));
    System.out.println(trees.search("words"));
    System.out.println(trees.search("good"));
    System.out.println(trees.search("out"));
    */
    /*
    //Debugger and Testing the delete method
    trees.delete("a");
    trees.delete("repeats");
    trees.delete("because");
    trees.delete("this");
    trees.delete("that");
    trees.delete("words");
    System.out.println("delete some node from the tree");
    trees.printInorder();
    */
    //Debugger and Testing the postorderPrint and preorderPrint
    
  }
}