import java.util.Scanner;
import java.io.*;

public class Demo{
  public static void main(String[] args)throws IOException
  {
    String filename;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the filename");
    filename = keyboard.nextLine();
    PrintWriter outputFile = new PrintWriter(filename);
    
    //This sentence repeats words because a sentence that repeats words makes a good example sentence.
    System.out.println("Adding the data to the file");
    outputFile.println("This");
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
  }
}