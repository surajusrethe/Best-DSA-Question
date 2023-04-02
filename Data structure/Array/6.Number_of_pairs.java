/****************************** Question ***************************/

https://practice.geeksforgeeks.org/problems/number-of-pairs-1587115620/1

Given two arrays X and Y of positive integers, find the number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

Example 1:

Input: 
M = 3, X[] = [2 1 6] 
N = 2, Y[] = [1 5]
Output: 3
Explanation: 
The pairs which follow xy > yx are 
as such: 21 > 12,  25 > 52 and 61 > 16 .

/****************************** Code ***************************/
  
public static int countPairs(int[] X, int[] Y) {
    int count = 0;
    for (int i = 0; i < X.length; i++) {
        for (int j = 0; j < Y.length; j++) {
            if (Math.pow(X[i], Y[j]) > Math.pow(Y[j], X[i])) {
                count++;
            }
        }
    }
    return count;
}

/****************************** Dry Run ***************************/

X[] = [2, 3, 4, 5]
Y[] = [1, 2, 3]
M = 4, N = 3

Step 1: Initialize count to 0
count = 0

Step 2: For each element x in X, and for each element y in Y, check if x^y > y^x and update count accordingly
For x = 2 and y = 1:
    2^1 = 2, 1^2 = 1, 2 > 1, so increment count
    count = 1
For x = 2 and y = 2:
    2^2 = 4, 2^2 = 4, 2 is not greater than 4, so don't increment count
For x = 2 and y = 3:
    2^3 = 8, 3^2 = 9, 8 is not greater than 9, so don't increment count
For x = 3 and y = 1:
    3^1 = 3, 1^3 = 1, 3 is greater than 1, so increment count
    count = 2
For x = 3 and y = 2:
    3^2 = 9, 2^3 = 8, 9 is greater than 8, so increment count
    count = 3
For x = 3 and y = 3:
    3^3 = 27, 3^3 = 27, 27 is not greater than 27, so don't increment count
For x = 4 and y = 1:
    4^1 = 4, 1^4 = 1, 4 is greater than 1, so increment count
    count = 4
For x = 4 and y = 2:
    4^2 = 16, 2^4 = 16, 16 is not greater than 16, so don't increment count
For x = 4 and y = 3:
    4^3 = 64, 3^4 = 81, 64 is not greater than 81, so don't increment count
For x = 5 and y = 1:
    5^1 = 5, 1^5 = 1, 5 is greater than 1, so increment count
    count = 5
For x = 5 and y = 2:
    5^2 = 25, 2^5 = 32, 25 is not greater than 32, so don't increment count
For x = 5 and y = 3:
    5^3 = 125, 3^5 = 243, 125 is not greater than 243, so don't increment count

Step 3: Return the final count
count = 5

Output: 5
