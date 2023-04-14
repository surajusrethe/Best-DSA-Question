/*
*****
****
***
**
*
*/


- Each row of the pattern contains a decreasing number of asterisks,
- with the first row having 5 asterisks, 
- the second row having 4 asterisks, and so on. 
- The pattern is printed vertically with each row on a new line.



import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
        // Set the number of rows to be printed
        int n = 5;
        
        // Outer loop to control the number of rows
        for(int i=1; i<=n; i++){
            
            // Inner loop to print the characters in each row
            for(int j=1; j<=n-i+1; j++){
                
                // Print the current value of i (the row number)
                System.out.print("*");
            }
            
            // Move to the next line after printing the characters in the row
            System.out.println();
        }
        		
	}
}
