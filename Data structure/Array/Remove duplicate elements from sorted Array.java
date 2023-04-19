/******************************************************** Question **************************************************************/
/*

Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the generated output will print all the elements of the modified array from index 0 to X-1.

Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: {2}
Explanation: After removing all the duplicates 
only one instance of 2 will remain.
Example 2:

Input:
N = 3
Array = {1, 2, 2}
Output: {1, 2}

*/
/******************************************************** Approach  **************************************************************/

- Initialize a pointer j to keep track of the unique elements found so far, starting from index 1.
- Loop through the array from index 1 and compare each element with the previous element. If it is different, then store it at position j and increment j.
- Return the value of j, which represents the number of unique elements in the modified array.


/******************************************************** Code **************************************************************/


class Solution {
    int remove_duplicate(int nums[],int n){
        // Initialize a pointer j to keep track of the unique elements found so far, starting from index 1
        int j = 1;
        // Loop through the array from index 1 and compare each element with the previous element
        for(int i=1; i<n; i++)
        {
            // If the current element is different from the previous element, then store it at position j and increment j
            if(nums[i-1] != nums[i])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        // Return the value of j, which represents the number of unique elements in the modified array
        return j;
    }
}



/******************************************************** Dry Run **************************************************************/

  /*
  Step 1: Compare 2 with 1, since they are different, store 2 at index 1 (j = 1)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                  ^  ^
                  i  j

Step 2: Compare 2 with 2, since they are the same, skip it (j = 1)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                     ^  ^
                     i  j

Step 3: Compare 3 with 2, since they are different, store 3 at index 2 (j = 2)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                        ^  ^
                        i  j

Step 4: Compare 3 with 3, since they are the same, skip it (j = 2)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                           ^  ^
                           i  j

Step 5: Compare 3 with 3, since they are the same, skip it (j = 2)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                              ^  ^
                              i  j

Step 6: Compare 4 with 3, since they are different, store 4 at index 3 (j = 3)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                                 ^  ^
                                 i  j

Step 7: Compare 5 with 4, since they are different, store 5 at index 4 (j = 4)
         [1, 2, 2, 3, 3, 3, 4, 5, 5]
                                    ^  ^
                                    i  j

Step 8: Compare 5 with 5, since they are the same, skip it (j = 4)
         [1, 2, 2, 5]
         
Step 9: Compare 2 with 5, they are different, so store 5 at nums[j] (j = 4), increment j (j = 5)
[1, 2, 2, 5,

Step 10: Compare 5 with 5, since they are the same, skip it (j = 5)
[1, 2, 2, 5, 5]

Step 11: Since there are only 3 distinct elements in the array, the first 3 elements are the distinct elements, and the function should return 3.

Final Array: [1, 2, 5]
Returned Value: 3

*/




