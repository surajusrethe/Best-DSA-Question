/****************************************************************** QUESTION *********************************************************************************/

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/

/****************************************************************** APPROACH *********************************************************************************/


/*
- The depth of a node in a binary tree is the number of edges from the root to that node.
-  The height of a binary tree is the maximum depth of any node in the tree.

Here is the approach and logic to find the height of a binary tree:

If the root node is null, return 0 as the height of an empty tree is 0.

Recursively find the height of the left and right subtrees.

The height of a tree is equal to 1 plus the maximum height of its left and right subtrees.

Return the maximum of the height of the left subtree and the height of the right subtree plus 1.



*/

/****************************************************************** CODE *********************************************************************************/


class Solution {
    public int maxDepth(TreeNode root)
    {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;   
    }
}


/****************************************************************** DRY RUN *********************************************************************************/

/*
                         maxDepth(root)
                          /     \
                         /       \
     maxDepth(root.left)        maxDepth(root.right)
            /     \                  /       \
           /       \                /         \
maxDepth(...) maxDepth(...) maxDepth(...) maxDepth(...)


Each node in the tree represents a call to the maxDepth() function with a particular subtree as the root. The left child of a node represents the left subtree of the current root, and the right child represents the right subtree. The leaves of the tree correspond to the base case of the recursive function, where the current root is null.

The function calculates the maximum depth of the tree by recursively computing the maximum depth of each subtree and returning the maximum depth among the left and right subtrees, plus one for the current root.


*/
