
/*

- Hume ek window (khidki) banaani hai, jisko hum left aur right pointer se define karenge.

- Hume window ko right direction me move karna hai.

- Hume window ka size fixed ya variable ho sakta hai.

- Fixed size window ke case me, hum window ka size k decide karenge, aur phir har baar window ko right me move karte jayenge aur har window ka sum nikal kar maximum sum   ko store karenge.

- Variable size window ke case me, hum window ke size ko target sum ke saath define karenge. Har baar window ko right me move karte jayenge aur har window ka sum           nikalenge, agar sum target sum se jyada ho jata hai, to window ko left direction me move karte jayenge jab tak ki sum target sum ke barabar ya usse chota ho jaye, aur   phir maximum length ko store karenge.

- Left pointer, right pointer aur current sum ko initialize karna hai.

- Har step me right pointer ko right direction me move karna hai.

- Window ko left direction me move karna hai, agar target sum se jyada ho gaya hai.

- Window ke size ko check karna hai, agar fixed size window hai to sum ko store karna hai, aur agar variable size window hai to length ko store karna hai.

- Maximum sum ya maximum length ko return karna hai.

*/


/*************************************************************************** Code ***************************************************************************/


/**
 * Finds the maximum sum of a subarray of size k, or the length of the longest
 * subarray that sums to targetSum, depending on the value of targetSum.
 *
 * @param arr the input array of integers
 * @param k the size of the subarray (ignored if targetSum is not null)
 * @param targetSum the sum that we want to find (if not null)
 * @return the maximum sum of a subarray of size k, or the length of the longest
 *         subarray that sums to targetSum, depending on the value of targetSum
 */
public static int slidingWindow(int[] arr, Integer k, Integer targetSum) {
    // Initialize left and right pointers
    int left = 0;
    int right = 0;

    // Initialize maximum length or maximum sum to be zero
    int maxLengthOrMaxSum = 0;

    // Initialize current sum to be zero
    int currSum = 0;

    // Iterate through the array using right pointer
    while (right < arr.length) {
        // Add the element at the right pointer to the current sum
        currSum += arr[right];

        // If targetSum is not null, we're looking for a variable size subarray
        if (targetSum != null) {
            // While the current sum is greater than the target sum
            while (currSum > targetSum) {
                // Remove the left element from the current sum
                currSum -= arr[left];
                // Move the left pointer to the right
                left++;
            }
            // If the current sum is equal to the target sum
            if (currSum == targetSum) {
                // Update the maximum length
                maxLengthOrMaxSum = Math.max(maxLengthOrMaxSum, right - left + 1);
            }
        // Otherwise, we're looking for a fixed size subarray
        } else {
            // If the size of the window is equal to k
            if (right - left + 1 == k) {
                // Update the maximum sum
                maxLengthOrMaxSum = Math.max(maxLengthOrMaxSum, currSum);
                // Remove the left element from the current sum
                currSum -= arr[left];
                // Move the left pointer to the right
                left++;
            }
        }
        // Move the right pointer to the right
        right++;
    }

    // Return the maximum length or maximum sum found
    return maxLengthOrMaxSum;
}


.....................................................................................................................................................................
  
Note: Har bar poora code likhne ki jaroort nahi hai fixed or variable ke hi saab se modify kar lena.
  
....................................................................................................................................................................
/*  
- if you are given a problem that asks you to find the maximum sum of a subarray of size k, you can use this code as is and just pass in the values of arr, k, and null   for targetSum.
  
- If you are given a problem that asks you to find the length of the longest subarray that sums to a target sum, you can also use this code as is and just pass in the   values of arr, null, and the target sum for targetSum.
  */
......................................................................................................................................................................
  
  if you want to find the maximum sum of a fixed size subarray of size k, you can modify the code as follows:


public static int maxSumSubarrayOfSizeK(int[] arr, int k) 
{
    int left = 0; // left pointer of the window
    int right = 0; // right pointer of the window
    int maxSum = 0; // initialize the maximum sum to be zero
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


In this modified code, we removed the targetSum parameter and added a k parameter, as we only need to find the maximum sum of a subarray of size k.
  

Similarly, if you want to find the length of the longest subarray that sums to a target sum, you can modify the code as follows:


public static int longestSubarrayWithSum(int[] arr, int targetSum) 
{
    int left = 0; // left pointer of the window
    int right = 0; // right pointer of the window
    int maxLength = 0; // initialize the maximum length to be zero
    int currSum = 0; // initialize the current sum to be zero

    while (right < arr.length) {
        currSum += arr[right]; // add the element at the right pointer to the current sum

        while (currSum > targetSum) { // while the current sum is greater than the target sum
            currSum -= arr[left]; // remove the left element from the current sum
            left++; // move the left pointer to the right
        }

        if (currSum == targetSum) { // if the current sum is equal to the target sum
            maxLength = Math.max(maxLength, right - left + 1); // update the maximum length
        }

        right++; // move the right pointer to the right
    }

    return maxLength; // return the length of the longest subarray that sums to targetSum
}


