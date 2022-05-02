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

    private static String[][] grid =new String[15][15];
    private static int numcan=0;
    
    public static void main(String[] args) {
    
        String Cstr = "";
    //try catch for file scanning
    try {
      File Ctxt = new File("Cancer.txt");
      Scanner scan = new Scanner(Ctxt);
      while(scan.hasNextLine())
      {
          Cstr += scan.nextLine()+"\n";
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //Putting String in to grid
    for(int r=0;r<grid.length;r++)
    {
       for(int c=0;c<grid[r].length;c++)
       {
           grid[r][c]=Cstr.substring(r,r+1);
       }
    }
    //Printing out String   
        System.out.println(Cstr);
        search(1,1);
        System.out.println("Number of cancers = " + numcan);
        System.out.println(grid);
  }
    public static void search(int r, int c)
    {
        if(grid[r][c].equals("-"))
        {
            grid[r][c] = "+";
            search(r-1,c-1);
            search(r-1,c);
            search(r-1,c+1);
            search(r,c-1);
            search(r,c+1);
            search(r+1,c-1);
            search(r+1,c);
            search(r+1,c+1);
        }
        numcan++;
    }
}
