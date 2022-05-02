package cancer;

import java.io.*;
import java.math.*;
import java.lang.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author dikar9960
 */
public class Cancer {

    private String[][] grid =new String[15][15];
    
    public static void main(String[] args) {
    
    //try catch for file scanning
    
    String Cstr = "";
      try {
      File Ctxt = new File("Cancer.txt");
      Scanner scan = new Scanner(Ctxt);
      Cstr = scan.nextLine();
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      
        System.out.println(Cstr);
  }

}
