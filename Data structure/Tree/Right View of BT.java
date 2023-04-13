/*********************************************************************** Question **********************************************************************************/

/*
Given a binary tree A of integers. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree: is a set of nodes visible when the tree is visited from Right side.

Example Input
Input 1:

        1
      /   \
     2    3
    / \  / \
   4   5 6  7
  /
 8 
Input 2:

    1
   /  \
  2    3
   \
    4
     \
      5


Example Output
Output 1:

 [1, 3, 7, 8]
Output 2:

 [1, 3, 4, 5]
*/
/*********************************************************************** Approach  **********************************************************************************/
Approach 1: TC = O(n), SC = O(H);
/*
- Initialize the empty list to store value.
- now is you are at root node so level will be 0 and list size will also be zero, when you move to the Right side to find value level will increase, so waht if we 
  we add node value to our list if level and size of the node are equal, if not we will skip, this how we will be able to store right side value only.
- recursively traverse in the right side 1st and than left.
- retun the list.
*/
/*********************************************************************** Code **********************************************************************************/


// Implementation of the right side view of a binary tree using recursive approach

public class Solution {
    ArrayList<Integer> res = new ArrayList<>(); // ArrayList to store the right view elements
    
    // Function to get the right side view elements
    public ArrayList<Integer> solve(TreeNode root) {
        rSV(root, 0); // Call to recursive function
        return res; // Return the ArrayList
    }
    
    // Recursive function to traverse the tree in a pre-order fashion and get the right view elements
    public void rSV(TreeNode root, int level) {
        if (root == null) return; // Base case
        
        // If the current level is equal to the size of the ArrayList, add the current node's value to the ArrayList
        if (level == res.size()) res.add(root.val);
        
        // Recursive call to traverse the right and left subtrees, incrementing the level by 1 at each recursive call
        rSV(root.right, level+1);
        rSV(root.left, level+1);
    }
}



/*********************************************************************** Dry run  **********************************************************************************/



Function Call	                                    rightSideView(root)
Input	                                            root = [1,2,3,null,5,null,4]
result list initialization	                      []
rightView(root, 0) call	                          rightView(1, 0)
rightView(1, 0)	
  
result size check	                                result.size() = 0
Add 1 to result	                                  result = [1]
rightView(3, 1)	                                  rightView(3, 1)
rightView(3, 1)	
  
result size check	                                  result.size() = 1
Add 3 to result	                                    result = [1, 3]
rightView(4, 2)                                   	rightView(4, 2)
rightView(4, 2)	
  
result size check	                                  result.size() = 2
Add 4 to result	                                    result = [1, 3, 4]
rightView(null, 3)	                                Return
rightView(5, 2)	                                    rightView(5, 3)
rightView(5, 3)	                                    Return
rightView(null, 4)	                                Return
rightView(null, 3)	                                Return
rightView(2, 1)	                                    rightView(2, 2)
rightView(2, 2)	                                    Return
rightView(null, 3)	                                Return
Return                                              result	[1, 3, 4]


/*********************************************************************** Take Away **********************************************************************************/

- The time complexity of this code is O(n). This is because the rightView() function is called for each node in the Binary Tree exactly once.
  In the worst case, the Binary Tree is a completely skewed(matlab sirf tree left hai ya to right side) tree, in which case the rightView() function will be called for   every node in the Binary Tree. Therefore, the time complexity of the rightSideView() function, which calls rightView(), is also O(n).
  
 - The space complexity of this code is O(h).This is because the maximum number of function calls that can be present on the call stack at any given time is equal to      the height of the Binary Tree. 
   In the worst case, the Binary Tree is a completely skewed tree, in which case the height of the Binary Tree is equal to the number of nodes in the Binary Tree.        Therefore, the space complexity of the rightSideView() function, which calls rightView(), is O(n) in the worst case. However, in the average case, the space            complexity is O(log n), where n is the number of nodes in the Binary Tree.
  
  
  To print the left view of the binary tree instead of the right view, we need to traverse the left subtree before the right subtree.
  We can modify the rSV function to achieve this by swapping the order of the recursive calls:

public void rSV(TreeNode root, int level) {
    if (root == null) return;
    
    if (level == res.size()) res.add(root.val);
    
    rSV(root.left, level+1);
    rSV(root.right, level+1);
}



The logic behind the code is to traverse the binary tree in a depth-first manner, and keep track of the level of each node in the tree. Whenever we encounter a node at a new level, we add it to the result list, as it will be visible from the right side of the tree. This works because we are always traversing the right subtree before the left subtree, so the last node we encounter at a particular level will always be the rightmost node visible from that level.









