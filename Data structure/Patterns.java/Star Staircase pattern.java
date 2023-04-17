/************************************************************ Question **************************************************************************/

Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*

/************************************************************ Approach **************************************************************************/

/*
- Loop through each row: The outer loop is used to loop through each row, from 1 to n in the first half, and from n-1 to 1 in the second half.

- Print stars: The inner loop is used to print the stars in each row, starting from 1 in the first row, and increasing by 1 for each subsequent row in the first half,   and starting from n-1 in the second-last row, and decreasing by 1 for each subsequent row in the second half.

- Move to next line: After printing the stars for each row, we move to the next line using the System.out.println() statement. This is to ensure that each row is         printed on a new line.
*/

/************************************************************ Code **************************************************************************/

public class Pattern {
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {   // For each row
            for (int j = 1; j <= i; j++) {   // Print stars
                System.out.print("* ");
            }
            System.out.println();   // Move to next line
        }

        for (int i = n-1; i >= 1; i--) {   // For each row
            for (int j = 1; j <= i; j++) {   // Print stars
                System.out.print("* ");
            }
            System.out.println();   // Move to next line
        }
    }
}


/************************************************************ Dry run **************************************************************************/


let's say n = 5;

Iteration 1:
    i = 1
    j = 1
    Prints: *
    
Iteration 2:
    i = 2
    j = 3
    Prints: * * *
    
Iteration 3:
    i = 3
    j = 2
    Prints: * * * * * 
    
Iteration 4:
    i = 4
    j = 1
    Prints: * * * * * * * 
    
Iteration 5:
    i = 5
    j = 0
    Prints: * * * * * * * * *
    
Iteration 6:
    i = 4
    j = 1
    Prints: * * * * * * * 
    
Iteration 7:
    i = 3
    j = 2
    Prints: * * * * * 
    
Iteration 8:
    i = 2
    j = 3
    Prints: * * * 
    
Iteration 9:
    i = 1
    j = 4
    Prints: *
