import java.io.*;
import java.util.*;
import java.lang.*;

public class D{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int zeroCount = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num!=0){
                    sb.append('C');
                }else{
                    zeroCount++;
                    if(zeroCount > 1){
                        sb.append('B');
                    }else{
                        sb.append('A');
                    }
                }
            }
            if(zeroCount!=1){
                System.out.println("YES\n" + sb.toString());
            }else{
                System.out.println("NO");
            }
        }
    }
}

/* Problem Statement
D. MEX Multiset
time limit per test2 seconds
memory limit per test256 megabytes
You are given an array a1,a2,…,an
. There exist 3
 initially empty multisets A,B,C
, and for each index i
 (1≤i≤n
), you may put ai
 into exactly one of A
, B
, or C
.

Determine whether it is possible to put the elements into the multisets such that MEX(A)+MEX(B)+MEX(C)≥2⋅max(MEX(A),MEX(B),MEX(C))
∗
. If so, output a construction that achieves this.

∗
MEX(D)
 is defined as the smallest non-negative integer that is not present in the set D
. For example, MEX([1,2,0,5])=3
, and MEX([1,2,4,9])=0
. The MEX
 of an empty set is 0
.

Input
The first line of each input contains t
 (1≤t≤104
) — the number of test cases.

The first line of each test case contains n
 (3≤n≤2⋅105
) — the length of a
.

The second line of each test case contains a1,a2,…,an
 (0≤ai≤109
) — the array a
.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105
.

Output
If a valid distribution of elements into the multisets exists, output YES
. Otherwise, output NO
.

If the answer is YES
, output a string s
 of length n
 on a new line, such that si=A
 if the i
-th element was put into the multiset A
, si=B
 if the i
-th element was put into the multiset B
, and si=C
 if the i
-th element was put into the multiset C
.

You can output the answer in any case (upper or lower). For example, the strings YES
, yes
, yEs
, and Yes
 will be recognized as positive responses, and the strings NO
, no
, No
 will be recognized as negative responses. Additionally, the strings AABCAAA
, aabcaaa
, and aaBcaaa
 will be recognized as the same answer.

If there are multiple possible outputs, output any.

Example
InputCopy
5
6
1 0 0 1 2 1
4
0 0 0 0
3
0 2 2
4
6 7 6 7
5
0 0 0 1 2
OutputCopy
YES
ABABCA
YES
ABAC
NO
YES
AAAB
YES
ABCAB
Note
In the first test case, we can have A={0,1,1}
, B={0,1}
, C={2}
, meaning MEX(A)+MEX(B)+MEX(C)=4
, and 2⋅max(MEX(A),MEX(B),MEX(C))=2⋅max(2,2,0)=4
.

In the third test case, it can be shown that there are no valid distributions.

*/