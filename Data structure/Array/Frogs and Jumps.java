/******************************************************************** Question *********************************************************************************/

/*N frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. The pond has some leaves arranged in a straight line. Each frog has the strength to jump exactly K leaves. For example, a  frog having strength 2 will visit the leaves 2, 4, 6, ...  etc. while crossing the pond.

Given the strength of each frog and the number of leaves, your task is to find the number of leaves that not be visited by any of the frogs when all frogs have reached the other end of the pond. 

Example 1:

Input:
N = 3
leaves = 4
frogs[] = {3, 2, 4} 
Output: 1
Explanation:
Leaf 1 will not be visited by any frog.
Example 2:

Input: 
N = 3
leaves = 6
frogs[] = {1, 3, 5} 
Output: 0
Explanation: 
First frog will visit all the leaves so no 
leaf is left unvisited.
Your Task:
Complete the function unvisitedLeaves() which takes the integers N, leaves and the array frogs as the input parameters, and returns the number of unvisited leaves.

Expected Time Complexity: O(N*log(leaves))
Expected Auxiliary Space: O(leaves)*/

/******************************************************************** Approach *********************************************************************************/

- The brute force approach for this problem is to simulate the movement of each frog and mark the leaves that they visit. 
- After all the frogs have reached the other end of the pond, 
- count the number of leaves that are not visited by any frog.


/******************************************************************** Code *********************************************************************************/

import java.util.Arrays;

public class FrogPond {
    public static int countUnvisitedLeaves(int N, int leaves, int[] frogs) {
        int unvisited = 0;
        // create a boolean array to mark the leaves visited by the frogs
        boolean[] visited = new boolean[leaves];
        // initialize all the elements of the array to false
        Arrays.fill(visited, false);
        // simulate the movement of each frog
        for(int i = 0; i < N; i++) {
            // start at the first leaf and jump to the next leaf that is a multiple of the frog's strength
            for(int j = frogs[i]-1; j < leaves; j += frogs[i]) {
                visited[j] = true;
            }
        }
        // count the number of leaves that are still unmarked
        for(int i = 0; i < leaves; i++) {
            if(!visited[i]) {
                unvisited++;
            }
        }
        return unvisited;
    }
    
    public static void main(String[] args) {
        int N = 3;
        int leaves = 6;
        int[] frogs = {1, 3, 5};
        int unvisited = countUnvisitedLeaves(N, leaves, frogs);
        System.out.println("Number of unvisited leaves: " + unvisited);
    }
}


/******************************************************************** Dry run *********************************************************************************/


     Initialization
[false, false, false, false]

Step 1:
[false, false, false, false]

Step 2:
Frog 0:
     j = frogs[0]-1 = 3-1 = 2
     [false, false, true, false]
Frog 0:
     j = 2 + frogs[0] = 2 + 3 = 5
     [false, false, true, false]

Step 3:
Frog 1:
     j = frogs[1]-1 = 2-1 = 1
     [false, true, false, false]
Frog 1:
     j = 1 + frogs[1] = 1 + 2 = 3
     [false, true, true, false]

Step 4:
Frog 2:
     j = frogs[2]-1 = 4-1 = 3
     [false, true, true, false]
Frog 2:
     j = 3 + frogs[2] = 3 + 4 = 7
     [false, true, true, false]

Step 5:
[false, true, true, false]
count = 1

  
  - Here, the chart shows the state of the visited array after each iteration of the loop. 
  - In each step, we process a single frog and mark the leaves that it visits in the visited array. 
  - Finally, we count the number of false elements in the visited array to get the number of leaves that are not visited by any frog.
  
  
  
