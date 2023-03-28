Question: https://leetcode.com/problems/two-sum/description/
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

Approach 1: TC = O(n2) & SC = O(1)

/*
  for (int i = 0; i < nums.length; i++) {
              for (int j = i + 1; j < nums.length; j++) {
                  if (nums[j] == target - nums[i]) {
                      return new int[] { i, j };
                  }
              }
          }
          // In case there is no solution, we'll just return null
          return null;
*/


Approach 2:  TC = O(n) & SC = (On)

class Solution 
{
  public int[] twoSum(int[] numbers, int target) 
  {
        // Sort the input array in ascending order
        Arrays.sort(numbers);

        // Get the length of the input array
        int len = numbers.length;

        // Set two pointers to the beginning and end of the array
        int i = 0;
        int j = len - 1;

        // Move the pointers towards each other until they meet
        while (i < j) 
        {
            // Calculate the sum of the values at the current pointers
            int sum = numbers[i] + numbers[j];

            // If the sum is greater than the target, move the right pointer to the left
            if (sum > target) j--;
            // If the sum is less than the target, move the left pointer to the right
            else if (sum < target) i++;
            // If the sum equals the target, return the indices of the two numbers
            else return new int[] {i, j};
        }

            // If no pair of numbers adds up to the target, return an array with -1 as the indices
            return new int[] {-1, -1};

  }
}
  
  
Approach 3:  TC = O(n) & SC = (On)
  

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Create a hash map to store values and their corresponding indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the input array
        for (int i = 0; i < nums.length; i++) 
        {
            // Calculate the "complement" (i.e. the difference between the target and the current element)
            int complement = target - nums[i];
            
            // Check if the complement exists in the hash map
            if (map.containsKey(complement)) 
            {
                // If it does, return the indices of the current element and the complement element from the hash map
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current element and its index to the hash map
            map.put(nums[i], i);
        }
        
        // If no solution is found in the loop, throw an error message
       return null;
    }
}

  
.......................................................................................................................................................................
  
  
Dry Run of Approch 2 using HashMap:


/*
Here's a dry run of the code for the given input:

Dry run for the input [2,7,11,15], target = 9:

i = 0, nums[i] = 2, complement = 9 - 2 = 7, map does not contain 7, add 2 to map with index 0.
i = 1, nums[i] = 7, complement = 9 - 7 = 2, map contains 2, return [0,1].

Therefore, the output for the input [2,7,11,15], target = 9 is [0,1].
*/

.......................................................................................................................................................................

  
Take Away:

/*
  The hash table pattern is a very useful pattern for solving problems that involve finding pairs or groups of elements that meet certain conditions. 
  It has a time complexity of O(n), which makes it very efficient for large inputs.
*/

.......................................................................................................................................................................
Real World Use:
/*
  The 2-sum problem has many real-world applications, particularly in data science and machine learning. Here are a few examples:

1.Stock market analysis: The 2-sum problem can be used to identify pairs of stocks whose prices are correlated. 
                         For example, if the price of one stock goes up, the price of another stock may go up as well. 
                         By finding pairs of stocks that are highly correlated, investors can create a diversified portfolio that minimizes risk.

2.Network analysis: The 2-sum problem can be used to identify pairs of nodes in a network that are closely connected. 
                    This information can be used to optimize network routing and improve communication efficiency.

3.Genetics: The 2-sum problem can be used to identify pairs of genes that are closely related. This information can be used to study the function and behavior of genes,
            and to develop new treatments for genetic diseases.

4.Natural language processing: The 2-sum problem can be used to identify pairs of words or phrases that are closely related in meaning. 
                               This information can be used to improve natural language processing applications such as machine translation, sentiment analysis, 
                               and information retrieval.
*/

.......................................................................................................................................................................
