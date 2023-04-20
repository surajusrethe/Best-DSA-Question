/**************************************************************** Question ************************************************************************/

/*
Given a sorted array containing only 0s and 1s, find the transition point. 


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.

Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.

Your Task:
You don't need to read input or print anything. The task is to complete the function transitionPoint() that takes array and N as input parameters and returns the 0 based index of the position where "0" ends and "1" begins. If array does not have any 1s, return -1. If array does not have any 0s, return 0.
*/

/**************************************************************** Approach ************************************************************************/

/*
- We start by looking at the middle element of the array. 
- If the middle element is 1, we know that the transition point must be in the left half of the array. 
- If the middle element is 0, we know that the transition point must be in the right half of the array.
- We can initialize the ans variable to -1, and update it whenever we find a transition point. We update ans to the current index mid whenever we find a 0 followed by   a 1. This way, ans will hold the index of the first transition point we encounter in the array.
*/

/**************************************************************** Code ************************************************************************/



class GfG {
    int transitionPoint(int arr[], int n) {
        int left = 0, right = n - 1;
        // Using Binary Search
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == 1) {
                right = mid - 1;  // Move the search towards the left half
            } else if (arr[mid] == 0) {
                left = mid + 1;  // Move the search towards the right half
            }
        }
        // Checking if transition point is found or not
        if (left == n || arr[left] == 0) {
            return -1;  // Transition point not found
        }
        return left;  // Return the index of the transition point
    }
}




/**************************************************************** Dry run ************************************************************************/

/*
Initial state:
left = 0, right = 4
arr = {0, 0, 0, 1, 1}

Binary search iteration 1:
mid = (0 + 4) / 2 = 2
arr[mid] = arr[2] = 0
left = 2 + 1 = 3, right = 4

Binary search iteration 2:
mid = (3 + 4) / 2 = 3
arr[mid] = arr[3] = 1
left = 3, right = 3

Transition point found:
left = 3, arr[left] = arr[3] = 1
*/


