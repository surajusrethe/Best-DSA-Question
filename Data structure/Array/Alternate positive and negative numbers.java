/******************************************************************* Question ********************************************************************/

/*
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
*/

/******************************************************************* Approach ********************************************************************/


/*
- Create two arrays, one to store positive elements and one to store negative elements.
- Traverse through the original array and separate the positive and negative elements into two separate arrays.
- Use three pointers, one for the original array, and one each for the positive and negative arrays to alternate the positive and negative elements while maintaining their relative order.
- Add any remaining positive or negative elements to the end of the output array.
- Modify the original array in place with the new order of elements.
*/

/******************************************************************* Code ********************************************************************/



class Solution 
{
    void rearrange(int arr[], int n) 
    {
        
        int[] positive = new int[n];  // array to store positive elements
        int[] negative = new int[n];  // array to store negative elements
        
        int p = 0, q = 0;  // pointers to track the current index of positive and negative arrays
    
        // separate positive and negative elements into two arrays
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] >= 0) positive[p++] = arr[i];
            
            else negative[q++] = arr[i];
        }
    
        int i = 0, j = 0, k = 0;  // pointers to track the current index of positive, negative and input arrays
    
        // alternate positive and negative elements while maintaining their relative order
        while (i < p && j < q) 
        {
            arr[k++] = positive[i++];
            arr[k++] = negative[j++];
        }
    
        // add any remaining positive elements to the end of the output array
        while (i < p) { arr[k++] = positive[i++]; }
    
        // add any remaining negative elements to the end of the output array
        while (j < q) { arr[k++] = negative[j++]; }    
    }
}


/******************************************************************* Dry Run ********************************************************************/

/*
Input: arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}, n = 9

positive[] = [9, 4, 5, 0, 2, 0, 0, 0, 0]
negative[] = [-2, -1, -5, -3, 0, 0, 0, 0, 0]

p = 5, q = 4

i = 0, j = 0, k = 0

Iteration 1:
arr[k++] = positive[i++] = 9  // i = 1, k = 1
arr[k++] = negative[j++] = -2  // j = 1, k = 2

Iteration 2:
arr[k++] = positive[i++] = 4  // i = 2, k = 3
arr[k++] = negative[j++] = -1  // j = 2, k = 4

Iteration 3:
arr[k++] = positive[i++] = 5  // i = 3, k = 5
arr[k++] = negative[j++] = -5  // j = 3, k = 6

Iteration 4:
arr[k++] = positive[i++] = 0  // i = 4, k = 7
arr[k++] = negative[j++] = -3  // j = 4, k = 8

Iteration 5:
arr[k++] = positive[i++] = 2  // i = 5, k = 9

Remaining positive elements:
arr[k++] = positive[i++] = 0  // i = 6, k = 10

Array after rearrangement:
arr[] = {9, -2, 4, -1, 5, -5, 0, -3, 2}

*/
