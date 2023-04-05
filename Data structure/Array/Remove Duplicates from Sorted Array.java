/****************************************************************** Question *****************************************************************************/

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
*/

/***************************************************************** Approach *****************************************************************************/

/*
- The code starts with checking if the array is empty or has only one element, in which case there are no duplicates to remove, and it just returns the length of the     array.

- The code then initializes a variable j to 0, which is used to keep track of the distinct elements in the array.

- Next, the code iterates over the array and checks if the current element is different from the next element. If they are different, the current element is copied to   the jth position in the array, and j is incremented.

- After the iteration, the code copies the last element of the array to the jth position and increments j again.

- Finally, the code returns the value of j, which represents the number of distinct elements in the array.

- In summary, the code removes duplicates from the array and modifies the array to contain only distinct elements, while also returning the number of distinct           elements.
*/

/***************************************************************** Code *****************************************************************************/


class Solution {
    // function to remove duplicates from array and return number of distinct elements
    int remove_duplicate(int arr[], int n) {
        // if array has no elements or only one element, no duplicates to remove
        if (n == 0 || n == 1) {
            return n;
        }
        
        // initialize variable j as 0 to keep track of distinct elements
        int j = 0;
        
        // iterate over the array from index 0 to second last element
        for (int i = 0; i < n - 1; i++) {
            // check if current element and next element are different
            if (arr[i] != arr[i + 1]) {
                // if they are different, copy current element to arr[j] and increment j
                arr[j++] = arr[i];
            }
        }
        
        // copy the last element to arr[j] and increment j
        arr[j++] = arr[n - 1];
        
        // return the number of distinct elements (i.e., j)
        return j;
    }
}

/****************************************************************** Question *****************************************************************************/


/*
Input:
N = 3
Array = {1, 2, 2}

Initialize j as 0.
Start the for loop from i = 0 to n-2.
When i = 0, arr[i] is 1 and arr[i+1] is 2. Since they are not equal, copy arr[i] (which is 1) to arr[j] and increment j.
arr[j] becomes 1
j becomes 1
When i = 1, arr[i] is 2 and arr[i+1] is also 2. So, skip this iteration.
End of the for loop.
Copy the last element (arr[n-1] which is 2) to arr[j] and increment j.
arr[j] becomes 2
j becomes 2
Return j, which is 2.
Output:
Modified Array = {1, 2}
Number of distinct elements = 2

*/
