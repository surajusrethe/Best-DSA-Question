/******************************************************** Question **************************************************************/

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.


/******************************************************** Approach  **************************************************************/

 Time Complexity: O(N) && Space Complexity : O(1)
/*
Teen pointers ka upyog karen: low, mid aur high.
mid pointer high pointer se milane tak loop chalayein aur element ke value ke anusar unhe swap karen.
0 ke liye low pointer ke sath swap karen aur low aur mid pointer ko aage badhayein.
1 ke liye sirf mid pointer ko aage badhayein.
2 ke liye high pointer ke sath swap karen aur high pointer ko peeche le jayein.
*/

/******************************************************** Code **************************************************************/


class Solution {
    // Function to sort an array of 0s, 1s and 2s in ascending order
    public static void sort012(int nums[], int n) {
        // Initialize three pointers
        int low = 0; // Points to the beginning of the array
        int mid = 0; // Points to the current element being processed
        int high = n - 1; // Points to the end of the array
        
        // Loop until mid pointer meets the high pointer
        while (mid <= high) {
            // If current element is 0, swap with the low pointer and move both low and mid pointers ahead
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            // If current element is 1, just move the mid pointer ahead
            else if (nums[mid] == 1) {
                mid++;
            }
            // If current element is 2, swap with the high pointer and move the high pointer backward
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    // Function to swap two elements in an array
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


/******************************************************** Dry Run **************************************************************/

/*
visualizes the dry run of the code with the example array of [1, 0, 2, 1, 0]:


Initial state: [1, 0, 2, 1, 0]
                   ^        ^ 
                  low     high
                  mid

   [1, 0, 2, 1, 0]
    ^        ^ 
   low     high
   mid

   [0, 1, 2, 1, 0]
       ^  ^  ^ 
      low mid high

   [0, 1, 0, 1, 2]
          ^  ^  
         mid high
       ^  ^
      low high

   [0, 0, 1, 1, 2]
         ^  ^  
        mid high
         ^  ^
        low high

   Sorted array: [0, 0, 1, 1, 2]
   
   */
