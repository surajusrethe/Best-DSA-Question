/****************************************************************** QUESTION *********************************************************************************/

/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

 

Example 1:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1

*/

/****************************************************************** APPROACH *********************************************************************************/



- If the root is null or either p or q, return the root. This is the base case.

- Recursively call lowestCommonAncestor on the left and right subtrees of the root, passing p and q as arguments.

- If both left and right nodes are not null, return the root. Otherwise, return the non-null node.



/****************************************************************** CODE *********************************************************************************/



public class Solution
 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null || root == p || root == q)  return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)   return root;

        return left != null ? left : right;
    }
}



/****************************************************************** DRY RUN *********************************************************************************/


/*
Input:
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6       2      0        8
          / \
         7   4
   p = 5, q = 4


First, we check if root is null or one of p or q. In this case, root is not null or equal to p or q, so we move to step 2.

We recursively call lowestCommonAncestor on the left and right subtrees of root, passing p and q as arguments. This means we will call lowestCommonAncestor with root.left as the new root, and with root.right as the new root.

Step 2a: For root.left (i.e., the subtree with root 5), we repeat steps 1 and 2. We first check if root.left is null or equal to p or q. It is equal to p, so we return root.left, which is the node with value 5.

The function returns 5, which is the lowest common ancestor of nodes 5 and 4 in the given binary tree.


*/
