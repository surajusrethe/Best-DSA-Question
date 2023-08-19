Nth Root of a Number using Binary Search

Initialize two pointers low=1, high=n;
Find mid = (low+high)/2;
How we can find the Square root of the number? Multiply if n time. Means if n=3 so 3*3*3 = 27 if it equal so we return it else we move.
So write a different function to calculate the square for each number means mid.
func(int mid, int n, int m){ long ans = 1; iterate i=1; i<=n;
 	ans = ans*mid; if (ans > m) return 2;} if(ans == m) return 1; else return 0;

If func return 1 means thats the value return it
If func return 0 means mid < m so low = mid +1;
if  func return 2 means mid > m so high = mid -1;

public class tUf {
    //Return 1 if mid == m
    //Return 0 if mid < m
    //Return 2 if mid > m
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }


    public static int NthRoot(int n, int m) {
        // Use binary search on the answer space:
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }



Dry run:

    | Iteration |   low |  high |   mid |  midN |
    |-----------|-------|-------|-------|-------|
    |         1 |     1 |    27 |    14 |     0 |
    |         2 |    15 |    27 |    21 |     0 |
    |         3 |    22 |    27 |    24 |     0 |
    |         4 |    25 |    27 |    26 |     0 |
    |         5 |    27 |    27 |    27 |    -1 |
