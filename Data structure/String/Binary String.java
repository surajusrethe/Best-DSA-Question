/******************************************************************* Question **************************************************************************/


Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

Example 1:

Input:
N = 4
S = 1111
Output: 6
Explanation: There are 6 substrings from
the given string. They are 11, 11, 11,
111, 111, 1111.
Example 2:

Input:
N = 5
S = 01101
Output: 3
Explanation: There 3 substrings from the
given string. They are 11, 101, 1101.


/******************************************************************* Approach **************************************************************************/
Approacch 1:
/*
- i = 0, j= i+1; use 2 loops;
- check if i and j == '1', increase the value of count by one;
- return count;
*/


Approacch 2:


- if you observe:
  if s = "1" subStringCount = 0
  if s = "11" subStringCount = 1
  if s = "111" subStringCount = 3
  if s = "10101" subStringCount = 3
  if s = "1111" subStringCount = 6
  if s = "10111" subStringCount = 6
    
- number of '0' in the string doesn'r matter what matters is number of  '1' so keep count of it and than use formula.
- (count*(count - 1))/2



/******************************************************************* Code **************************************************************************/

// Approacch 1:

public static int binarySubstring(int a, String str)
{
    int count = 0; // initialize a variable to keep count of the number of substrings

    // iterate over all possible pairs of indices (i, j) such that i < j
    for (int i = 0; i < a; i++) {
        for (int j = i+1; j < a; j++) {
            // if both characters at indices i and j are '1', increment the count
            if (str.charAt(i) == '1' && str.charAt(j) == '1') {
                count++;
            }
        }
    }

    // return the final count of substrings
    return count;
}


..................................................................................................................................................................
  
// Approacch 2:



public static int binarySubstring(int a, String str) 
{
        int count = 0;
  
        for (int i = 0; i < a; i++)
        {
            if (str.charAt(i) == '1') count++;
        }
  
        return count * (count - 1) / 2;
    }
  


/******************************************************************* Dry run **************************************************************************/

Approacch 1:
 
/*
  0 1 2 3 4
  +---------+
0 |0|0|0| | |
  +---------+
1 |1|1|1| | |
  +---------+
2 | | |1|0| |
  +---------+
3 | | | |1| |
  +---------+
4 | | | | |1|
  +---------+

count = 3

*/

...................................................................................................................................................................
    
Approach 2:

/*

Input: str = "01101", a = 5

Initialization: count = 0

Iteration 1: i = 0, str.charAt(0) = '0' (not equal to '1'), count = 0
Iteration 2: i = 1, str.charAt(1) = '1' (equal to '1'), count = 1
Iteration 3: i = 2, str.charAt(2) = '1' (equal to '1'), count = 2
Iteration 4: i = 3, str.charAt(3) = '0' (not equal to '1'), count = 2
Iteration 5: i = 4, str.charAt(4) = '1' (equal to '1'), count = 3

Final count of 1s: count = 3

Number of substrings that start and end with 1: count * (count - 1) / 2 = 3 * (3 - 1) / 2 = 3

Output: 3

*/




