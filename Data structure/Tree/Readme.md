                                                                    **Tree**

Terminologies:

Node: A node represents a single element in the tree that can store data and references to its children.

Root: The root node is the topmost node in the tree and has no parent.

Parent: The node which is a predecessor of a node is called the parent node of that node.

Child: The node which is the immediate successor of a node is called the child node of that node.

Leaf: A leaf node is a node that has no children.

Sibling: Nodes that share the same parent are called siblings.

Depth: The depth of a tree is a measure of how many levels or layers it has.node se root tak ki length hoti hai depth of node.

Height:  Longest path from root to the Leaf of the tree is called height of the tree.

Subtree:Any part of the tree is Subtree, even a single node of tree is Subtree. It is the same as the terminology Subarray.

Ancestor: An ancestor of a node is any node that is on the path from the root node to that node.

Descendant: All nodes Below current node are called descendants.

Binary Tree: A binary tree is a tree in which each node has at most two children.

Binary Search Tree: A binary search tree is a binary tree in which the left subtree of a node contains only nodes with keys less than the node's key, and the right subtree of a node contains only nodes with keys greater than the node's key.

Balanced Tree: A balanced tree is a tree in which the heights of the subtrees of any node differ by at most one.

Complete Tree: A complete tree is a tree in which every level is completely filled, except possibly for the last level, which is filled from left to right.
Level of Node: The count of edges on the path from the root node to that node. The root node has level 0.
 Internal Node:A node with at least one child is called Internal Node.
 


                                                              **Binary Tree**
                                                              

A binary tree is a tree data structure in which each node has at most 2 children. 

The structure of a binary tree is such that it resembles a hierarchy or a family tree.

Binary trees can be empty or can have a root node with 2 children each node of the binary tree.

 Binary tree can also have one child or no children in which case it is referred to as a leaf node. 
Binary Tree Properties:

A binary tree can have at most two children for each node.
The left child of a node is always less than the parent node, and the right child of a node is always greater than the parent node.
A binary tree can be empty or can have a root node with two children.
The maximum number of nodes at level 'l' of a binary tree is 2^l.
The Maximum number of nodes in a binary tree of height 'h' is 2^(h+1) - 1.
A binary tree is said to be a full binary tree if every node has either 0 or 2 children.
A binary tree is said to be a complete binary tree if all the levels except possibly the last are completely filled, and all the nodes are as far left as possible.


Binary Tree Traversal:


Inorder Traversal:

Traverse the left subtree in inorder.
Visit the root node.
Traverse the right subtree in inorder.

if(root == null) return;

inorderTraversal(root.left);
System.out.print (root.data+” “);
inorderTraversal(root.right);


Preorder Traversal:
Visit the root node.
Traverse the left subtree in preorder.
Traverse the right subtree in preorder.


if(root == null) return;

System.out.print (root.data+” “);
inorderTraversal(root.left);
inorderTraversal(root.right);


Postorder Traversal:
Traverse the left subtree in postorder.
Traverse the right subtree in postorder.
Visit the root node.



if(root == null) return;

inorderTraversal(root.left);
inorderTraversal(root.right);
System.out.print (root.data+” “);


When to Use Which Traversal:


Inorder Traversal:
Inorder traversal is used to get the elements of a binary search tree in non-decreasing order.
It's also useful when we want to process the binary tree nodes in a sorted order.
Additionally, inorder traversal is used to convert a binary search tree into an array, and vice versa.
Preorder Traversal:
Preorder traversal is used to create a copy of a binary tree, where the root node is copied first, followed by its left and right sub-trees.
It's also useful in building an expression tree from a given postfix or prefix expression.
Postorder Traversal:
Postorder traversal is used to delete the entire binary tree in a bottom-up fashion.
It's also useful in evaluating a postfix expression tree, where we start from the leaf nodes and move towards the root node to get the final result.


Bonus : 

In prefix notation (also known as Polish notation), the operators appear before the operands. For example, the prefix notation of the expression (2 + 3) * 4 is * + 2 3 4.

In postfix notation (also known as Reverse Polish notation), the operators appear after the operands. For example, the postfix notation of the expression (2 + 3) * 4 is 2 3 + 4 *.

Note:

 Preorder traversal of a binary tree can be used to convert an expression in prefix notation to a binary expression tree.
 
Similarly, postorder traversal can be used to convert an expression in postfix notation to a binary expression tree.



Binary Tree Types:


Complete Binary Tree:

A binary tree is complete if all levels are completely filled except possibly the last level, and the last level has all keys as left as possible.
In other words, all the nodes at each level are filled from left to right, except possibly the last level. In the last level, nodes are filled from left to right until there are no more nodes to add.

Balanced Binary Tree:

A binary tree is balanced if the height of the left and right subtrees of any node differ by at most one.
A balanced binary tree ensures that the height of the tree is as small as possible, which makes certain operations, such as search and insert, more efficient.

Full Binary Tree:

A binary tree is full if every node has either zero or two children.
In other words, there are no nodes with only one child in a full binary tree.

Perfect Binary Tree:

A binary tree is perfect if all its levels are completely filled, i.e., the number of nodes in each level is equal to 2^h, where h is the height of the tree.
A perfect binary tree is also a complete binary tree, but not all complete binary trees are perfect.

Degenerate (or pathological) Binary Tree:

A degenerate binary tree is a tree in which every parent node has only one associated child node.
A degenerate binary tree can be represented as a linked list, where each node has only one child node, except for the last node which has no child node.

Basic Operations in Binary Tree:

Insertion: Inserting a node into a binary tree involves finding the appropriate position to insert the new node in the tree based on its value. 

public void insert(Node root, int data) {
    if (root == null) {
        root = new Node(data);
        return;
    }
    if (data < root.data) {
        if (root.left == null) {
            root.left = new Node(data);
        } else {
            insert(root.left, data);
        }
    } else {
        if (root.right == null) {
            root.right = new Node(data);
        } else {
            insert(root.right, data);
        }
    }
}

visualization
          50                           50
         /  \                         /  \
       30    70          =>         30   70
      /  \  /  \                   / \  / \
     20  40 60  80                20 40 60 80
          \                       /      /
          45                     45    75
                                       \
                                        85
Deletion: Deleting a node from a binary tree involves finding the node to be deleted and then removing it from the tree. 

public Node delete(Node root, int data) {
    if (root == null) {
        return null;
    }
    if (data < root.data) {
        root.left = delete(root.left, data);
    } else if (data > root.data) {
        root.right = delete(root.right, data);
    } else {
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        Node temp = findMin(root.right);
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
    }
    return root;
}


Visualization

          50                           50
         /  \                         /  \
       30    70          =>         30   75
      /  \  /  \                   / \    \
     20  40 60  80                20 40   80
          \                          \
          45                         45



Searching: Searching for a node in a binary tree involves traversing the tree until the node is found or until the end of the tree is reached.

public boolean search(Node root, int data) {
    if (root == null) {
        return false;
    }
    if (root.data == data) {
        return true;
    } else if (data < root.data) {
        return search(root.left, data);
    } else {
        return search(root.right, data);
    }
}

Visualization

          50                            50
         /  \                          /  \
       30    70          =>          30   70
      /  \  /  \                    / \  / \
     20  40




						                                                          **Binary Search Tree**
            
            

BST is a binary tree where each node has a value that is greater than or equal to all the values in its left subtree and less than or equal to all the values in its right subtree.

 BST makes searching, insertion, and deletion operations efficient.

BST has the following properties:

Every node in a BST has a unique key (value).
The left subtree of a node contains only nodes with values less than the node's value.
The right subtree of a node contains only nodes with values greater than the node's value.
Both the left and right subtrees must also be binary search trees.

Note:
BST allows for efficient search, insertion, and deletion of nodes with O(log n) time complexity on average. However, the time complexity can become O(n) in the worst case if the tree is unbalanced, i.e., if one subtree is significantly deeper than the other. 


Insertion of a node in a BST:

Insertion of a node in a BST involves traversing the tree starting from the root node and comparing the key of the new node with the key of the current node. 

If the new node's key is less than the current node's key, we move to the left subtree, and if it's greater, we move to the right subtree. 

We repeat this process until we reach a leaf node, where we can insert the new node.

Deletion of a node in a BST:
 can be more complicated, as it depends on the number of child nodes of the node to be deleted. There are three cases:
The node to be deleted has no children: In this case, we simply remove the node from the tree.
The node to be deleted has one child: In this case, we replace the node with its child.
The node to be deleted has two children: In this case, we replace the node with the smallest node in its right subtree or the largest node in its left subtree.
Searching for a node in a BST:

 involves traversing the tree starting from the root node and comparing the key of the current node with the key we are searching for.

 If the current node's key is less than the key we are searching for, we move to the right subtree, and if it's greater, we move to the left subtree. We repeat this process until we find the node or reach a leaf node.

NOTE: inorder traversal is often used to display the nodes in sorted order. while preorder and postorder traversals don't have any specific ordering so we Don’t use them.

void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }

Basic Operations in Binary Tree:

Insertion: To insert a new node into a BST, we compare the value of the new  node with the root node. if the new nodes value is less than the root nodes value we move to the left subtree otherwise we move to the right subtree. We repeat this process until we find an empty spot where we can reserve the new node.

public void insert(int key) {
    root = insertNode(root, key);
}

private Node insertNode(Node root, int key) {
    if (root == null) {
        root = new Node(key);
        return root;
    }
    if (key < root.data)
        root.left = insertNode(root.left, key);
    else if (key > root.data)
        root.right = insertNode(root.right, key);
    return root;
}



visualization
    50                              50
   /  \                            /  \
 30    70    Insert 40           30   70
       \                          /    / \
       40                       20   40  80


Search: To search for a node in a Binary Search Tree, we compare the value we're searching for with the root node's value. If the value is less than the root node's value, we move to the left subtree; otherwise, we move to the right subtree. We repeat this process until we find the node or reach a null node.


public Node search(Node root, int key) {
    if (root == null || root.data == key)
        return root;
    if (key < root.data)
        return search(root.left, key);
    return search(root.right, key);
}




Visualization

    50                                 
   /  \                               
 30    70    Search for 40           
       \                              
       40                            

Result: Node with value 40 found.



Deletion: To delete a node from a Binary Search Tree, we first search for the node we want to delete. If the node has no children, we simply remove it. If the node has one child, we replace it with its child. If the node has two children, we find the node's successor (the node with the smallest value in the right subtree), replace the node's value with the successor's value, and delete the successor.

public void delete(int key) {
    root = deleteNode(root, key);
}

private Node deleteNode(Node root, int key) {
    if (root == null)
        return root;
    if (key < root.data)
        root.left = deleteNode(root.left, key);
    else if (key > root.data)
        root.right = deleteNode(root.right, key);
    else {
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;
        root.data = minValue(root.right);
        root.right = deleteNode(root.right, root.data);
    }
    return root;
}

private int minValue(Node root) {
    int minv = root.data;
    while (root.left != null) {
        minv = root.left.data;
        root = root.left;
    }
    return minv;
}



Visualization

    50                                 
   /  \                               
 30    70    Delete 50           
      /  \                             
    60   80                           

Result:
    60
   /  \                              
 30  






very basic 20 problems in BST:
Write a program to insert a node in a binary search tree.
Write a program to delete a node from a binary search tree.
Write a program to search for a key in a binary search tree.
Write a program to find the minimum element in a binary search tree.
Write a program to find the maximum element in a binary search tree.
Write a program to find the successor of a node in a binary search tree.
Write a program to find the predecessor of a node in a binary search tree.
Write a program to find the kth smallest element in a binary search tree.
Write a program to find the kth largest element in a binary search tree.
Write a program to check if a given binary tree is a binary search tree or not.
Write a program to find the height of a binary search tree.
Write a program to find the level order traversal of a binary search tree.
Write a program to find the inorder traversal of a binary search tree.
Write a program to find the preorder traversal of a binary search tree.
Write a program to find the postorder traversal of a binary search tree.
Write a program to check if two binary search trees are equal or not.
Write a program to merge two binary search trees into one.
Write a program to convert a binary search tree into a doubly linked list.
Write a program to find the LCA (Lowest Common Ancestor) of two nodes in a binary search tree.
Write a program to delete all nodes in a binary search tree.






very basic 20 problems in BT:
Find the height of a binary tree
Find the number of nodes in a binary tree
Find the number of leaf nodes in a binary tree
Find the number of non-leaf nodes in a binary tree
Find the number of full nodes in a binary tree
Find the number of half nodes in a binary tree
Find the level of a node in a binary tree
Print the nodes of a binary tree in level order
Print the nodes of a binary tree in spiral order
Find the sum of all nodes in a binary tree
Find the maximum element in a binary tree
Find the minimum element in a binary tree
Check if a binary tree is balanced
Check if a binary tree is symmetric
Check if a binary tree is a binary search tree
Convert a binary tree to its mirror image
Check if a binary tree is a subtree of another binary tree
Find the diameter of a binary tree
Find the lowest common ancestor of two nodes in a binary tree
Print all paths from root to leaf nodes in a binary tree
