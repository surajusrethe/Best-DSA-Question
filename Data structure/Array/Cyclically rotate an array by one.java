/**************************************************** Quesstion ******************************************************/
/*
Cyclically rotate an array by one

Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*/

/**************************************************** Approach ******************************************************/

/*
- store the last element of the array in a temporary variable.
- Shift all the elements of the array one position to the right starting from the second last element.
- Place the temporary variable at the first position of the array.
*/

/**************************************************** Code ******************************************************/

Approach 1: TC = O(n)  && SC = O(1);
class Compute 
{
    
    public void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        
        for(int i=n-2; i>=0; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
}


/**************************************************** Dry Run ******************************************************/



Step 1: Store the last element of the array in a temporary variable.

arr = {1, 2, 3, 4, 5}
n = 5
temp = arr[n-1] = 5
  
Step 2: Shift all the elements of the array one position to the right starting from the second last element.


arr = {1, 2, 3, 4, 5}
for i = n-2 to 0 (step -1):
    arr[i+1] = arr[i]
i = 3, arr[4] = arr[3] = 4
i = 2, arr[3] = arr[2] = 3
i = 1, arr[2] = arr[1] = 2
i = 0, arr[1] = arr[0] = 1
The loop terminates.

arr = {1, 1, 2, 3, 4}
Step 3: Place the temporary variable at the first position of the array.


arr[0] = temp = 5

arr = {5, 1, 2, 3, 4}
Therefore, the output array is {5, 1, 2, 3, 4}.


Here's a visualization of the array rotation:


Before rotation:
+---+---+---+---+---+
| 1 | 2 | 3 | 4 | 5 |
+---+---+---+---+---+

Step 1:
temp = 5
+---+---+---+---+---+
| 1 | 2 | 3 | 4 | 5 |
+---+---+---+---+---+
                  ↑
                 temp

Step 2:
+---+---+---+---+---+
| 1 | 1 | 2 | 3 | 4 |
+---+---+---+---+---+
  ↑   ↑   ↑   ↑   ↑
  0   1   2   3   4

Step 3:
+---+---+---+---+---+
| 5 | 1 | 2 | 3 | 4 |
+---+---+---+---+---+
  ↑   ↑   ↑   ↑   ↑
  0   1   2   3   4

After rotation:
+---+---+---+---+---+
| 5 | 1 | 2 | 3 | 4 |
+---+---+---+---+---+
