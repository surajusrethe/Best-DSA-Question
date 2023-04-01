/****************************************************************** QUESTION *********************************************************************************/

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/

/****************************************************************** APPROACH *********************************************************************************/


/*
- The depth of a node in a binary tree is the number of edges from the root to that node.
-  The height of a binary tree is the maximum depth of any node in the tree.
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
        3
       / \
      9  20
        /  \
       15   7

          
          
          maxDepth(3):
    root = 3
    root is not null, continue
    leftDepth = maxDepth(9):
        root = 9
        root is not null, continue
        leftDepth = maxDepth(null):
            return 0
        rightDepth = maxDepth(null):
            return 0
        return Math.max(0, 0) + 1 = 1
    rightDepth = maxDepth(20):
        root = 20
        root is not null, continue
        leftDepth = maxDepth(15):
            root = 15
            root is not null, continue
            leftDepth = maxDepth(null):
                return 0
            rightDepth = maxDepth(null):
                return 0
            return Math.max(0, 0) + 1 = 1
        rightDepth = maxDepth(7):
            root = 7
            root is not null, continue
            leftDepth = maxDepth(null):
                return 0
            rightDepth = maxDepth(null):
                return 0
            return Math.max(0, 0) + 1 = 1
        return Math.max(1, 1) + 1 = 2
    return Math.max(1, 2) + 1 = 3
                  
Therefore, the maximum depth of the tree is 3.

*/





