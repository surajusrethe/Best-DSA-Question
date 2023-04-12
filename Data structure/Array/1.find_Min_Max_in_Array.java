//Notes:

//An array is a collection of elements of the same data type that are stored in contiguous memory locations.
//The first element in an array has an index of 0.
//The size of an array is fixed at the time of declaration, and it cannot be changed during the lifetime of the program.
// Pass by value means that a copy of the argument is passed to the function.
//Pass by reference means The function operates on the original argument, and any modifications made to the argument inside the function are reflected outside the function.
//Java does not have true pass-by-reference like some other programming languages such as C++ or Python. In Java, all arguments to methods are passed by value.
//However, Java provides a way to simulate pass-by-reference behavior by passing an object reference as an argument to a method.
//In Java, objects are always passed by reference.

//The time complexity of different operations on an array:

// 1. Accessing an element: O(1).
// 2. Insertion at the end: O(1).
// 3. Insertion at a specific position: O(n).
// 4. Deletion from the end: O(1).
// 5. Deletion from a specific position: O(n).
// 6. Searching for an element: O(n).
// 7. Sorting an array: O(n log n).
// 8. Merging two arrays: O(n).

.........................................................................................................................................................................
question link: https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000

...........................................................................................................................................................................

Approach 1:  TC = O(nlogn)

- Sort the array and return arr[0] as min and arr[n-1] as max;


Approach 2: 

- initialize 2 variables min = Integer.MIN_VALUE; and max = Integer.MAX_VALUE; rough an 
- iterate through an array and check is arr[i] greater than min and max then update the values of min and max.


Code:

// Define a class called Compute
class Compute {
    
    // Define a static method called getMinMax that takes an array of longs and its length as input
    static pair getMinMax(long arr[], long n)  
    {
        // Write your code here
        
        // Initialize variables to store the minimum and maximum values of the array
        // We set the initial value to the largest and smallest possible integers to ensure that any value in the array will be smaller or larger
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Iterate over the array to find the minimum and maximum values
        for (int i = 0; i < arr.length; i++) 
        {
            // Update the minimum value by comparing the current element with the current minimum value
            min = Math.min(arr[i], min);
            
            // Update the maximum value by comparing the current element with the current maximum value
            max = Math.max(arr[i], max);
        }
        
        // Return a pair object containing the minimum and maximum values
       return new pair(min, max);
    } 
}


/****************************************************************** Dry Run ******************************************************************************/

 
Step	   arr[i]	    min	    max
1	       3	        3	       3
2	       2	        2	       3
3       	1	        1	       3
4	       56	       1	       56
5	     10000	      1	     10000
6	      167	       1	     10000

