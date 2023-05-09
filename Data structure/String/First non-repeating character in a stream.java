/****************************************************************** Question ******************************************************************/
/*
Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If there is no such character then append '#' to the answer.
 

Example 1:

Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'
Example 2:

Input: A = "zz"
Output: "z#"
Explanation: For every character first non
repeating character is as follow-
"z" - first non-repeating character is 'z'
"zz" - no non-repeating character so '#'
*/

/****************************************************************** Approach ******************************************************************/

/*
Approach:

1. we have to find the 1st non repeating character not non repeating character only keep in mind.
2. So for that we have to initialize 3 thing 
    1. Array to keep the count of non repeating character, 
    2. Queue to Keep the record of 1st non repeating character,(you can use arraylist as well)
    3. We also need a variable to store a result.

3. Now iterate increase the frequency of the array for repeating character and add the 1st non repeating char to the queue then add it to the String variable at each iteration.
*/

Steps:
1. Creat StringBuilder result
2. creat frequesncy array
3. creat queue of Linkedlist
4. for each character in a input stream increase the frequency increace the frequency of current char
5. if requency of the character is 1 then add it to the queue.
6. remove all characters from the queue that are no longer non-repeating
7.  if there are no non-repeating characters in the queue, append "#" 
8. otherwise, append the first non-repeating character in the queue
9. return result
/****************************************************************** Code ******************************************************************/


class Solution {
    public String FirstNonRepeating(String A) {
        StringBuilder result = new StringBuilder(); // initialize a string to store the output
        int[] freq = new int[26]; // initialize an array to store the frequency of each character
        Queue<Character> queue = new LinkedList<>(); // initialize a queue to store the non-repeating characters
        
        // process each character in the input stream
        for (char c : A.toCharArray()) {
            freq[c - 'a']++; // increment the frequency of the current character
            
            // if the current character is non-repeating, add it to the queue
            if (freq[c - 'a'] == 1) {
                queue.add(c);
            }
            
            // remove all characters from the queue that are no longer non-repeating
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
            
            // if there are no non-repeating characters in the queue, append "#" to the output string
            if (queue.isEmpty()) {
                result.append('#');
            } else {
                // otherwise, append the first non-repeating character in the queue to the output string
                result.append(queue.peek());
            }
        }

        return result.toString(); // return the output string
    }
}



/****************************************************************** Dry run ******************************************************************/





