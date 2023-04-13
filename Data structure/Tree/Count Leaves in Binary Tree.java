/************************************************** Question **********************************************************/
https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1?page=1&difficulty[]=-1&category[]=Tree&sortBy=submissions


Given a Binary Tree of size N, You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5

 

Example 1:


Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.



/************************************************** Approach **********************************************************/


Approach: O(n) & O(H)
To count the number of leaves in a binary tree, we need to traverse the tree and check if the node is a leaf node. If it is a leaf node, then increment the count by 1. We can perform this operation recursively for each node in the tree.

Logic:

- If the node is null, return 0
- If the node is a leaf node, return 1
- Recursively count the number of leaves in the left and right subtree of the node and add them.





/************************************************** Code **********************************************************/



class Tree {
    int countLeaves(Node node) {
        // If node is null, return 0
        if (node == null) {
            return 0;
        }
        // If node is a leaf node, return 1
        if (node.left == null && node.right == null) {
            return 1;
        }
        // Recursively count the number of leaves in the left and right subtree of the node and add them.
        int leftCount = countLeaves(node.left);
        int rightCount = countLeaves(node.right);
        return leftCount + rightCount;
    }
}





/************************************************** Dry Run **********************************************************/
           1
         /   \
        2     3
      /  \   /  \
     4    5 6    7


Sure, let me dry run the code in a table for better visualization:

Node	  Left Child	  Right Child	  countLeaves(Node)
Root:1	  Node2       	Node3	            3
Node 2	  Node4	        Node5	            2
Node 3	  Node6	        Node7	            1
Node 4	  null	        null	            1
Node 5	  null	        null	            1
Node 6	  null	        null	            1
Node 7	  null	        null	            1


As we can see in the table above, the countLeaves method is called for each node in the binary tree. For each node, we check if it is a leaf node or not. If it is a leaf node, we return 1. Otherwise, we recursively call countLeaves on its left and right child nodes and add their counts.

At the end, the total count of leaf nodes in the binary tree is returned by the countLeaves method, which is 3.


/************************************************** Take Away **********************************************************/







