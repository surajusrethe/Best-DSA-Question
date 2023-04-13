/********************************************************* Question ************************************************************************/
https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1?page=1&difficulty[]=-1&category[]=Tree&sortBy=submissions

Given a Binary Tree of size N, your task is to complete the function sumBt(), that should return the sum of all the nodes of the given binary tree.





/********************************************************* Approach ************************************************************************/
/*
The problem requires calculating the sum of all the nodes in a given binary tree. We can solve this problem using a recursive approach. Here's the logic:

- If the given tree is empty, return 0.
- If the given tree is not empty, calculate the sum of the root node value, the sum of all nodes - in the left subtree, and the sum of all nodes in the right subtree.
- Add the three sums calculated in step 2 and return the result
*/

/********************************************************* Code ************************************************************************/



class BinaryTree
{
    static int sumBT(Node head)
    {
        if(head == null) return 0;
        
        return sumBT(head.left) + sumBT(head.right) + head.data;   
    }
}


/********************************************************* Dry Run ************************************************************************/

sumBT(head)
   |
   +-- if(head == null) return 0;
   |
   +-- return sumBT(head.left) + sumBT(head.right) + head.data;
           |
           +-- sumBT(head.left)
           |      |
           |      +-- if(head.left == null) return 0;
           |      |
           |      +-- return sumBT(head.left.left) + sumBT(head.left.right) + head.left.data;
           |              |
           |              +-- sumBT(head.left.left)
           |              |       |
           |              |       +-- if(head.left.left == null) return 0;
           |              |       |
           |              |       +-- return head.left.left.data;
           |              |
           |              +-- sumBT(head.left.right)
           |                      |
           |                      +-- if(head.left.right == null) return 0;
           |                      |
           |                      +-- return head.left.right.data;
           |
           +-- sumBT(head.right)
                  |
                  +-- if(head.right == null) return 0;
                  |
                  +-- return sumBT(head.right.left) + sumBT(head.right.right) + head.right.data;
                          |
                          +-- sumBT(head.right.left)
                          |       |
                          |       +-- if(head.right.left == null) return 0;
                          |       |
                          |       +-- return head.right.left.data;
                          |
                          +-- sumBT(head.right.right)
                                  |
                                  +-- if(head.right.right == null) return 0;
                                  |
                                  +-- return head.right.right.data;


In the above diagram, each node represents a function call to sumBT() with a specific node as its argument. The edges represent the flow of control from one function call to another.

As you can see, the sumBT() function is called recursively on the left and right subtrees of the current node until it reaches the leaf nodes (i.e., nodes with no children). At each node, the function calculates the sum of all the nodes in its left and right subtrees and adds the value of the current node. Finally, the total sum of all the nodes in the binary tree is computed by recursively adding the values of its left and right subtrees and adding the value of the root node.






/********************************************************* Take Away ************************************************************************/









