12345
1234
123
12
1


- just print the number of columns code is same as previous one




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
                System.out.print(j);
            }
            
            // Move to the next line after printing the characters in the row
            System.out.println();
        }
        		
	}
}
