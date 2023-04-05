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
arr = {5, 6, 8, 7, 9, 4, 1, 2}
n = 8
s = 14

Output:
[1, 3]

1. Initialize left pointer, right pointer, and sum to 0: left = 0, right = 0, sum = 0.
2. Start the loop until the right pointer reaches the end of the array: right < n.
   a. Expand the window by adding the element at the right pointer to the current window: sum += arr[right].
   b. If sum is greater than s, contract the window by removing elements from the window until sum is less than or equal to s.
      i.  While sum is greater than s and left pointer is less than or equal to the right pointer, remove the element at the left pointer from the current window and increment the left pointer: sum -= arr[left]; left++.
   c. If sum is equal to s, add the starting and ending indices of the subarray to the result and return the result: result.add(left+1); result.add(right+1); return result.
   d. Move the right pointer to the next element and continue the loop: right++.
3. If no subarray is found, add -1 to the result and return the result: result.add(-1); return result.

Iteration 1:
left = 0, right = 0, sum = 0, arr[right] = 5
sum += arr[right] => sum = 5
right++ => right = 1

Iteration 2:
left = 0, right = 1, sum = 5, arr[right] = 6
sum += arr[right] => sum = 11
right++ => right = 2

Iteration 3:
left = 0, right = 2, sum = 11, arr[right] = 8
sum += arr[right] => sum = 19
sum > s, so contract the window:
sum -= arr[left] => sum = 14
left++ => left = 1
sum > s, so contract the window:
sum -= arr[left] => sum = 8
left++ => left = 2
sum <= s, continue to next iteration
right++ => right = 3

Iteration 4:
left = 2, right = 3, sum = 8, arr[right] = 7
sum += arr[right] => sum = 15
sum == s, add starting and ending indices to the result and return the result:
result.add(left+1) => result = [3]
result.add(right+1) => result = [3, 4]
return result => [3, 4]


*/
