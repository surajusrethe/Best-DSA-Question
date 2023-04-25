/******************************************************************* Question **************************************************************************/

/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.


Example 2:

Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.
*/

/******************************************************************* Approach **************************************************************************/



/******************************************************************* Code **************************************************************************/


public int remAnagrams(String s1,String s2)
    {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Count the frequency of each character in both strings
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        
        // Compute the absolute difference between the frequency of each character in both frequency tables
        int diff = 0;
        for (int i = 0; i < 26; i++) 
        {
            diff += Math.abs(freq1[i] - freq2[i]);
        }
        
        // Return the minimum number of characters to be deleted to make both strings anagram
        return diff;
    }


/******************************************************************* Dry run **************************************************************************/

/*
s1 = "bcadeh"
s2 = "hea"

Initialize two frequency tables freq1 and freq2, each of size 26 (the number of lowercase English letters):
freq1 = {a:1, b:1, c:1, d:1, e:1, f:0, g:0, h:1, i:0, j:0, k:0, l:0, m:0, n:0, o:0, p:0, q:0, r:0, s:0, t:0, u:0, v:0, w:0, x:0, y:0, z:0}
freq2 = {a:1, b:0, c:0, d:0, e:1, f:0, g:0, h:1, i:0, j:0, k:0, l:0, m:0, n:0, o:0, p:0, q:0, r:0, s:0, t:0, u:0, v:0, w:0, x:0, y:0, z:0}

Count the frequency of each character in both strings:
freq1 = {a:1, b:1, c:1, d:1, e:1, f:0, g:0, h:1, i:0, j:0, k:0, l:0, m:0, n:0, o:0, p:0, q:0, r:0, s:0, t:0, u:0, v:0, w:0, x:0, y:0, z:0}
freq2 = {a:1, b:0, c:0, d:0, e:1, f:0, g:0, h:1, i:0, j:0, k:0, l:0, m:0, n:0, o:0, p:0, q:0, r:0, s:0, t:0, u:0, v:0, w:0, x:0, y:0, z:0}

Compute the absolute difference between the frequency of each character in both frequency tables:
diff = |1-1| + |1-0| + |1-0| + |1-0| + |1-1| + |0-0| + |0-0| + |1-1| + ... + |0-0|
     = 3

Return the minimum number of characters to be deleted to make both strings anagram:
3

*/






