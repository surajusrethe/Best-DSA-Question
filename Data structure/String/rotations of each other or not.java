/******************************************************* Question *******************************************************/

Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.

 

Example 1:

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.


/******************************************************* Approach *******************************************************/




/******************************************************* Code *******************************************************/


public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length() != s2.length())
            return false;
        
        String s3 = s1+s1;
        
        return s3.contains(s2);
    }


/******************************************************* Dry run *******************************************************/


s1 = "abcd"
s2 = "cdab"

s1.length() = 4
s2.length() = 4

s3 = s1 + s1 = "abcdabcd"

s3.contains(s2) = true

Output: true
