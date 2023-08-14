
Input: 4

Output:
    * 
   ***  
  *****
 *******
 
/****************************************** Appraoch *******************************/
      
- Har row ke liye, pehle spaces print karenge. Spaces ke quantity bhi rows ke hisaab se badhegi.
- Fir, stars print karenge. Stars ke quantity bhi rows ke hisaab se badhegi.
- Har row ke baad, new line print karenge.

/******************************************** Code **********************************/


public class Pattern {
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {   // For each row
            for (int j = 1; j <= n - i; j++) {   // Print spaces before stars
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {   // Print stars
                System.out.print("*");
            }

            System.out.println();   // Move to next line
        }
    }
}

/****************************************** Dry Run *********************************************/

Let's Say n = 4;


i = 1
   *          (3 spaces, 1 star)
i = 2
  ***         (2 spaces, 3 stars)
i = 3
 *****        (1 space, 5 stars)
i = 4
*******       (0 spaces, 7 stars)
