Notes:

//A 2D array in Java is an array of arrays where each element is an array. It represents a table-like structure with rows & columns.
//The elements of a 2D array are accessed using two indices: the row index and the column index.
//The first index represents the row number, and the second index represents the column number.
//2D arrays can be created and initialized using curly braces {} or with nested loops.
//The elements of a 2D array can be of any data type, including primitive types, object types, or even arrays.


The time complexity of different operations on an array:

// 1. Accessing an element: O(1).
// 2. Updating an element: O(1).
// 3. Traversing the entire array: O(n^2).
// 4. Finding the maximum or minimum element: O(n^2)
// 5. Transposing the array: O(n^2).
// 6.Searching for a specific element: O(n^2) in the worst case (if the element is not found).

.........................................................................................................................................................................
question link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
/*
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
 
*/
...........................................................................................................................................................................

Approach 1: TC = O(r*c) & SC = O(r*c) 
/*
- Use four variables that represent the boundaries of the matrix:
- top, bottom, left, and right.
- We start by initializing these variables to their respective positions: top=0, bottom=r-1, left=0, and right=c-1.
- Then, we perform the following steps until we traverse all elements of the matrix:

  Traverse the top row from left to right, top++.
  Traverse the right column from top to bottom, right--.
  Traverse the bottom row from right to left, bottom--.
  Traverse the left column from bottom to top, left++.

- We repeat these steps until top<=bottom and left<=right, which means we have covered all elements of the matrix.
- During each step, we add the elements to an ArrayList in the order we traverse them. Finally, we return the ArrayList as the output.
    
-TC = O(r*c) & SC = O(r*c)  because we need to visit each element once, and we need to store all elements in the ArrayList.
*/
    
.....................................................................................................................................................................    
    
Code:


class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) 
    {
      // create an empty ArrayList to store the result  
      ArrayList<Integer> result = new ArrayList<>();
      
      // initialize the boundaries of the matrix
        int top = 0, bottom = r-1, left = 0, right = c-1; 
      
      // repeat until we cover all elements of the matrix
        while (top <= bottom && left <= right) 
        {
            // traverse top row from left to right
            for (int i = left; i <= right; i++) 
            {
              // add the element to the result ArrayList
                result.add(matrix[top][i]); 
            }
            top++; // move to the next row
          
          

            // traverse right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]); // add the element to the result ArrayList
            }
            right--; // move to the previous column
          

          
            // traverse bottom row from right to left
            if (top <= bottom) 
            { // check if there is a bottom row left to traverse
                for (int i = right; i >= left; i--) 
                {
                    result.add(matrix[bottom][i]); // add the element to the result ArrayList
                }
                bottom--; // move to the previous row
            }
          
          

            // traverse left column from bottom to top
            if (left <= right) 
            { // check if there is a left column left to traverse
                for (int i = bottom; i >= top; i--) 
                {
                    result.add(matrix[i][left]); // add the element to the result ArrayList
                }
                left++; // move to the next column
            }
        }
      
        return result; // return the final result ArrayList
    }
}

.....................................................................................................................................................................
  
Dry run of Code:

/*
here's a dry run of the code for the given input:

We have a 4x4 matrix with the following values:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

We initialize the boundaries of the matrix:
top = 0
bottom = 3
left = 0
right = 3

We enter a loop to traverse the matrix:

We traverse the top row from left to right (1, 2, 3, 4) and add each element to the result ArrayList.
We move to the next row by incrementing top to 1.
We traverse the right column from top to bottom (8, 12, 16) and add each element to the result ArrayList.
We move to the previous column by decrementing right to 2.
We check if there is a bottom row left to traverse (since top <= bottom):
We traverse the bottom row from right to left (15, 14, 13) and add each element to the result ArrayList.
We move to the previous row by decrementing bottom to 2.
We check if there is a left column left to traverse (since left <= right):
We traverse the left column from bottom to top (9, 5) and add each element to the result ArrayList.
We move to the next column by incrementing left to 1.
We have now covered all the elements in the matrix and have stored them in the result ArrayList, which is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5].
*/
  
......................................................................................................................................................................


Take Away from this problem:


/*The main takeaway from this code is the technique of traversing a matrix in a spiral order. 
This approach can be used to solve many problems that involve iterating over a 2D array in a spiral fashion, 
such as finding the maximum sum subarray in a matrix or printing a matrix in a spiral order.*/


.....................................................................................................................................................................


Real World Use:


/*
It has real-world applications in various fields such as image processing, computer vision, and data analysis.

For example, in image processing, spirally traversing a matrix can help identify features in an image such as edges, contours, and other patterns.

In data analysis, it can be used to traverse matrices of data to extract important information for further analysis.
*/


