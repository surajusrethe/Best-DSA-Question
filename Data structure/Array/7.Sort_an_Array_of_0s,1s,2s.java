/****************************** Question ***************************/

https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
/*
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
*/

/****************************** Code ***************************/


class Solution
{
    public static void sort012(int nums[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n- 1;
        
        while (mid <= high) 
        {
            if (nums[mid] == 0) 
            {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            
            else if (nums[mid] == 1) mid++;
            
            else 
            {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    public static void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}


/****************************** Dry run ***************************/


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
