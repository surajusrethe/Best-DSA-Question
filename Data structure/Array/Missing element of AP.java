/******************************************************* Question ***********************************************************/

/*
Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There always exists an element which upon inserting into sequence forms Arithmetic progression. Boundary elements (first and last elements) are not missing.

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.
*/

Note: A sequence of numbers that has a fixed common difference between any two consecutive numbers is called an arithmetic progression (A.P.). 
      The example of A.P. is 3,6,9,12,15,18,21, …


/******************************************************** Appraoch ***********************************************************/

Approach 1:

/*
- We can solve this problem by using the formula for the sum of an Arithmetic Progression, which is:
  sum = (n/2) * (2a + (n-1)d)

- where n is the number of elements in the AP,
  a is the first element, 
  and d is the common difference.

-To find the missing element, we first calculate the sum of the given array.
  We can then find the sum of the actual AP by using the formula above with n = N+1 (since we are adding one element to the array), and solve for the missing element.*/

Approach 2:

/*

- calculate the common difference
- iterate through the array to check for missing element
- there is a missing element between arr[i] and arr[i+1]
- return the missing element


*/





/******************************************************** Code ***********************************************************/


//Approach 1:

public class Solution {
    public int findMissing(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int actualSum = ((n + 1) * (arr[0] + arr[n-1])) / 2;
        return actualSum - sum;
    }
}

....................................................................................................................................
  
  
//Approach 2:

class Solution 
{
    int findMissing(int[] arr, int n)
    {
        // calculate the common difference
        int d = (arr[n-1] - arr[0]) / n;
        
        // iterate through the array to check for missing element
        for (int i = 0; i < n-1; i++) 
        {
            if (arr[i+1] - arr[i] != d) 
            {
                // there is a missing element between arr[i] and arr[i+1]
                // return the missing element
                return arr[i] + d;
            }
        }
        
        // no missing element found
        return -1;
    }
}



/******************************************************** Dry Run ***********************************************************/

 Appraoch 2: dry run
 
 /*
 
 int[] arr = {35, 50, 80};
int n = 3;

d = (80 - 35)/3 = 15;

Iterating through the array:
i = 0, arr[i] = 35, arr[i+1] = 50, arr[i+1]-arr[i] = 50-35 = 15 == d, continue to next iteration

i = 1, arr[i] = 50, arr[i+1] = 80, arr[i+1]-arr[i] = 80-50 = 30 != d, missing element is arr[i]+d = 50+15 = 65, return 65


Given array:  35, 50, 80
Valid AP:      35, 50, 65, 80
Missing Element: 65


 */



