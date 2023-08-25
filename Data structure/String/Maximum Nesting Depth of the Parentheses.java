public class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;         // Initialize the maximum depth to 0.
        int currentDepth = 0;     // Initialize the current depth to 0.


        for (char c : s.toCharArray()) {  // Loop through each character in the given string.
            if (c == '(') {               // If the character is an opening parenthesis '(',
                currentDepth++;           //   Increase the current depth by 1.
                // Update maxDepth with the maximum of its current value and the currentDepth.
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {        // If the character is a closing parenthesis ')',
                currentDepth--;           //   Decrease the current depth by 1.
            }
        }


        // Return the maximum depth found in the string.
        return maxDepth;
    }
}
