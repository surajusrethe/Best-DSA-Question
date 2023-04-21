/*
- In the fixed size window template, k is the size of the window and arr is the input array.

- The algorithm moves the window of size k from left to right through the array, 

- calculating the sum of the elements inside the window at each step. The maximum sum found is returned.
*/


/*************************************************************************** Code ***************************************************************************/

/**
 * Finds the maximum sum of a fixed-size subarray in the input array.
 *
 * @param arr the input array of integers
 * @param k the size of the subarray
 * @return the maximum sum of a subarray of size k
 */
public static int maxSumFixedWindow(int[] arr, int k) {
    int left = 0; // left pointer of the window
    int right = 0; // right pointer of the window
    int maxSum = Integer.MIN_VALUE; // initialize the maximum sum to be the smallest possible integer value
    int currSum = 0; // initialize the current sum to be zero

    while (right < arr.length) {
        currSum += arr[right]; // add the element at the right pointer to the current sum

        if (right - left + 1 == k) { // if the size of the window is equal to k
            maxSum = Math.max(maxSum, currSum); // update the maximum sum
            currSum -= arr[left]; // remove the left element from the current sum
            left++; // move the left pointer to the right
        }

        right++; // move the right pointer to the right
    }

    return maxSum; // return the maximum sum found
}


/*************************************************************************** Visualization ***************************************************************************/




|         Code                                      |           Values/Actions                                               |
|---------------------------------------------------|------------------------------------------------------------------------|
|                                                   |                                                                        |
| int left = 0;                                     |   Declare integer variable left and initialize it to 0                 |
  
| int right = 0;                                    |   Declare integer variable right and initialize it to 0                |
  
| int maxSum = Integer.MIN_VALUE;                   |   Declare integer variable maxSum and initialize it to minimum integer value           |
  
| int currSum = 0;                                  |   Declare integer variable currSum and initialize it to 0             |
  
| while (right < arr.length) {                      |   While right is less than length of the array                        |
  
| currSum += arr[right];                            |   Add the value of arr[right] to currSum                                |
  
| if (right - left + 1 == k) {                      |   If the difference of right and left plus 1 is equal to k             |
  
| maxSum = Math.max(maxSum, currSum);               |   Take the maximum value of maxSum and currSum and assign it to maxSum |
  
| currSum -= arr[left];                             |   Subtract the value of arr[left] from currSum                          |
  
| left++;                                           |   Increment left by 1                                                  |
  
| }                                                 |   End if statement                                                     |
  
| right++;                                          |   Increment right by 1                                                 |
  
| }                                                 |   End while loop                                                        |
  
| return maxSum;                                    |   Return maxSum                                                         |
  

                                      
Visualization:

```
                +---------------------+
                |  int left = 0;      |
                |  int right = 0;     |
                |  int maxSum =       |
                |  Integer.MIN_VALUE; |
                |  int currSum = 0;   |
                +---------------------+
                            |
                            V
            +------------------------------------+
            |  while (right < arr.length) {      |
            |      currSum += arr[right];         |
            |      if (right - left + 1 == k) {   |
            |          maxSum = Math.max(maxSum,  |
            |                      currSum);      |
            |          currSum -= arr[left];      |
            |          left++;                    |
            |      }                              |
            |      right++;                       |
            |  }                                  |
            +------------------------------------+
                            |
                            V
                +-------------------+
                |  return maxSum;   |
                +-------------------+
```
