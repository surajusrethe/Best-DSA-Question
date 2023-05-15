/****************************************** Question ********************************************/

https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
/*
Given an integer array and another integer element. The task is to find if the given element is present in array or not.

Example 1:

Input:
n = 4
arr[] = {1,2,3,4}
x = 3
*/


/******************************************* Approach ********************************************/

/*
- Iterate through the array and search for the target element at each index.
*/

/******************************************* Code ********************************************/

  
class Solution{
        
    static int search(int arr[], int n, int X)
    {
        // Linear search algorithm to find X in the array
        
        // Iterate through each element of the array
        for(int i=0; i<n; i++)
        {
            // If the current element is equal to X, return the index
            if(arr[i] == X) return i;
        }
        
        // If X is not found in the array, return -1
        return -1;
    }
    
}



/******************************************* DryRun ********************************************/

/*

arr = [3, 8, 2, 5, 1, 4]
n = 6
X = 5


i = 0, arr[0] = 3, 3 != 5, continue
i = 1, arr[1] = 8, 8 != 5, continue
i = 2, arr[2] = 2, 2 != 5, continue
i = 3, arr[3] = 5, 5 == 5, return 3

  
  */

