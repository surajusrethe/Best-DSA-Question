1
22
333
4444
55555

is me hum number of of row print karwa rahe hai
  
- Each row of the pattern contains the same number as the row number, 
- Repeated the same number of times as the row number. 
- The first row contains the number 1 repeated once, the second row contains the number 2 repeated twice, and so on. 
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
            for(int j=1; j<=i; j++){
                
                // Print the current value of i (the row number)
                System.out.print(i);
            }
            
            // Move to the next line after printing the characters in the row
            System.out.println();
        }
        		
	}
}
