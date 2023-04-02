/****************************** Question ***************************/





/****************************** Code ***************************/

Approach 1:


class Solution 
{
    int getPairsCount(int[] arr, int n, int k) 
    {
        int pairsCount = 0;
        
       for(int i=0; i<n; i++)
       {
           int sum;
           
           for(int j=i+1; j<n; j++)
           {
               sum = arr[i] + arr[j];
               
               if(sum == k) pairsCount++;
           }
       }
       return pairsCount;
       
    }
}



Appraoch 2:




/****************************** Dry Run ***************************/


class Solution 
{
    int getPairsCount(int[] arr, int n, int k) 
    {
        // Create a hash table to store the frequency of each element in the array
        Map<Integer, Integer> freq = new HashMap<>();
    
        // Traverse the array and update the frequency of each element
        for (int i = 0; i < n; i++)
        {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
    
        // Initialize the count of pairs to 0
        int count = 0;
    
        // Traverse the array again and for each element, check if there exists a complementary element in the hash table
        for (int i = 0; i < n; i++) 
        {
            int complement = k - arr[i];
            if (freq.containsKey(complement))
            {
                count += freq.get(complement);
            }
    
            // If the current element is equal to the complementary element, then we need to decrement the count to avoid counting the same pair twice
            if (complement == arr[i]) 
            {
                count--;
            }
        }
    
        // Return the count of pairs
        return count / 2; // As we are counting every pair twice

    }
}







