/*
                      1
                      12
                      123
                      1234
                      12345
*/

/*
Approach:

- Each row of the pattern contains numbers from 1 up to the row(i) number. 
- The first row contains the number 1,
- The second row contains the numbers 1 and 2, and so on. 
- The pattern is printed vertically with each row on a new line.
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		// Outer loop to control the number of rows
		for(int i=1; i<=n; i++){
		    
		    // Inner loop to print the characters in each row
		    for(int j=1; j<=i; j++){
		        
		        System.out.print(j); // Print the current value of j
		    }
		    System.out.println(); // Move to the next line after printing the characters in the row
		}
		
	}
}
