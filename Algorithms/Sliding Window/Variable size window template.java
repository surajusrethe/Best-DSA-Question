- In the variable size window template, targetSum is the sum that we want to find in the array.
  
- The algorithm moves a variable size window from left to right through the array, adding elements to the window until the sum of the elements inside the window is         greater than or equal to targetSum.




/*************************************************************************** Code ***************************************************************************/


/*
 * Finds the length of the longest subarray that sums to the target sum.
 *
 * @param nums the input array of integers
 * @param targetSum the sum that we want to find
 * @return the length of the longest subarray that sums to targetSum
 */
public static int maxSubArrayLen(int[] nums, int targetSum) {
    int left = 0; // left pointer of the window
    int right = 0; // right pointer of the window
    int maxLength = 0; // initialize the maximum length to be zero
    int currSum = 0; // initialize the current sum to be zero

    while (right < nums.length) {
        currSum += nums[right]; // add the element at the right pointer to the current sum

        while (currSum > targetSum) { // while the current sum is greater than the target sum
            currSum -= nums[left]; // remove the left element from the current sum
            left++; // move the left pointer to the right
        }

        if (currSum == targetSum) { // if the current sum is equal to the target sum
            maxLength = Math.max(maxLength, right - left + 1); // update the maximum length
        }

        right++; // move the right pointer to the right
    }

    return maxLength; // return the maximum length found
}



/*************************************************************************** Visualization ***************************************************************************/



|         Code                                                          |           Values/Actions                                                             |
|-----------------------------------------------------------------------|--------------------------------------------------------------------------------------|
|                                                                       |                                                                                      |
|                                                                       |                                                                                      |
| int left = 0;                                                         |   Declare integer variable left and initialize it to 0                             |
  
| int right = 0;                                                        |   Declare integer variable right and initialize it to 0                            |
  
| int maxLength = 0;                                                    |   Declare integer variable maxLength and initialize it to 0                        |
  
| int currSum = 0;                                                       |   Declare integer variable currSum and initialize it to 0                          |
  
| while (right < nums.length) {                                         |   While right is less than length of the nums array                                |
  
| currSum += nums[right];                                               |   Add the value of nums[right] to currSum                                            |
  
| while (currSum > targetSum) {                                         |   While currSum is greater than targetSum                                            |
  
| currSum -= nums[left];                                                |   Subtract the value of nums[left] from currSum                                      |
  
| left++;                                                               |   Increment left by 1                                                                |
  
| }                                                                     |   End while loop                                                                      |
  
| if (currSum == targetSum) {                                           |   If the value of currSum is equal to targetSum                                      |
  
| maxLength = Math.max(maxLength, right - left + 1);                    |   Take the maximum value of maxLength and (right - left + 1) and assign it to maxLength |
  
| }                                                                     |   End if statement                                                                    |
  
| right++;                                                              |   Increment right by 1                                                               |
  
| }                                                                     |   End while loop                                                                      |
  
| return maxLength;                                                     |   Return maxLength                                                                   |
  
  
  

Visualization:

```
                +---------------------+
                |  int left = 0;      |
                |  int right = 0;     |
                |  int maxLength =    |
                |  0;                |
                |  int currSum = 0;   |
                +---------------------+
                            |
                            V
            +-----------------------------------------------+
            |  while (right < nums.length) {                 |
            |      currSum += nums[right];                    |
            |      while (currSum > targetSum) {              |
            |          currSum -= nums[left];                 |
            |          left++;                                |
            |      }                                           |
            |      if (currSum == targetSum) {                 |
            |          maxLength = Math.max(maxLength,         |
            |                  right - left + 1);              |
            |      }                                           |
            |      right++;                                   |
            |  }                                              |
            +-----------------------------------------------+
                            |
                            V
                +-----------------------+
                |  return maxLength;    |
                +-----------------------+

