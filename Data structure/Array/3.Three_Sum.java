Question: https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
Example 1:

Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

*/
/********************************************************************* Approach *************************************************************************************/
/*

Approach 1: TC = O(n3) & SC = O(1)
- use three for loop i=0, j=i+1, k=j+1; till n;
- calculate the sum and is sum of 2 equal to 3rd element increase the count



Approach 2: TC = O(n2) & SC = O(n)

- creat map put all the values of array in the map.
- iterate and check wheater the sum of 2 elemts of the array equal to the element present in the map.
- if contains increase the count.



Approach 3:
- 
- 


*/

/********************************************************************* Code *************************************************************************************/


Approach 1: TC = O(n3) & SC = O(1)

  public static int countTriplets(int arr[], int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i] + arr[j] == arr[k] || arr[j] + arr[k] == arr[i] || arr[k] + arr[i] == arr[j]) {
                    count++;
                }
            }
        }
    }
    return count;
}





Approach 2:  TC = O(n2) & SC = O(n)

class Solution 
{
    int countTriplet(int arr[], int n) 
    {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        //Putting all the value of array with index,
        for(int i=0; i<n; i++)
        {
            map.put(arr[i], i);
        }
        //Iterating and checking if 
            for(int i =0; i<n-1; i++)
            {
                for(int j=i+1; j<n; j++)
                {
                     int sum = arr[i] + arr[j];
                     if(map.containsKey(sum) && map.get(sum) !=i && map.get(sum) != j)
                     {
                         count++;
                     }
               }  
            } 
        return count;    
    }}


  
.......................................................................................................................................................................
  
  
Dry Run of Approch 2 using HashMap:


/*

Initialize count to 0
Create an empty map
Add elements to the map: {4: 0, 2: 1, 1: 2, 5: 3, 3: 4}
Iterate over all pairs of elements:
i = 0, j = 1, sum = 4 + 2 = 6, map contains 6 with index 3, increment count to 1
i = 0, j = 2, sum = 4 + 1 = 5, map contains 5 with index 3, increment count to 2
i = 0, j = 3, sum = 4 + 5 = 9, map does not contain 9
i = 0, j = 4, sum = 4 + 3 = 7, map does not contain 7
i = 1, j = 2, sum = 2 + 1 = 3, map does not contain 3
i = 1, j = 3, sum = 2 + 5 = 7, map does not contain 7
i = 1, j = 4, sum = 2 + 3 = 5, map contains 5 with index 3, increment count to 3
i = 2, j = 3, sum = 1 + 5 = 6, map contains 6 with index 3, increment count to 4
i = 2, j = 4, sum = 1 + 3 = 4, map contains 4 with index 0, increment count to 5
i = 3, j = 4, sum = 5 + 3 = 8, map does not contain 8
Return count = 5

*/

.......................................................................................................................................................................

  
Take Away:

/*
  
  
  
*/

.......................................................................................................................................................................

Real World Use:
/*
 
 
 
*/

.......................................................................................................................................................................
