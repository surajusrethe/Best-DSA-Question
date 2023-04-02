class Solution {
    int MissingNumber(int array[], int n) {
        
        int actualSum = 0;
        
       int expectedSum = (n * (n + 1)) / 2;

        
        for(int number : array)
        {
            actualSum += number;
        }
        
        int missingNumber = expectedSum - actualSum;
        
        return missingNumber;
    }
}
