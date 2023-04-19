/******************************************************** Question **************************************************************/

/*
Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.
*/


/******************************************************** Approach  **************************************************************/

/*
- Sort the ArrayList in ascending order.
- Initialize a variable minDiff to the maximum value of long.
- Loop over all possible ranges of m elements.
- Calculate the difference between the largest and smallest elements in each range.
- Update minDiff with the current difference if it is smaller than the current minDiff.
*/

/******************************************************** Code **************************************************************/


class Solution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m) {
        Collections.sort(a); // Sort the array in ascending order
        
        long minDiff = Long.MAX_VALUE; // Initialize the minimum difference to the maximum value of long
        
        // Loop over all possible ranges of m elements starting from index 0 up to index n-m
        for(int i = 0; i <= n - m; i++) {
            long diff = a.get(i + m - 1) - a.get(i); // Calculate the difference between the largest and smallest elements in the current range
            if(diff < minDiff) { // If the current difference is smaller than the current minimum difference
                minDiff = diff; // Update the minimum difference
            }
        }
        
        return minDiff; // Return the minimum difference
    }
}



/******************************************************** Dry Run **************************************************************/

/*
Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}

After sorting, the array becomes:
A = {1, 3, 4, 7, 9, 9, 12, 56}

We loop over all possible ranges of 5 elements:
For i=0, range is {1, 3, 4, 7, 9}, diff is 9-1=8
For i=1, range is {3, 4, 7, 9, 9}, diff is 9-3=6
For i=2, range is {4, 7, 9, 9, 12}, diff is 12-4=8
For i=3, range is {7, 9, 9, 12, 56}, diff is 56-7=49

The minimum difference is 6 by choosing the range {3, 4, 7, 9, 9}.

*/
