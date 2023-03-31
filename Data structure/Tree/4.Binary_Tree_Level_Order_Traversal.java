/*************************************************************************QUESTION******************************************************************************************/

/*

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

*/

/*************************************************************************APPROACH******************************************************************************************/
/*

- create and Q off linked list add the root to the queue.
- no I did on the queue until it get empty.
- remove the current element and print or add it to the list.
- add children of the removal node.


*/


/**************************************************************************CODE******************************************************************************************/

TC = O(n) && SC = O(n);

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Create a list to hold the answer
        List<List<Integer>> ans = new ArrayList<>();

        // If the root is null, return an empty answer list
        if (root == null) return ans;

        // Create a deque to hold the nodes for the level-order traversal
        Deque<TreeNode> q = new ArrayDeque<>();

        // Add the root node to the deque to start the traversal
        q.add(root);

        // Loop until the deque is empty (i.e., we've processed all the nodes)
        while (!q.isEmpty()) {
            // Get the number of nodes in the deque (i.e., the number of nodes in the current level)
            int qlen = q.size();

            // Create a list to hold the nodes in the current level
            List<Integer> level = new ArrayList<>();

            // Loop over the nodes in the current level
            for (int i = 0; i < qlen; i++) {
                // Get the next node from the deque
                TreeNode curr = q.poll();

                // Add the node's value to the current level
                level.add(curr.val);

                // Add the node's children to the deque (if they exist)
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            // Add the current level to the answer list
            ans.add(level);
        }

        // Return the answer list
        return ans;
    }
}



/*************************************************************************DRY RUN******************************************************************************************/

/*

     1
   /   \
  2     3
 / \   / \
4   5 6   7


Create an empty ArrayList called ans.
Check that root is not null.
Create a new ArrayDeque called q.
Add root to q.
While q is not empty, do the following:
a. Get the current size of q and store it in qlen (the first time this is 1).
b. Create a new ArrayList called level.
c. Loop qlen times and do the following:
i. Remove the first element from q (which is 1) and store it in curr.
ii. Add curr.val to level, so level is now [1].
iii. Add curr's left child to q (which is 2).
iv. Add curr's right child to q (which is 3).
d. Add level to ans, so ans is now [[1]].
e. Get the current size of q and store it in qlen (the second time this is 2, since q now contains 2 and 3).
f. Create a new ArrayList called level.
g. Loop qlen times and do the following:
i. Remove the first element from q (which is 2) and store it in curr.
ii. Add curr.val to level, so level is now [2].
iii. Add curr's left child to q (which is 4).
iv. Add curr's right child to q (which is 5).
h. Add level to ans, so ans is now [[1], [2]].
i. Get the current size of q and store it in qlen (the third time this is 2, since q now contains 3, 4, and 5).
j. Create a new ArrayList called level.
k. Loop qlen times and do the following:
i. Remove the first element from q (which is 3) and store it in curr.
ii. Add curr.val to level, so level is now [3].
iii. Add curr's left child to q (which is 6).
iv. Add curr's right child to q (which is 7).
l. Add level to ans, so ans is now [[1], [2], [3]].
m. Get the current size of q and store it in qlen (the fourth time this is 2, since q now contains 4, 5, 6, and 7).
n. Create a new ArrayList called level.
o. Loop qlen times and do the following:
i. Remove the first element from q (which is 4) and store it in curr.
ii. Add curr.val to level, so level is now [4].
p. Add

*/

/**********************************************************************REAL WORLD USE******************************************************************************************/

/*

Data processing: In data processing tasks, a tree may be used to represent hierarchical data. Level order traversal can be used to process this data level by level.

Web crawlers: A web crawler is a program that visits websites and extracts data from them. Level order traversal can be used to crawl through a website in a systematic and organized manner.

Social network analysis: Social networks are often represented as graphs or trees. Level order traversal can be used to explore and analyze social networks.

Computer network routing: In computer networks, level order traversal can be used to determine the shortest path between two nodes.

*/

/*************************************************************************TAKE AWAYE******************************************************************************************/


The key takeaway from this problem is the use of a queue data structure to perform a level order traversal of a binary tree. 
 This concept is used in many other problems involving tree traversals or graph traversals, where the order in which nodes are visited is important.
  
  
