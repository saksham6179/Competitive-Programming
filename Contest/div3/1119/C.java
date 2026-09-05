import java.io.*;
import java.util.*;
import java.lang.*;

public class C{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            boolean first = false;
            int replaceIndex = -1;
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num==1){
                    arr[i] = 1;
                    if(!first){
                        first = true;
                    }else{
                        if(replaceIndex != -1){
                            arr[replaceIndex] = 0;
                            replaceIndex = -1;
                        }
                    }
                }else if(num == -1){
                    if(!first){
                        arr[i] = 1;
                        first = true;
                    }else{
                        if(replaceIndex!=-1){
                            arr[replaceIndex] = 0;
                        }
                        replaceIndex = i;
                        arr[i] = 1;
                    }
                }
            }
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

/* Problem Statement
C. 101
time limit per test2 seconds
memory limit per test256 megabytes
The score of an array b
 of length m
 is defined as the maximum length of a subarray of b
 such that the first and last elements of the subarray are equal to 1
 and all other elements in the subarray are equal to 0
. Formally, the score of b
 is equal to the maximum integer k
 for which there exists an index i
 such that:

1≤i≤m−k+1
bi=bi+k−1=1
bi+1=bi+2=…=bi+k−2=0
If there is no subarray meeting the requirements, the score of b
 is 0
.

You are given an array a1,a2,…,an
, such that each element is equal to one of −1
, 0
, or 1
. Replace each −1
 with either a 0
 or 1
 such that the score of a
 is maximal over all possible ways to replace the −1
s in a
.

Input
The first line of each input contains t
 (1≤t≤104
) — the number of test cases.

The first line of each test case contains n
 (1≤n≤2⋅105
) — the length of a
.

The second line of each test case contains a1,a2,…,an
 (ai∈{−1,0,1}
) — the array a
.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105
.

Output
For each test case, output n
 space separated integers representing a
 after the −1
s were replaced with 0
s or 1
s. If there are multiple possible solutions, output any.

Example
InputCopy
10
6
1 0 -1 0 0 1
7
0 -1 0 0 1 0 1
5
-1 0 0 -1 0
4
0 0 0 0
1
-1
6
1 0 1 0 0 -1
7
0 1 0 0 0 1 0
6
-1 -1 -1 -1 -1 -1
7
-1 0 1 -1 0 0 1
3
-1 0 0
OutputCopy
1 0 0 0 0 1
0 1 0 0 1 0 1
1 0 0 1 0
0 0 0 0
1
1 0 1 0 0 1
0 1 0 0 0 1 0
1 0 0 0 0 1
0 0 1 0 0 0 1
1 0 0
Note
In the first test case, we can change the only −1
 to a 0
, making a=[1,0,0,0,0,1]
. Since the first and last elements of a
 are equal to 1
, and all other elements are 0
, the score of a
 is 6
.

In the third test case, changing both −1
s to 1
s makes a=[1,0,0,1,0]
, and the largest subarray that satisfies the conditions in the statement is from the 1
-st index to the 4
-th index.

In the fifth test case, we set the only −1
 to 1
, making a=[1]
, meaning the largest subarray that satisfies the conditions in the statement is the full array.


*/