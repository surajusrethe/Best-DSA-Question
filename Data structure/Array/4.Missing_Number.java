/************************************************************ Question *********************************************************************/
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

/************************************************************ Approach *********************************************************************/

Approach 1: TC = O(n) && SC = O(1);

/*
- Find difference in AP array.
- Iterate and check if array's last value minus arrya frist value eqal to difference or not
- if value is not equal simply return d+arr[i]; { remeber when you will perform thing operation everytime value will equal to difference except
  the condition where the number is missing in the AP thats why we are returning the current element + differenc to get missing value}
- else return -1;
*/

/************************************************************ Code *********************************************************************/


 class Solution
{
// The findMissing method takes an array arr and its size n as input parameters
    int findMissing(int[] arr, int n)
    {
        // Calculate the common difference between consecutive elements in the array
        int d = (arr[n-1] - arr[0])/n;
        // Loop through the array from the beginning to the second-to-last element
        for (int i = 0; i < n-1; i++) 
        {
            // If the difference between the next element and the current element is not equal to d
            if (arr[i+1] - arr[i] != d) 
            {
                // there is a missing element between arr[i] and arr[i+1], so return the missing element
                return arr[i] + d;
            }
        }
        // If no missing element is found, return -1
        return -1;
    }

}

/************************************************************ Dry run *********************************************************************/

/*
N = 6
Arr[] = {1, 6, 11, 16, 21, 31}

Here's the step-by-step execution of the code:

d = (31 - 1)/6 = 5.

A for loop is started to iterate through the array from the first element to the second-to-last element.

The 1st iteration of the loop compares the difference between the second and first elements of the array with d.
(6 - 1) = 5, which is equal to d. So the loop continues to the next iteration.

The 2nd iteration of the loop compares the difference between the third and second elements of the array with d.
(11 - 6) = 5, which is equal to d. So the loop continues to the next iteration.

The third iteration of the loop compares the difference between the fourth and third elements of the array with d.
(16 - 11) = 5, which is equal to d. So the loop continues to the next iteration.

The fourth iteration of the loop compares the difference between the fifth and fourth elements of the array with d.
(21 - 16) = 5, which is equal to d. So the loop continues to the next iteration.

The fifth iteration of the loop compares the difference between the sixth and fifth elements of the array with d.
(31 - 21) = 10, which is not equal to d. So there is a missing element between arr[4] = 21 and arr[5] = 31.

The missing element is calculated as arr[4] + d = 21 + 5 = 26.

The missing element is returned as the output of the method findMissing().

So, for the input N = 6 and Arr[] = {1, 6, 11, 16, 21, 31}, the code outputs the missing element 26.




MahaRishi Coding
visualize in table
Sure, here's a table visualization of the code execution for the input N = 6 and Arr[] = {1, 6, 11, 16, 21, 31}:

Iteration	arr[i]	arr[i+1]	arr[i+1] - arr[i]	d = (arr[n-1] - arr[0])/n	arr[i] + d
1	1	6	5	5	-
2	6	11	5	5	-
3	11	16	5	5	-
4	16	21	5	5	-
5	21	31	10	5	26
The table shows the value of arr[i] and arr[i+1] for each iteration of the loop, as well as the difference between them (arr[i+1] - arr[i]). It also shows the value of d, which is calculated once before the loop starts, and the value of arr[i] + d, which is returned as the output when a missing element is found. In this case, the missing element is found during the fifth iteration of the loop, where arr[i] = 21 and arr[i+1] = 31, so the missing element is calculated as arr[i] + d = 21 + 5 = 26, and this value is returned as the output of the method findMissing().

*/





/************************************************************ Take away, Pattern *********************************************************************/




/************************************************************ Real World Use *********************************************************************/





