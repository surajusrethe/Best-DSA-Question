/************************************************************ Question **************************************************************************/

1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1

/************************************************************ Approach **************************************************************************/

- Ek loop chalao 1 se n tak
- Har baar ek inner loop chalao 0 se i tak, aur har baar check karo ki kya i+j ka remainder 2 hai, agar haan toh print karo 1, aur agar nahi toh print karo 0
- Har ek inner loop ke baad ek newline character print karo.

/************************************************************ Code **************************************************************************/

public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
        int start = i % 2 == 0 ? 0 : 1;  // Initialize start based on even/odd row
        for (int j = 1; j <= i; j++) {
            System.out.print(start + " ");
            start = 1 - start;  // Toggle start between 0 and 1
        }
        System.out.println();
    }
}


/************************************************************ Dry run **************************************************************************/
 
  
Input: n = 5

Iteration 1:
i = 1
start = 1
j = 1
Prints: 1

Iteration 2:
i = 2
start = 0
j = 1
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 2
Prints: 1 (start value is now 1)
start = 1 - 1 = 0 (toggle start value)
j = 3
Prints: 0 (start value is now 0)

Iteration 3:
i = 3
start = 1
j = 1
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 2
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 3
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 4
Prints: 0

Iteration 4:
i = 4
start = 0
j = 1
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 2
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 3
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 4
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 5
Prints: 0

Iteration 5:
i = 5
start = 1
j = 1
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 2
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 3
Prints: 1
start = 1 - 1 = 0 (toggle start value)
j = 4
Prints: 0
start = 1 - 0 = 1 (toggle start value)
j = 5
Prints: 1

Output:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
