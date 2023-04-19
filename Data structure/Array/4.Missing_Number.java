/************************************************************ Question *********************************************************************/
/*
Vaibhav likes to play with numbers and he has N numbers. One day he was placing the numbers on the playing board just to count that how many numbers he has. He was placing the numbers in increasing order i.e. from 1 to N. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he has to go somewhere urgently, so he asks you to find the missing number.
NOTE: Don't use Sorting


Example 1:

Input:                                                       
N = 4                                        
A[] = {1, 4, 3}
Output:
2     
Explanation:
Vaibhav placed 4 integers but he picked
up only 3 numbers. So missing number
will be 2 as it will become 1,2,3,4.

*/

/************************************************************ Approach *********************************************************************/

Approach 1: TC = O(n) && SC = O(1);

/*
- Calculate the expected sum of consecutive integers from 1 to N+1 and store it in the variable expectedSum.

- Calculate the actual sum of the integers in the input array A and store it in the variable actualSum.

- Subtract actualSum from expectedSum to get the missing number and return it.

*/

/************************************************************ Code *********************************************************************/


class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         
         // find expected sum;
         
         int expectedSum = 0, actualSum = 0;
         
         for(int i=1; i<=N; i++)
         {
            expectedSum += i;
         }
         
         for(int i=0; i<N; i++)
         {
            actualSum += A[i];
         }
         
         
         int missingNum = expectedSum - actualSum;
         
         return missingNum;
    }
}

/************************************************************ Dry run *********************************************************************/
/*
N = 4
A[] = {1, 4, 3}


- expectedSum = 0, actualSum = 0

- Loop through the integers from 1 to N and add each number to expectedSum.

for(int i=1; i<=N; i++)
{
   expectedSum += i;
}

- expectedSum = 1 + 2 + 3 + 4
  expectedSum = 10

- Loop through the elements of the integer array A and add each element to actualSum.


for(int i=0; i<N; i++)
{
   actualSum += A[i];
}

- actualSum = 1 + 4 + 3
  actualSum = 8
  
Subtract actualSum from expectedSum and store the result in the integer variable missingNum.

- missingNum = expectedSum - actualSum;
  missingNum = 10 - 8
  missingNum = Return missingNum.

- return missingNum;

- The output is 2 as expected.
  
  */
/************************************************************ Take away, Pattern *********************************************************************/




/************************************************************ Real World Use *********************************************************************/





