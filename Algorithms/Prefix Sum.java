- Prefix sum is a technique used to efficiently compute the cumulative sum of an array up to a certain position.

- The algorithm works by initializing a new array with the same size as the original array, and computing the prefix sum by adding the previous element in the new array   to the current element in the original array.

- The prefix sum array can be used for various computations, such as computing the sum of elements in a range of the original array or finding the maximum subarray sum.

- The time complexity of the prefix sum algorithm is O(n), where n is the size of the array, making it an efficient way to process large amounts of data.
  
  
  
 /************************************************************************** Code ***************************************************************************/

  
// Initialize a new array to store the prefix sum
int prefix_sum[size];

// Set the first element of prefix_sum to be the same as the first element of the original array
prefix_sum[0] = nums[0];

// Iterate through the original array from index 1 to the end, and compute the prefix sum
for (int i = 1; i < size; i++) {
    prefix_sum[i] = prefix_sum[i-1] + nums[i];
}

// Do something with the prefix_sum array


/*************************************************************************** Where  To Use ***************************************************************************/


- Use prefix sum when you need to compute the cumulative sum of an array.

- It's useful for solving problems where you need to repeatedly compute the sum of elements in a range of the array.

- It's also used in applications like image processing and data compression.

- In general, the prefix sum algorithm can speed up computations on arrays and make certain operations much more efficient.
