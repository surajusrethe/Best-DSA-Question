/**************************************************** Quesstion ******************************************************/
/*
Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.
 

Example 1:

Input: 
5
1 0 1 1 0

Output: 
0 0 1 1 1
*/

/**************************************************** Quesstion ******************************************************/

Approach 1:

- Count the number of zeros in the array
- Fill the first 'zeroCount' elements with 0
- Fill the remaining elements with 1

Approach 1:

- take 2 pointers left = 0, right = n-1;
- While left pointer is less than right pointer
- if left is 1 than swap with 0
- if left is 0 than increament left.
- if right is 1 than decrement right.  

/**************************************************** Code ******************************************************/

//Approach 1:


class Solution
{
    static void binSort(int A[], int N)
    {
        int zeroCount = 0;

    // Count the number of zeros in the array
    for (int i = 0; i < N; i++) 
    {
        if (A[i] == 0) 
        {
            zeroCount++;
        }
    }
    // Fill the first 'zeroCount' elements with 0
    for (int i = 0; i < zeroCount; i++) 
    {
        A[i] = 0;
    }
    // Fill the remaining elements with 1
    for (int i = zeroCount; i < N; i++) 
    {
        A[i] = 1;
    }
  }
}

...................................................................................................................................

// Approach 2:

class Solution {
    void binSort(int arr[], int n) {
        int left = 0, right = n - 1; // Initialize left and right pointers
        while (left < right) { // While left pointer is less than right pointer
            if (arr[left] == 1 && arr[right] == 0) { // If left element is 1 and right element is 0
                arr[left] = 0; // Swap left element with right element
                arr[right] = 1;
            }
            if (arr[left] == 0) { // If left element is 0, move left pointer to the right
                left++;
            }
            if (arr[right] == 1) { // If right element is 1, move right pointer to the left
                right--;
            }
        }
    }
}

/**************************************************** Dry Run ******************************************************/


/*
arr = {1, 0, 1, 0, 1, 1}
n = 6


Iteration 1: {1, 0, 1, 0, 1, 1} (no swap)
Iteration 2: {1, 0, 1, 0, 1, 1} (no swap)
Iteration 3: {1, 0, 1, 0, 1, 1} (no swap)
Iteration 4: {1, 0, 1, 0, 0, 1} (swap 1 and 0)
Iteration 5: {1, 0, 1, 0, 0, 1} (no swap)
Iteration 6: {0, 0, 1, 0, 1, 1} (swap 1 and 0)
Iteration 7: {0, 0, 1, 1, 1, 1} (no swap)


*/

