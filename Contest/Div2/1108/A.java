import java.io.*;
import java.util.*;
import java.lang.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            System.out.print(n + " ");
            for(int i = 1;i<n;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/* Problem Statement
A. farmpiggie and Subset Sum
time limit per test1 second
memory limit per test256 megabytes

For a permutation∗
 p
 of even length, you can do the following process:

Initialize a counter c=0.
For each i
 from 1
 to n,
 either add i⋅pi
 to c
, subtract i⋅pi
 from c
, or do nothing.
Let the final value of the counter be cfinal.
Formally, for each i∈{1,…,n},
 consider the set Si={−i⋅pi,0,i⋅pi}
 and choose some xi∈Si.
 Set cfinal=∑ni=1xi.

You are given a single even integer n
. Find any permutation of length n
 so that regardless of the operations chosen, the final value cfinal
 will not be 1.

∗
A permutation of length n
 is an array consisting of n
 distinct integers from 1
 to n
 in arbitrary order. For example, [2,3,1,5,4]
 is a permutation, but [1,2,2]
 is not a permutation (2
 appears twice in the array), and [1,3,4]
 is also not a permutation (n=3
 but there is 4
 in the array).

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤25
). The description of the test cases follows.

The first and only line of each test case contains a single even integer n(2≤n≤50)
 — the length of the desired permutation.

Output
For each test case, output n
 integers p1,…,pn(1≤pi≤n)
 — a permutation satisfying the conditions.

If there are multiple solutions, print any of them.

Example
InputCopy
3
2
4
6
OutputCopy
2 1
2 3 4 1
5 4 6 2 1 3 
Note
In the first test case, the permutation given in the output is [2,1].
 The counter may be incremented in the following 9
 ways:

0−→−+2⋅12−→+02
0−→+02−→−+1⋅22
0−→−−2⋅1−2−→+0−2
0−→+02−→−−1⋅2−2
0−→−−2⋅1−2−→−+1⋅20
0−→−+2⋅12−→−−1⋅20
0−→−−2⋅1−2−→−−1⋅2−4
0−→−+2⋅12−→−+1⋅24.
0−→+00−→+00.
None of these are 1,
 so the permutation satisfies the given condition.
We can show that the permutation given in the second test case satisfies the condition. However, the permutation [1,2,3,4]
 would not satisfy the condition, since the sequence
0−→−+1⋅11−→+01−→+01−→+01
results in c=1
 at the end.

*/
