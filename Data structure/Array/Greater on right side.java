/******************************************************** Question ************************************************************/
/*
You are given an array Arr of size N. Replace every element with the next greatest element (greatest element on its right side) in the array. Also, since there is no element next to the last element, replace it with -1.

Example 1:

Input:
N = 6
Arr[] = {16, 17, 4, 3, 5, 2}
Output:
17 5 5 5 2 -1
Explanation: For 16 the greatest element 
on its right is 17. For 17 it's 5. 
For 4 it's 5. For 3 it's 5. For 5 it's 2. 
For 2 it's -1(no element to its right). 
So the answer is 17 5 5 5 2 -1
*/

/******************************************************** Approach **************************************************************/
/*
- we have to have to find greater element to the right side so why we do not start from the end and go till start.
- for the last element there will no element to it's right so always take arr[n-1] = -1;
- take max_so_far variable to keep the record of maximum element amoung all to the right side and initialize it with arr[n-1];
  keep in mind 1st initialize max_so_far variable than write arr[n-1] = -1;
- iterate over the array and store all the values accordingly;
 */
/******************************************************** Code **************************************************************/


class Solution {
    void nextGreatest(int arr[], int n) {
        // Initializing the maximum element as the last element of the array
        int max_so_far = arr[n-1];
        // Replacing the last element of the array with -1
        arr[n-1] = -1;
        
        // Iterating over the array from the second last element till the first element
        for(int i=n-2; i>=0; i--) {
            // Storing the current element in a temporary variable
            int temp = arr[i];
            // Replacing the current element with the maximum element on its right
            arr[i] = max_so_far;
            
            // Updating the maximum element if the current element is greater than the maximum element
            if(temp > max_so_far) max_so_far = temp;
        }
    }    
}


/******************************************************** Dry run **************************************************************/


arr[] = {16, 17, 4, 3, 5, 2}
n = 6

| Iteration | i | temp | max_so_far | arr        |
|-----------|---|------|------------|------------|
|           |   |      |     2      | -1         |
|     1     | 5 |   2  |     5      |  2         |
|     2     | 4 |   5  |     5      |  5         |
|     3     | 3 |   3  |     5      |  5         |
|     4     | 2 |   4  |     5      |  5         |
|     5     | 1 |  17  |    17      | 17         |
|     6     | 0 |  16  |    17      | 17         |


After the above iterations, the array will be modified to {17, 5, 5, 5, 2, -1} which is the expected output for the given input.



