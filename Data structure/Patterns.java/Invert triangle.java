*********
 *******
  *****
   ***
    *
/*************************************************** Appraoch ***************************************************/

- Har row ke liye, pehle spaces print karenge. Spaces ke quantity 0 se start hogi aur rows ke hisaab se badhti jayegi.
- Fir, stars print karenge. Stars ke quantity rows se shuru hogi aur 1 tak kam ho jayegi.
- Har row ke baad, new line print karenge.
 
/*************************************************** Code ***************************************************/

public class Pattern {
    public static void printTriangle(int n) {
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


/*************************************************** Dry run ***************************************************/

i = 5
*********     (0 spaces, 9 stars)
i = 4
 *******      (1 space, 7 stars)
i = 3
  *****       (2 spaces, 5 stars)
i = 2
   ***        (3 spaces, 3 stars)
i = 1
    *         (4 spaces, 1 star)
