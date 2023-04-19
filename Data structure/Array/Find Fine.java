/********************************************************* Question **************************************************************/


Given an array of penalties fine[], an array of car numbers car[], and also the date. The task is to find the total fine which will be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.

 

Example 1:

Input:
N = 4, date = 12
car[] = {2375, 7682, 2325, 2352}
fine[] = {250, 500, 350, 200}
Output:
600
Explantion:
The date is 12 (even), so we collect the
fine from odd numbered cars. The odd
numbered cars and the fines associated
with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600
 
 
 /********************************************************* Approach **************************************************************/

- The function takes in 4 parameters: n (number of cars), date (current date), car (array of car numbers), and fine (array of corresponding fines).
- If the current date is even, the function checks for cars with odd numbers and adds their fines to the total fine. If the current date is odd, the function checks for cars with even numbers and adds their fines to the total fine.
- The function returns the total fine.

/********************************************************* Code **************************************************************/


// Define a function that takes in the number of cars, current date, an array of car numbers, and an array of corresponding fines
public long totalFine(long n, long date, long car[], long fine[]) {
    
    // Initialize a variable to hold the total fine
    long total_Fine = 0;
    
    // Check if the current date is even
    if (date % 2 == 0) { // date & 1 == 0 
        
        // Loop through the array of car numbers and fines
        for (int i = 0; i < n; i++) {
            
            // Check if the car number is odd
            if (car[i] % 2 != 0) {
                
                // Add the corresponding fine to the total fine
                total_Fine += fine[i];
            }
        }
    }
    
    // If the current date is odd
    else {
        
        // Loop through the array of car numbers and fines
        for (int i = 0; i < n; i++) {
            
            // Check if the car number is even
            if (car[i] % 2 == 0) {
                
                // Add the corresponding fine to the total fine
                total_Fine += fine[i];
            }
        }
    }
    
    // Return the total fine
    return total_Fine;
}


/********************************************************* Dry Run **************************************************************/

n = 5
date = 10
car = [2, 5, 7, 10, 11]
fine = [200, 100, 150, 300, 75]


The function totalFine will first initialize a variable total_Fine to 0. Since the date is even, the function will execute the following loop:


for (int i = 0; i < n; i++) {
    if (car[i] % 2 != 0) {
        total_Fine += fine[i];
    }
}
Let's visualize the loop with a table:

| i  | car[i] | fine[i] | car[i] % 2 != 0 | total_Fine |
|----|--------|---------|----------------|------------|
| 0  | 2      | 200     | false          | 0          |
| 1  | 5      | 100     | true           | 100        |
| 2  | 7      | 150     | true           | 250        |
| 3  | 10     | 300     | false          | 250        |
| 4  | 11     | 75      | true           | 325        |


As we can see, the function adds the fines for cars 5, 7, and 11 (which have odd numbers) to the total_Fine variable. 
The total fine is therefore 325, which is returned by the function.


