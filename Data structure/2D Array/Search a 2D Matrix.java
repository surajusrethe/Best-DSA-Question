/*********************************************************************** Question ************************************************************************************/

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
*/

/*********************************************************************** Approach & code ************************************************************************************/


class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
            
            for(int i=0; i<mat.length; i++)
            {
                    if(binarySearch(mat,i,target)==true)
                            return true;
            }
            
            return false;              
    }
    
....................................................................................................................................................................

        static boolean binarySearch(int[][] mat, int i, int target)
        {
                int n = mat.length;
                int m = mat[0].length;
                
                int s=0; int e=m-1;
                
                while(s<=e)
                {
                        int mid = s+(e-s)/2;
                        
                        if(mat[i][mid]>target)
                        {
                                e = mid-1;
                        }
                        if(mat[i][mid]<target)
                        {
                                s = mid+1;
                        }
                        if(mat[i][mid]==target)
                        {
                                return true;
                        }
                }
                return false;
        }
}

/*********************************************************************** Dry Run ************************************************************************************/

/*
mat = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 13

// First iteration
i = 0
s = 0
e = 3

mid = s + (e - s) / 2 = 1
mat[i][mid] = 3
Since mat[i][mid] < target, we continue to the next iteration

// Second iteration
i = 0
s = 2
e = 3

mid = s + (e - s) / 2 = 2
mat[i][mid] = 5
Since mat[i][mid] < target, we continue to the next iteration

// Third iteration
i = 0
s = 3
e = 3

mid = s + (e - s) / 2 = 3
Since s > e, we exit the loop and return false

// The function returns false and the search is complete
*/
