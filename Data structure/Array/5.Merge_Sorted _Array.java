/********************************************************************* Code **************************************************************************************/


class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
            int i = n-1, j = 0;
    while(i >= 0 && j < m) 
    {
        if(arr1[i] > arr2[j]) 
        {
            long temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        } 
        else break;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    }
}


/********************************************************************* Dry Run **************************************************************************************/

/*
Initially, the values of arr1 and arr2 are:

arr1[] = [10, 12]
arr2[] = [5, 18, 20]

The two pointers are initialized to point to the last element of arr1 and the first element of arr2 respectively:

i = 1
j = 0
In the first iteration of the while loop, the condition i >= 0 && j < m is satisfied. Also, arr1[i] > arr2[j] is true, so the elements at these indices are swapped:

temp = arr1[i] = 12
arr1[i] = arr2[j] = 5
arr2[j] = temp = 12
  
Now the arrays become:

arr1[] = [10, 5]
arr2[] = [12, 18, 20]

The pointers are updated:

i = 0
j = 1
In the second iteration of the while loop, i >= 0 && j < m is true, and arr1[i] > arr2[j] is false, so the loop breaks.

Finally, Arrays.sort() is called on both arrays to sort them:

arr1[] = [5, 10]
arr2[] = [12, 18, 20]
So the final output is:

arr1[] = [5, 10]
arr2[] = [12, 18, 20]
