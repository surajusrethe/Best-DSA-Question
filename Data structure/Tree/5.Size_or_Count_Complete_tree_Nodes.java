/************************************************************************ QUESTION **************************************************************************************/

/*Given the root of a complete binary tree, return the number of the nodes in the tree.

According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.*/


/************************************************************************ APPROACH **************************************************************************************/

/*

- if root reached null or leaf node return 0;
- count the node in left side recursively and count the node in right side recursively 
- add the left and right node total and also add 1 for root node.

*/


/************************************************************************ CODE **************************************************************************************/



class Solution {
    public int countNodes(TreeNode root) 
    {
        if(root == null) return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}

/************************************************************************ DRY RUN **************************************************************************************/

/*

Here's how the function returns the count of nodes for each node in the binary tree:

For node 4, the function returns 1 (since it has no children)
For node 5, the function returns 1 (since it has no children)
For node 6, the function returns 0 (since it is null)
For node 2, the function returns 2 (since it has 2 leaf nodes, nodes 4 and 5)
For node 3, the function returns 1 (since it has only 1 leaf node, node 6)
Finally, for the root node 1, the function returns the sum of the counts of its left and right subtrees plus 1 for itself, which is 2 + 1 + 1 = 4

*/
