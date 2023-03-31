/*************************************************************************NOTES******************************************************************************************/

/*

- A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle.
- you can only remove the top plate, and you can only add a new plate to the top of the stack.

- A queue  is a linear data structure that follows the First-In-First-Out (FIFO) principle. 
- the first person in line is the first one to be served, and new people join the back of the line.


Basic Operation:

Stack:

Push: Adds an element to the top of the stack.
Pop: Removes the top element from the stack.
Peek: Returns the value of the top element without removing it.
IsEmpty: Returns true if the stack is empty, false otherwise.
Size: Returns the number of elements in the stack.
Queue:

Enqueue: Adds an element to the back of the queue.
Dequeue: Removes the front element from the queue.
Peek: Returns the value of the front element without removing it.
IsEmpty: Returns true if the queue is empty, false otherwise.
Size: Returns the number of elements in the queue.


/*************************************************************************QUESTION******************************************************************************************/

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
*/

/*************************************************************************APPROACH******************************************************************************************/
/*
1. Using a stack to keep track of opening parentheses, brackets, and curly braces
2. Popping elements from the stack when a matching closing bracket is found.
3. Checking if the stack is empty after processing the input string.


/**************************************************************************CODE******************************************************************************************/


public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Create a new stack to keep track of opening brackets
        for(int i = 0; i < s.length(); i++) { // Iterate through the input string
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a); // If an opening bracket is encountered, push it onto the stack
            else if(stack.empty()) return false; // If a closing bracket is encountered but the stack is empty, the string is invalid
            else if(a == ')' && stack.pop() != '(') return false; // If a closing bracket matches the last opening bracket, pop the opening bracket from the stack
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty(); // If the stack is empty at the end of the processing, the string is valid
    }
}


/*************************************************************************DRY RUN******************************************************************************************/

/*
 Let's say we want to check if the string "{[(())]}" contains a valid set of parentheses, brackets, and curly braces.

Create a new stack: stack = []
Loop through the input string:
Check the first character, '{': stack = ['{']
Check the second character, '[': stack = ['{', '[']
Check the third character, '(': stack = ['{', '[', '(']
Check the fourth character, ')': stack = ['{', '['] (last opening bracket, '(', is popped)
Check the fifth character, ')': stack = ['{'] (last opening bracket, '[', is popped)
Check the sixth character, ']': Invalid string (last opening bracket, '{', does not match closing bracket, ']')
Since the input string contains an invalid set of parentheses, brackets, and curly braces, the code returns false.
*/

/**********************************************************************REAL WORLD USE******************************************************************************************/

/*
The problem of checking for valid parentheses, brackets, and curly braces has several real-world applications, including:

Programming language compilers: Programming languages often use nested structures (such as parentheses and brackets) to indicate blocks of code or groups of instructions. Compilers use the same approach as the one we used in this problem to ensure that the nested structures are balanced and that the code is syntactically correct.

Syntax highlighting in code editors: Code editors use syntax highlighting to make it easier to read and understand code. To do this, they need to know which parts of the code are nested structures and which parts are not. They use the same approach as the one we used in this problem to determine the correct nesting of structures and highlight them accordingly.

Math expressions: Math expressions often use parentheses and other symbols to indicate the order of operations. By checking that the symbols are properly nested and balanced, we can ensure that the expression is evaluated correctly.
*/


/*************************************************************************TAKE AWAYE******************************************************************************************/


