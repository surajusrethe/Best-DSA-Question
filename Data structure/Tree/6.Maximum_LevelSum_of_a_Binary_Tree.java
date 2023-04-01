/************************************************************************ QUESTION **************************************************************************************/


Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1:

Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation: 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.

Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2




/************************************************************************ APPROACH **************************************************************************************/




//level order traversal





/************************************************************************ CODE **************************************************************************************/



class Solution 
{
    public int maxLevelSum(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int currLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        while (!q.isEmpty()) 
        {
            int count = q.size();
            currSum = 0;
            for (int i = 0; i < count; i++) 
            {
                TreeNode curr = q.poll();
                currSum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            currLevel++;
            level = maxSum >= currSum ? level : currLevel;
            maxSum = Math.max(maxSum, currSum);
        }
        return level;
    }
}




/************************************************************************ DRY RUN **************************************************************************************/

/*
 here's a short dry run with visualization:

Given binary tree:

         1
       /   \
      7     0
     / \
    7  -8
-Initially, the root node with value 1 is added to the queue.

q = [1]
level = 0
currLevel = 0
maxSum = Integer.MIN_VALUE
currSum = 0

-The while loop runs and processes the root node.

count = 1
currSum = 1

-The left and right children of the root node (7 and 0) are added to the queue.

q = [7, 0]

-The while loop continues and processes the two nodes in the queue.

count = 2
currSum = 7

-The left and right children of the first node (7) are not added to the queue since they are null. The left and right children of the second node (7 and -8) are added to the queue.

q = [0, 7, -8]

-The while loop continues and processes the three nodes in the queue.

count = 3
currSum = -1

-The left and right children of the first node (0) are added to the queue, but they are both null. The left and right children of the second node (null and null) are not added to the queue since they are null. The left and right children of the third node (null and null) are not added to the queue since they are null.

q = [7, -8]

-The while loop continues and processes the two nodes in the queue.

count = 2
currSum = -1

-The left and right children of the first node (null and null) are not added to the queue since they are null. The left and right children of the second node (null and null) are not added to the queue since they are null.

q = []

-The while loop ends since the queue is empty. The maximum sum is 7, which occurs at level 2. Therefore, the function returns 2.

*/


