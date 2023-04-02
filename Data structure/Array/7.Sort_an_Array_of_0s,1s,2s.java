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


Input: {2, 0, 2, 1, 1, 0}

low = 0, mid = 0, high = 5
nums[mid] = 2, so swap nums[mid] with nums[high] and decrement high
{2, 0, 2, 1, 1, 0} -> {2, 0, 1, 1, 2, 0}
nums[mid] = 2, so swap nums[mid] with nums[high] and decrement high
{2, 0, 1, 1, 2, 0} -> {2, 0, 1, 2, 1, 0}
nums[mid] = 1, so increment mid
nums[mid] = 1, so increment mid
nums[mid] = 2, so swap nums[mid] with nums[high] and decrement high
{2, 0, 1, 2, 1, 0} -> {0, 0, 1, 2, 1, 2}
nums[mid] = 1, so increment mid
nums[mid] = 0, so swap nums[mid] with nums[low] and increment both low and mid
{0, 0, 1, 2, 1, 2} -> {0, 2, 1, 2, 1, 0}
nums[mid] = 1, so increment mid
mid > high, so exit while loop
Print sorted array: {0, 0, 1, 1, 2, 2}
