/********************************************************** Question ************************************************************************/
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1

*/
  
/********************************************************** Approach ************************************************************************/
/*
  
        1. intialize 2 pointer i=0, j=n-1
        2.maxArea = 0,
        3.iterate over the array and check the maxarea,
        3.1 area = Math.min(height[i], height[j]) * (j-i);
        3.2 maxArea = Math.max(maxarea, area);
        4. check if (height[i]<height[j]) so i++ else j--;
*/  
  
/********************************************************** Code ************************************************************************/

  public int maxArea(int[] height) {
    // initialize two pointers, one at the beginning and one at the end of the array
    int i = 0;
    int j = height.length - 1;
    
    // initialize a variable to keep track of the maximum area
    int maxArea = 0;
    
    // loop until the pointers meet
    while (i < j) {
        // calculate the area of the container formed by the two lines
        int area = Math.min(height[i], height[j]) * (j - i);
        
        // update the maximum area if the current area is greater
        maxArea = Math.max(maxArea, area);
        
        // move the pointer that corresponds to the shorter line
        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }
    
    // return the maximum area
    return maxArea;
}

  
/********************************************************** Dry run ************************************************************************/
  
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
         |        |           |
         |        |           |
         |        |           |
         |        |  |        |
         |        |  |        |
         |  |     |  |        |
         |  |     |  |  |     |
         |  |     |  |  |  |  |
         --------------------
           i               j

i = 0, j = 8
maxArea = min(height[i], height[j]) * (j - i) = 1 * 8 = 8

i = 1, j = 8
maxArea = min(height[i], height[j]) * (j - i) = 7 * 7 = 49

i = 1, j = 7
maxArea = min(height[i], height[j]) * (j - i) = 3 * 6 = 18

i = 1, j = 6
maxArea = min(height[i], height[j]) * (j - i) = 4 * 5 = 20

i = 1, j = 5
maxArea = min(height[i], height[j]) * (j - i) = 4 * 4 = 16

i = 1, j = 4
maxArea = min(height[i], height[j]) * (j - i) = 5 * 3 = 15

i = 1, j = 3
maxArea = min(height[i], height[j]) * (j - i) = 2 * 2 = 4

i = 2, j = 3
maxArea = min(height[i], height[j]) * (j - i) = 2 * 1 = 2

i = 2, j = 4
maxArea = min(height[i], height[j]) * (j - i) = 5 * 2 = 10

i = 2, j = 5
maxArea = min(height[i], height[j]) * (j - i) = 4 * 3 = 12

i = 2, j = 6
maxArea = min(height[i], height[j]) * (j - i) = 6 * 4 = 24

i = 2, j = 7
maxArea = min(height[i], height[j]) * (j - i) = 3 * 5 = 15

i = 2, j = 8
maxArea = min(height[i], height[j]) * (j - i) = 6 * 6 = 36

i = 2, j = 9 (out of bounds)
maxArea = 49 (maximum value obtained)


