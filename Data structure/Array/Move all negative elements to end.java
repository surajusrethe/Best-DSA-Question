/************************************************************ Question ***************************************************************/

/*
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.


Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5
*/
  
/************************************************************ Approach ***************************************************************/

  Approach 1:
/*
- Creat a temporary array
- initialize pointer to keep track of positive number in the array
- Store positive elements in temp[] array
- Store negative elements in temp[] array
- Copy temp[] array to arr[] array
*/


/************************************************************ Code ***************************************************************/

class Solution 
{
    
    public void segregateElements(int arr[], int n)
    {
         // Creating a temporary array to store the elements after rearrangement
        int[] temp = new int[n];
        
        // Initializing the index for storing positive elements in temp array
        int j = 0;
        
        // Storing positive elements in temp[] array
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] >= 0) 
            {
                temp[j] = arr[i];
                j++;
            }
        }
        
        // Storing negative elements in temp[] array
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] < 0) 
            {
                temp[j] = arr[i];
                j++;
            }
        }
        
        // Copying temp[] array to arr[] array
        for (int i = 0; i < n; i++) 
        {
            arr[i] = temp[i];
        }
    }
}

/************************************************************ Dry Run ***************************************************************/
/*

arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
n = 8

- Initialize an empty array temp of size n.
 temp[] = {0, 0, 0, 0, 0, 0, 0, 0}

- Initialize a variable j to 0. This will be used to keep track of the index to store positive elements in temp.

- Store all positive elements in temp[] using a loop over arr[]:


 - arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 - temp[] = {1, 3, 2, 11, 6, 0, 0, 0}
 - j = 5
 
- Notice that j has been updated to 5, which is the index of the first negative element in temp[].

- Store all negative elements in temp[] using another loop over arr[]:


arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
temp[] = {1, 3, 2, 11, 6, -1, -7, 0}
j = 7

- Notice that j has been updated to 7, which is the size of temp[].

- Copy the elements from temp[] to arr[] using another loop:


arr[] = {1, 3, 2, 11, 6, -1, -7, 0}
temp[] = {1, 3, 2, 11, 6, -1, -7, 0}

The final array arr[] has all positive elements followed by negative elements.

*/
