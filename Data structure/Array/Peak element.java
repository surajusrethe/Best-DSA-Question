/******************************************************** Question **************************************************************/

/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.
Example 2:

Input:
N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
it's neighbor elements 3 and 2.
If 1 is returned then the generated output will be 1 else 0.
*/

/******************************************************** Approach  **************************************************************/


- Initialize two pointers, left pointing to the start of the array and right pointing to the end of the array.
- While left is less than right, calculate the middle element using the formula (left+right)/2.
- If the middle element is less than the element to its right, set the left pointer to mid+1, because the peak element must be in the right half of the array.
- If the middle element is greater than or equal to the element to its right, set the right pointer to mid, because the peak element must be in the left half of the     array (including the middle element).
- Repeat steps 2 to 4 until left is greater than or equal to right. At this point, left points to a peak element in the array.


/******************************************************** Code **************************************************************/


public int peakElement(int[] arr, int n) {
    // Initialize two pointers, left and right
    int left = 0, right = n-1;

    // Loop until left and right pointers converge
    while (left < right) {
        // Calculate mid index using left and right pointers
        int mid = (left + right) / 2;

        // If arr[mid] is smaller than arr[mid+1], peak element must be on the right side of mid
        if (arr[mid] < arr[mid+1])
            left = mid + 1;
        // Otherwise, peak element must be on the left side of mid
        else
            right = mid;
    }

    // Return the left pointer, which points to any peak element
    return left;
}



/******************************************************** Dry Run **************************************************************/

/*
Initially, left = 0 and right = 3

Iteration 1:
    mid = (left + right) / 2 = (0 + 3) / 2 = 1
    arr[mid] = arr[1] = 2
    arr[mid+1] = arr[2] = 3
    Since arr[mid] < arr[mid+1], we update left = mid + 1, so left = 2 and right = 3

Iteration 2:
    mid = (left + right) / 2 = (2 + 3) / 2 = 2
    arr[mid] = arr[2] = 3
    arr[mid+1] = arr[3] = 1
    Since arr[mid] is not smaller than arr[mid+1], we update right = mid, so left = 2 and right = 2

We have found a peak element at index 2, so we return left = 2
*/
      
