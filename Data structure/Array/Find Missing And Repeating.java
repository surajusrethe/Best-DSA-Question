/************************************************************* Question ***************************************************************/

/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
*/

/************************************************************* Appraoch ***************************************************************/


Approach: 1 
  
Sort the given array arr.
Traverse the sorted array arr and for each element:
a. Check if it is equal to the previous element. If it is, then it is the repeating element.
b. Check if it is equal to the current index + 1. If it is not, then the missing element is current index + 1.


Approach: 2
  
  
- make frequency array of n+1 length because he gave to find missing num as well.
- intially narray will befilled with zeros
- travese in the freq array and increase the count for arr[i] element by going freq(arr[i]) index;
- Now travese the freq array again and check if number at ith position is 2 than it is repeating and the num with 0 is missing.
- return repeating and missing.



/************************************************************* Code ***************************************************************/

Approach: 2
  
  int[] findTwoElement(int arr[], int n) 
    {
        int[] freq = new int[n+1];
    int repeat = 0;
    int missing = 0;
    
    for (int i = 0; i < n; i++) {
        freq[arr[i]]++;
    }
    
    for (int i = 1; i <= n; i++) {
        if (freq[i] == 2) {
            repeat = i;
        } else if (freq[i] == 0) {
            missing = i;
        }
    }
    
    int[] result = {repeat, missing};
    return result;
    }





/************************************************************* Dry run ***************************************************************/



Suppose we have an array arr of length n = 7 and it contains the following elements:


arr = {1, 3, 4, 2, 5, 3, 7}
We want to find the missing and repeating numbers in this array using the given code.

Step 1: Initialize frequency array freq of size n+1 with all elements as 0.


freq = {0, 0, 0, 0, 0, 0, 0, 0}
Step 2: Traverse the array arr and update the frequency array freq accordingly.


freq = {0, 1, 1, 2, 1, 1, 0, 1}
Step 3: Traverse the frequency array freq and find the missing and repeating elements.


repeat = 3
missing = 6
Step 4: Return the result as an array of size 2 with repeating and missing elements respectively.


result = {3, 6}
Therefore, the missing number in the array is 6 and the repeating number is 3.
