/********************************************************** Question ************************************************************************/
/*
Given two strings denoting non-negative numbers X and Y. Calculate the sum of X and Y.


Example 1:

Input:
X = "25", Y = "23"
Output:
48
Explanation:
The sum of 25 and 23 is 48.
Example 2:

Input:
X = "2500", Y = "23"
Output:
2523
Explanation:
The sum of 2500 and 23 is 2523.
*/
/********************************************************** Approach ************************************************************************/

Approach 1: TC and SC = O(n); because integer class uses an array of int to store the digits of a large number, which requires O(n) space complexity,When performing addition on two BigInteger objects, the algorithm needs to iterate over each digit in the input strings, which takes O(n) time complexity

//- convert to int and then add and then return by converting again into string


Appraoch 2: Use BigInteger Class in java, 

Approach 3:
/*
- Sabse pehle, dono string me se jiski length badi hai, use X me daal lete hai. Kyonki baad me kam kaam karna padega.

- Fir, rightmost digit se lekar leftmost digit tak loop chalayenge, aur dono string me se digits nikal kar unka sum nikalenge. Agar ek string ka digit khatam ho gaya to uski jagah zero assume karenge.

- Har baar nikle digit ka unit place result me daalenge, aur carry rakhega. Carry next iteration me add karenge.

- Jab loop khatam ho jaye, aur carry bhi bach jaye to use bhi result me add kar denge.

- Ab result string ko reverse karenge, leading zeroes hata denge, aur output return karenge. Baap re, ho gaya kaam!
*/
/********************************************************** Code ************************************************************************/

Approach 1:

class Solution {
    String findSum(String X, String Y) {
        // code here
        int x1 = int.parseInt(X);
        int y1 = int.parseInt(Y);
        
        int sum = x1+y1;
        
        return int.toString(sum);
    }
}



Approach 2:

 String findSum(String X, String Y) 
    {
        // code here
       java.math.BigInteger a = new java.math.BigInteger(X);
       java.math.BigInteger b = new java.math.BigInteger(Y);
       java.math.BigInteger sum = a.add(b);
       return sum.toString();
    }



Approach 3:

public String findSum(String X, String Y) {
    StringBuilder result = new StringBuilder();   // For storing result
    int carry = 0;   // For storing carry during addition
    
    int i = X.length() - 1;   // Starting from rightmost digit of X
    int j = Y.length() - 1;   // Starting from rightmost digit of Y
    
    // Loop through both numbers until no digits left
    while (i >= 0 || j >= 0) {
        // Get the value of current digits of X and Y
        int x = (i >= 0) ? X.charAt(i) - '0' : 0;
        int y = (j >= 0) ? Y.charAt(j) - '0' : 0;
        
        // Add the digits along with the previous carry
        int sum = x + y + carry;
        
        // Calculate the new carry
        carry = sum / 10;
        
        // Append the last digit of sum to result
        result.append(sum % 10);
        
        // Move to the next digit of both X and Y
        i--;
        j--;
    }
    
    // Add the final carry to result, if there is any
    if (carry != 0) {
        result.append(carry);
    }
    
    // Reverse the result to get the correct order
    result.reverse();
    
    // Remove any leading zeroes in the result
    int k = 0;
    while (k < result.length() && result.charAt(k) == '0') {
        k++;
    }
    
    // If there are no non-zero digits, return "0"
    if (k == result.length()) {
        return "0";
    }
    
    // Return the final result string
    return result.toString().substring(k);
}





/********************************************************** Dry run ************************************************************************/

Approach 3 
  
  
  | Line |          Code           |   X    |   Y    | result | carry |    i   |    j   |    sum   | 
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
|  2   | StringBuilder result = |        |        |   ""   |   0   |        |        |          |
|      |    new StringBuilder();|        |        |        |       |        |        |          |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
|  3   |       int carry = 0;   |        |        |        |   0   |        |        |          |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
|  4   | int i = X.length() - 1;| "1234" | "5678" |        |   0   |   3    |   3    |          |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
|  5   | int j = Y.length() - 1;| "1234" | "5678" |        |   0   |   3    |   3    |          |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
|  7   |    while (i >= 0 || j >= 0) {                | "1234" | "5678" | "6912" |   1   |   -1   |   -1   |
|  8   |        int x = (i >= 0) ? X.charAt(i) - '0' : 0; | "1234" | "5678" | "6912" |   1   |   -1   |
|  9   |        int y = (j >= 0) ? Y.charAt(j) - '0' : 0; | "1234" | "5678" | "6912" |   1   |   -1   |
| 10   |        int sum = x + y + carry;               | "1234" | "5678" | "6912" |   1   |   -1   |
| 11   |        carry = sum / 10;                      | "1234" | "5678" | "6912" |   0   |   -1   |
| 12   |        result.append(sum % 10);               | "1234" | "5678" | "6912" |   0   |   -1   |
| 13   |        i--;                                   | "1234" | "5678" | "6912" |   0   |   -2   |
| 14   |        j--;                                   | "1234" | "5678" | "6912" |   0   |   -2   |
| 15   |    }                                           | "1234" | "5678" | "6912" |   0   |   -2   |
|------|------------------------------------------------|--------|--------|--------|-------|--------|
| 18   |    if (carry != 0) {                          | "1234" | "5678" | "6912" |   0   |   -2
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
| 19   |        result.append(carry);                  | "1234" | "5678" | "6912" |   0   |   -2   |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
| 22   |    result.reverse();                          | "1234" | "5678" | "2196" |   0   |   -2   |
|------|------------------------|--------|--------|--------|-------|--------|--------|----------|
| 25   |    while (k < result.length() && result.charAt(k) == '0') { | "1234" | "5678" | "2196" |   0   |   -2   |
| 26   |        k++;                                   | "1234" | "5678" | "2196" |   0   |   -2   |
| 27   |    }                                           | "1234" | "5678" | "2196" |   0   |   -2   |
|------|------------------------------------------------|--------|--------|--------|-------|--------|
| 29   |    if (k == result.length()) {                | "1234" | "5678" | "2196" |   0   |   -2   |
| 30   |        return "0";                           | "1234" | "5678" | "2196" |   0   |   -2   |
| 31   |    }                                           | "1234" | "5678" | "2196" |   0   |   -2   |
|------|------------------------------------------------|--------|--------|--------|-------|--------|
| 34   |    return result.toString().substring(k);     | "1234" | "5678" | "2196" |   0   |   -2   |

