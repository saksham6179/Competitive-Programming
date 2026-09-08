import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int zeroCount = 0,ans = 0, pre = Integer.parseInt(st.nextToken());
            if(pre==0){
                zeroCount++;
            }else{
                ans++;
            }
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num==0){
                    zeroCount++;
                }
                pre = num;
            }
            if(pre!=0){
                ans++;
            }
            if(zeroCount<2){
                ans = -1;
            }
            System.out.println(ans);
        }
    }
}

/* Problem Statement 
A. Monocarp's Contest
time limit per test2 seconds
memory limit per test512 megabytes
Monocarp is preparing a team programming contest. The contest has n
 problems, each of which is either easy or hard. The problems are numbered from 1
 to n
.

Monocarp wants the first and the last problems of the contest to be easy. In one operation, he can choose any two problems and swap them.

Determine the minimum number of operations required to make the first and the last problems easy, or report that it is impossible.

Input
The first line contains an integer t
 (1≤t≤103
) — the number of test cases.

Each test case consists of two lines

the first line contains one integer n
 (2≤n≤50
) — the number of problems in the contest;
the second line contains n
 integers a1,a2,…,an
 (0≤ai≤1
). If ai=0
, then the problem with number i
 is easy; if ai=1
, then it is hard.
Output
For each test case, print the minimum number of operations required to make the first and the last problems easy. If it is impossible to satisfy the requirement, print −1
.

Example
InputCopy
4
2
0 0
2
0 1
6
1 0 0 1 0 0
5
1 0 0 1 1
OutputCopy
0
-1
1
2
Note
In the first test case, the first and the last problems are already easy, so no operations are needed.

In the second test case, there is only one easy problem, so it is impossible to make both the first and the last problems easy.

In the third test case, one can swap the first and the second problems.

In the fourth test case, one can first swap the first and the second problems, and then — the third and the fifth problems.
*/