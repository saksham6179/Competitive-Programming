import java.io.*;
import java.util.*;

public class B{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            if(k <n || k>=(2*n)){
                System.out.println(-1);
                continue;
            }
            int diagMax = (2*n)-k;
            int diagValue = 1, normalValue = diagMax +1;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(i==j){
                        if(diagValue<=diagMax){
                            System.out.print(diagValue + " ");
                            diagValue++;
                            continue;
                        }
                    }
                    System.out.print(normalValue  + " ");
                    normalValue++;
                }
                System.out.println();
            }
        }
    }
}

/* 
Problem Satement 

B. Min Matrices

time limit per test1.5 seconds
memory limit per test256 megabytes

Farmer John heard from Elsie that Bessie's favorite number is k
, so he wants to surprise her with a handcrafted present.

For a 2D matrix B
, let f(B)
 denote the set of the minimum element of each row and each column of B
.

Farmer John wants you to show him an n×n
 matrix A
 consisting of each number from 1
 to n2
 exactly once such that |f(A)|=k
, or state that it is impossible.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤1000
). The description of the test cases follows.

The first line of each test case contains two integers n
 and k
 (1≤n≤1000,0≤k≤2n
) — the size of the matrix and the goal value of |f(A)|
.

It is guaranteed that the sum of n
 over all test cases does not exceed 1000
.

Output
If there is no such matrix, print −1
. Otherwise, print n
 lines with n
 integers each — an n×n
 matrix that satisfies the conditions of the problem.

If there are multiple solutions, you may output any of them.

Example
InputCopy
5
3 0
3 5
5 5
4 3
1 1
OutputCopy
-1
8 5 9
6 3 7
2 1 4
16 14 17 15 3
25 22 5 23 24
8 1 9 6 7
4 18 21 19 20
12 10 13 2 11
-1
1 
Note
In the first test case, we can see that it is impossible to construct such a 3×3
 matrix where f(A)
 is empty.

In the second test case, we can see the minimums of the rows are [5,3,1]
 respectively, and the minimums of the columns are [2,1,4]
 respectively. Therefore, f(A)={1,2,3,4,5}
, so |f(A)|=5
 as desired.
 */