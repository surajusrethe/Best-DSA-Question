/***************************************************************** Question ******************************************************************************/

/*
Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
*/

/***************************************************************** Appraoch *****************************************************************************/

/*
- Initialize left and right pointers and current sum of window.
- Expand the window by adding elements to current sum until sum is greater than or equal to given target sum.
- If current sum is equal to target sum, return the starting and ending indices of the subarray.
- Otherwise, contract the window by removing elements from the current sum until sum is less than or equal to target sum.
- Repeat until right pointer reaches end of array. If no subarray found, return -1.
*/

/***************************************************************** Code *****************************************************************************/



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        //creating an ArrayList to store the starting and ending indices of subarray
        ArrayList<Integer> result = new ArrayList<>();
        
        //edge case: if sum is zero, return -1
        if(s == 0)
        {
            result.add(-1);
            return result;
        } 
        
        //initialize left, right pointers and sum of current window
        int left =0, right = 0, sum = 0;
        
        //loop until right pointer reaches end of array
        while(right<n)
        {
            //expanding window: add the element at right to the current window
            sum += arr[right];
            
            //Contraction of window: remove elements from the window until sum is less than or equal to s
            while(sum > s && left <= right)
            {
                sum -= arr[left];
                left++;
            }
            
            //if sum is equal to s, add the starting and ending indices of subarray to result and return
            if(sum == s)
            {
                result.add(left+1); //adding starting index of subarray
                result.add(right+1); //adding ending index of subarray
                return result;
            }
            
            //move the right pointer to the next element and continue the loop
            right++;
        }
        
        //if no subarray found, add -1 to result and return
        result.add(-1);
        return result;
    }
}



/***************************************************************** Dry Run *****************************************************************************/


/*

Input:
arr = [1, 2, 3, 7, 5]
n = 5
s = 12

Output:
[2, 4]

1. Initialize an empty ArrayList `res` to store the starting and ending index of the subarray
2. Check if `s` is equal to 0
   a. If it is, add -1 to `res` and return it
3. Initialize `left`, `right`, and `sum` to 0
4. While `right` is less than `n`:
   a. Add `arr[right]` to `sum`
   b. While `sum` is greater than `s`:
      i.  Subtract `arr[left]` from `sum`
      ii. Increment `left`
   c. If `sum` is equal to `s`, add `left+1` and `right+1` to `res` and return it
   d. Increment `right`
5. If no subarray with a sum of `s` is found, add -1 to `res` and return it

Intermediate values of `left`, `right`, `sum`, and `res` are shown below:

| left | right | sum | res |
|------|-------|-----|-----|
| 0    | 0     | 1   | []  |
| 0    | 1     | 3   | []  |
| 0    | 2     | 6   | []  |
| 1    | 3     | 5   | [2, 4] |

*/
