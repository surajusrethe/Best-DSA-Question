/****************************************************************** Question ******************************************************************/
/*
The hiring team aims to find 3 candidates who are great collectively. Each candidate has his or her ability expressed as an integer. 3 candidates are great collectively if product of their abilities is maximum. Given abilities of N candidates in an array arr[], find the maximum collective ability from the given pool of candidates.


Example 1:

Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
Explanation:
Multiplication of 10, 6 and 20 is 1200.
*/

/****************************************************************** Approach ******************************************************************/

Approach:

/*
- Initialize three maximum and two minimum variables to minimum and maximum integer values.
- Iterate through the array and update the maximum and minimum variables accordingly.
- Calculate the maximum product by multiplying the three largest numbers or the largest number   with the two smallest numbers.
- Return the maximum product.
*/


/****************************************************************** Code ******************************************************************/


class Solution 
{
    long maxProduct(int[] arr, int n) 
    {
        if (n < 3) return -1;

        // Initialize the three maximum and two minimum elements
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) 
        {
            // Update the three maximum elements
            if (arr[i] > max1) 
            {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } 
            
            else if (arr[i] > max2) 
             {
                max3 = max2;
                max2 = arr[i];
             } 
             else if (arr[i] > max3) { max3 = arr[i]; }
             

            // Update the two minimum elements
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } 
            else if (arr[i] < min2) { min2 = arr[i]; }
        }

        // Calculate the maximum product
        long maxProduct1 = (long) max1 * max2 * max3;
        long maxProduct2 = (long) max1 * min1 * min2;
        return Math.max(maxProduct1, maxProduct2);
    }
}

/****************************************************************** Dry run ******************************************************************/


arr[] = {10, 3, 5, 6, 20}

Step 1: Initialize three maximum and two minimum variables to minimum and maximum integer values.
           max1, max2, max3 = MIN_VALUE
           min1, min2 = MAX_VALUE

Step 2: Iterate through the array and update the maximum and minimum variables accordingly.
           For i = 0:
               max1 = 10, max2 = MIN_VALUE, max3 = MIN_VALUE
               min1 = MAX_VALUE, min2 = MAX_VALUE

           For i = 1:
               max1 = 10, max2 = 3, max3 = MIN_VALUE
               min1 = 3, min2 = MAX_VALUE

           For i = 2:
               max1 = 10, max2 = 5, max3 = 3
               min1 = 3, min2 = 5

           For i = 3:
               max1 = 10, max2 = 6, max3 = 5
               min1 = 3, min2 = 5

           For i = 4:
               max1 = 20, max2 = 10, max3 = 6
               min1 = 3, min2 = 5

Step 3: Calculate the maximum product by multiplying the three largest numbers or the largest number with the two smallest numbers.
           maxProduct1 = max1 * max2 * max3 = 20 * 10 * 6 = 1200
           maxProduct2 = max1 * min1 * min2 = 20 * 3 * 5 = 300

Step 4: Return the maximum product.
           The maximum product is 1200.
