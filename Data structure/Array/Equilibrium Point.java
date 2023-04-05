/*********************************************************************** Question  ************************************************************************************/

/*
Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2).
*/

/*********************************************************************** Approach ************************************************************************************/

- find the left sum 
- find the right sum 
- if the left sum end right sum equal return its index.

/*********************************************************************** Code ************************************************************************************/

public static int equilibriumPoint(long arr[], int n) {

    if(n == 1) return 1;

    long[] pp = new long[n];
    pp[0] = arr[0];

    for(int i=1; i<n; i++) {
        pp[i] = pp[i-1] + arr[i];
    }

    long[] sp = new long[n];
    sp[n-1] = arr[n-1];

    for(int i=n-2; i>=0; i--) {
        sp[i] = sp[i+1] + arr[i];
    }

    for(int i=0; i<n; i++) {
        if(sp[i] == pp[i]) return i+1;
    }

    return -1;
}

/*********************************************************************** Dry Run ************************************************************************************/


/*

arr = {1, 3, 5, 2, 2}
n = 5
First, we check if the array has only one element, which is not the case here, so we continue.

Next, we initialize the prefix sum array and set its first element to the first element of the input array:


pp = {1, 0, 0, 0, 0}
Then, we calculate the prefix sum array by adding the current element of the input array to the previous element of the prefix sum array:


pp = {1, 4, 9, 11, 13}
Next, we initialize the suffix sum array and set its last element to the last element of the input array:

sp = {0, 0, 0, 0, 2}
Then, we calculate the suffix sum array by adding the current element of the input array to the next element of the suffix sum array:

sp = {12, 11, 8, 3, 2}
Now, we iterate over the input array and compare the prefix sum and suffix sum at each index. At index 0, the prefix sum and suffix sum are not equal. At index 1, they are not equal. At index 2, they are not equal. At index 3, they are not equal. At index 4, they are equal (13 = 13). Therefore, we return the index plus one as the equilibrium point:

return 5
So the output of the function will be 5.

This means that the first equilibrium point in the input array {1, 3, 5, 2, 2} is at index 5 (which is the last element of the array).

*/
