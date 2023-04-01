/********************************************************************* QUESTION *********************************************************************************/


Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

 
Example 1:

Input: root = [1,3,2,5,3,null,9]
Output: [1,3,9]


Example 2:

Input: root = [1,2,3]
Output: [1,3]


/********************************************************************** APPROACH *********************************************************************************/

/*

Level order traversal BFS

*/

/************************************************************************ CODE *********************************************************************************/



class Solution 
{
    public List<Integer> largestValues(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();  // create a queue to perform level-order traversal
        List<Integer> values = new ArrayList<Integer>();  // create a list to store the largest value in each row
        
        if(root != null) q.add(root);  // add the root node to the queue if it is not null
        
        while(!q.isEmpty())  // perform level-order traversal until the queue is empty
        {
            int max = Integer.MIN_VALUE, n = q.size();  // initialize max value and count of nodes at the current level

            for(int i = 0; i < n; i++)  // process each node at the current level
            {
                TreeNode node = q.poll();  // dequeue the first node in the queue
                max = Math.max(max, node.val);  // update the max value

                // enqueue the left and right children of the current node if they are not null
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            values.add(max);  // add the max value of the current level to the list
        }
        
        return values;  // return the list of largest values in each row
    }
}





/****************************************************************** DRY RUN *********************************************************************************/



        1
       / \
      3   2
     / \   \
    5   3   9


/*

largestValues(1):
    q = [1]
    values = []
    max = -2147483648, n = 1
    node = 1, max = 1
    q = [3, 2]
    max = -2147483648, n = 2
    node = 3, max = 3
    node = 2, max = 2
    q = [5, 3, 9]
    values = [1, 3, 9]
    max = -2147483648, n = 3
    node = 5, max = 5
    node = 3, max = 3
    node = 9, max = 9
    values = [1, 3, 9]


Therefore, the function returns the list [1, 3, 9], which contains the largest value in each row of the tree.

*/



