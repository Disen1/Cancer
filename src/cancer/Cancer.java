package cancer;

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author dikar9960
 */
public class Cancer {

    private static String[][] grid =new String[17][17];
    private static int numcan=0;
    
    public static void main(String[] args) {
    
    //try catch for file scanning
    String Cstr = "";
    try {
      File Ctxt = new File("Cancer.txt");
      Scanner scan = new Scanner(Ctxt);
      while(scan.hasNextLine())
      {
          Cstr += scan.nextLine();
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    //Putting String in to grid
    int i = 0;
    for(int r=0;r<grid.length;r++)
    {
       for(int c=0;c<grid[r].length;c++)
       {
           grid[r][c]=Cstr.substring(i,i+1);
           i++;
       }
    }
    
    //printing out grid
    for(int r=0;r<grid.length;r++)
    {
       for(int c=0;c<grid[r].length;c++)
       {
           System.out.print(grid[r][c]);
       }
        System.out.println();
    }
    
    //scanning the grid for cancers  
    for(int r=1;r<grid.length;r++)
    {
       for(int c=1;c<grid[r].length;c++)
       {
           if(grid[r][c].equals("-"))
          {
                   search(r,c);
                   numcan++;
          }
       } 
    }
    
    for(int r=0;r<grid.length;r++)
    {
       for(int c=0;c<grid[r].length;c++)
       {
           System.out.print(grid[r][c]);
       }
        System.out.println();
    }
    
    //printing ammount of cancers
    System.out.println("Number of cancers = " + numcan);
  }
    
    //searching method
    public static void search(int r, int c)
    {
        if(grid[r][c].equals("-"))
        {
            grid[r][c] = " ";
            search(r-1,c-1);
            search(r-1,c);
            search(r-1,c+1);
            search(r,c-1);
            search(r,c+1);
            search(r+1,c-1);
            search(r+1,c);
            search(r+1,c+1);
        }
    }
    
}
