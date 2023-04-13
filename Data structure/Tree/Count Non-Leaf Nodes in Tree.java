/********************************************************* Question ************************************************************************/
https://practice.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1?page=1&difficulty[]=-1&category[]=Tree&sortBy=submissions
/*
Given a Binary Tree of size N, your task is to complete the function countNonLeafNodes(), that should return the count of all the non-leaf nodes of the given binary tree.

Example:

Input: 
Image
Output:
2
Explanation:
Nodes 1 and 2 are the only non leaf nodes.
*/

/********************************************************* Approach ************************************************************************/
/*
Approach:
The main idea is to traverse the tree and check if a node is a non-leaf node or not.

Logic:

In the countNonLeafNodes() method, the first thing we do is to check if the root node is null or it has no children. If it is true, then we return 0, as there can be no non-leaf node.

If the root node has at least one child, we initialize a count variable to 0.

We then check if the root node has at least one child. If it has, we increment the count variable by 1, as this node is a non-leaf node.

We then make a recursive call to countNonLeafNodes() on the left child and right child of the root node.

The counts of non-leaf nodes in the left subtree and right subtree are added to the count variable.

Finally, we return the count variable as the total number of non-leaf nodes in the binary tree.
*/

/********************************************************* Code ************************************************************************/

class Solution
{
    // Function to count the number of non-leaf nodes in a binary tree
    int countNonLeafNodes(Node root) {
        
        // Base case: if the root node is null, there are no non-leaf nodes
        if (root == null) return 0;
        
        // Initialize the count to 0
        int count = 0;
        
        // Check if the current node is a non-leaf node
        if (root.left != null || root.right != null) count++;
        
        // Recursively count the non-leaf nodes in the left and right subtrees
        count += countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
        
        // Return the total count of non-leaf nodes
        return count;
    }
}


/********************************************************* Dry Run ************************************************************************/

countNonLeafNodes(root)
      |
      +--(root == null) -> return 0
      |
      +--count = 0
      |
      +--(root.left != null || root.right != null) -> count++
      |          
      +--countNonLeafNodes(root.left)
      |     |
      |     +--(root == null) -> return 0
      |     |
      |     +--count = 0
      |     |
      |     +--(root.left != null || root.right != null) -> count++
      |     |
      |     +--countNonLeafNodes(root.left.left)
      |     |     |
      |     |     +--(root == null) -> return 0
      |     |     |
      |     |     +--count = 0
      |     |     |
      |     |     +--(root.left != null || root.right != null) -> count++
      |     |     |
      |     |     +--countNonLeafNodes(null)
      |     |     |     |
      |     |     |     +--return 0
      |     |     |
      |     |     +--countNonLeafNodes(null)
      |     |           |
      |     |           +--return 0
      |     |
      |     +--countNonLeafNodes(root.left.right)
      |           |
      |           +--(root == null) -> return 0
      |           |
      |           +--count = 0
      |           |
      |           +--(root.left != null || root.right != null) -> count++
      |           |
      |           +--countNonLeafNodes(null)
      |           |     |
      |           |     +--return 0
      |           |
      |           +--countNonLeafNodes(null)
      |                 |
      |                 +--return 0
      |
      +--countNonLeafNodes(root.right)
            |
            +--(root == null) -> return 0
            |
            +--count = 0
            |
            +--(root.left != null || root.right != null) -> count++
            |
            +--countNonLeafNodes(null)
            |     |
            |     +--return 0
            |
            +--countNonLeafNodes(null)
                  |
                  +--return 0
Sure! Here is the recursive tree for the given code:

scss
Copy code
countNonLeafNodes(root)
      |
      +--(root == null) -> return 0
      |
      +--count = 0
      |
      +--(root.left != null || root.right != null) -> count++
      |          
      +--countNonLeafNodes(root.left)
      |     |
      |     +--(root == null) -> return 0
      |     |
      |     +--count = 0
      |     |
      |     +--(root.left != null || root.right != null) -> count++
      |     |
      |     +--countNonLeafNodes(root.left.left)
      |     |     |
      |     |     +--(root == null) -> return 0
      |     |     |
      |     |     +--count = 0
      |     |     |
      |     |     +--(root.left != null || root.right != null) -> count++
      |     |     |
      |     |     +--countNonLeafNodes(null)
      |     |     |     |
      |     |     |     +--return 0
      |     |     |
      |     |     +--countNonLeafNodes(null)
      |     |           |
      |     |           +--return 0
      |     |
      |     +--countNonLeafNodes(root.left.right)
      |           |
      |           +--(root == null) -> return 0
      |           |
      |           +--count = 0
      |           |
      |           +--(root.left != null || root.right != null) -> count++
      |           |
      |           +--countNonLeafNodes(null)
      |           |     |
      |           |     +--return 0
      |           |
      |           +--countNonLeafNodes(null)
      |                 |
      |                 +--return 0
      |
      +--countNonLeafNodes(root.right)
            |
            +--(root == null) -> return 0
            |
            +--count = 0
            |
            +--(root.left != null || root.right != null) -> count++
            |
            +--countNonLeafNodes(null)
            |     |
            |     +--return 0
            |
            +--countNonLeafNodes(null)
                  |
                  +--return 0
  
  
In this tree, each node represents a call to the countNonLeafNodes() function. The tree is constructed by recursively calling the function on the left and right subtrees of the root node.

The node contains information about the arguments passed to the function and the result returned by the function. For example, a node with (root == null) -> return 0 means that the function was called with a null root node, and it returned 0.

The tree shows how the function traverses the binary tree recursively and calculates the total number of non-leaf nodes.






/********************************************************* Take Away ************************************************************************/



