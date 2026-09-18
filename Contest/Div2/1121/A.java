import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = -1;
            String ans = "YES";
            for(int i =1 ;i<=n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num!=i && ans.equals("YES")){
                    if(pre==-1){
                        pre = num;
                    }else if(pre < num){
                        ans = "NO";
                    }else{
                        pre = num;
                    }
                }
            }           
            System.out.println(ans);
        }
    }
}

/* 
Problem Statement

A. Rumb Needs a Hand

time limit per test1 second
memory limit per test256 megabytes

Mr. Rumb visits a prosthetist because his arms have gone numb. The prosthetist can assemble replacements, but their numbered components are out of order. Apparently, even getting a helping hand requires some assembly.

Formally, the labels on the components form a permutation∗
 p
 of length n
. Mr. Rumb can program a machine to perform the following operation exactly once:

choose an integer m
 (1≤m≤n
) and indices i1<i2<…<im
;
reverse the elements of p
 at the chosen indices. More precisely, for every j
 from 1
 to m
, the element at index ij
 moves to index im−j+1
. All other elements remain unchanged.
The chosen indices do not have to be consecutive. For example, suppose p=[1,6,3,4,5,2]
. If you choose indices 2
, 4
, and 6
, the elements shown in red are reversed, and p
 becomes [1,2,3,4,5,6]
.

Determine whether Mr. Rumb can sort p
 in increasing order.

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
 (1≤t≤500
). The description of the test cases follows.

The first line of each test case contains a single integer n
 (1≤n≤100
).

The second line contains a permutation p1,p2,…,pn
 of the integers from 1
 to n
.

Output
For each test case, output YES if it is possible to sort p
 in increasing order after performing exactly one operation. Otherwise, output NO.

You can output the answer in any case (upper or lower). For example, the strings yEs, yes, Yes, and YES will be recognized as positive responses.

Example
InputCopy
5
1
1
4
4 2 3 1
4
3 4 1 2
5
2 1 3 5 4
6
1 6 3 4 5 2
OutputCopy
YES
YES
NO
NO
YES
Note
In the first test case, choose the only index. Reversing a single element does not change the permutation, so the requirement to perform exactly one operation is satisfied.

In the second test case, choose indices 1
 and 4
. The resulting permutation is [1,2,3,4]
.

In the fifth test case, choose indices 2
, 4
, and 6
. Notice that the chosen indices are not consecutive.


*/