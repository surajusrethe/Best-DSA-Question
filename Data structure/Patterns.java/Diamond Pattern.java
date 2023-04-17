/************************************************************ Question **************************************************************************/

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


/************************************************************ Approach **************************************************************************/

- Triangle and Invert Triangle ke code ko merge kar do Diamonf oprint ho jayega.

/************************************************************ Code **************************************************************************/

public class Pattern {
    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {   // For each row
            for (int j = 1; j <= n - i; j++) {   // Print spaces before stars
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {   // Print stars
                System.out.print("*");
            }

            System.out.println();   // Move to next line
        }
      
      for (int i = n; i >= 1; i--) {   // For each row
            for (int j = 0; j < n - i; j++) {   // Print spaces before stars
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {   // Print stars
                System.out.print("*");
            }

            System.out.println();   // Move to next line
        }
    }
}


/************************************************************ Dry Run **************************************************************************/

Let's consider n = 3:

/*

Iteration 1:
    i = 1
    First loop: j = 1 to 2, prints 2 spaces
    Second loop: k = 1 to 1, prints 1 star
    Output: "  *"

Iteration 2:
    i = 2
    First loop: j = 1, prints 1 space
    Second loop: k = 1 to 3, prints 3 stars
    Output: " ***"

Iteration 3:
    i = 3
    First loop: j = 0, doesn't print any space
    Second loop: k = 1 to 5, prints 5 stars
    Output: "*****"

Iteration 4:
    i = 3
    First loop: j = 0, doesn't print any space
    Second loop: k = 1 to 5, prints 5 stars
    Output: "*****"

Iteration 5:
    i = 2
    First loop: j = 1, prints 1 space
    Second loop: k = 1 to 3, prints 3 stars
    Output: " ***"

Iteration 6:
    i = 1
    First loop: j = 1 to 2, prints 2 spaces
    Second loop: k = 1 to 1, prints 1 star
    Output: "  *"

*/
