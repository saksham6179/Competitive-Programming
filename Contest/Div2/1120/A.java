import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ones = 0, zeros = 0;
            for(int i = 0;i<n;i++){
                if(Integer.parseInt(st.nextToken())==0){
                    zeros++;
                }else{
                    ones++;
                }
            }
            if(ones>=zeros){
                System.out.println("Bessie");
            }else{
                System.out.println("Elsie");
            }
        }
    }
}

/* 
Problem Statement

A. Min Max Game

time limit per test1 second
memory limit per test256 megabytes

Bessie and Elsie are playing a game on a binary array a
 of length n
.

The players alternate turns, with Bessie moving first. On Bessie's turn, she chooses two adjacent elements x
 and y
 and replaces them with the single value max(x,y)
.

On Elsie's turn, she chooses two adjacent elements x
 and y
 and replaces them with the single value min(x,y)
.

After each move, the length of the array decreases by 1
. The game ends when only one element remains. Bessie wins if the final element is 1
, and Elsie wins if the final element is 0
.

Assuming both players play optimally, determine who wins.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤500
). The description of the test cases follows.

The first line of each test case contains a single integer n
 (2≤n≤100
).

The second line of each test case contains n
 integers a1,a2,…,an
 (0≤ai≤1
).

Output
For each test case, you should output the name of who wins on a new line.

Example
InputCopy
3
5
1 0 1 0 1
3
0 0 1
4
1 1 0 0
OutputCopy
Bessie
Elsie
Bessie
Note
For the first test case, Bessie can guarantee a win. One possible game is as follows:
[1,0,1,0,1]→[1,1,0,1]→[1,0,1]→[1,1]→[1].
The final value is 1
, so Bessie wins (the red highlight denotes the two adjacent elements picked on that turn).

For the second test case, no matter which move Bessie makes, Elsie can make the final value 0
. Therefore, Elsie wins.

For the third test case, one possible winning game for Bessie is:
[1,1,0,0]→[1,1,0]→[1,0]→[1].
The final value is 1
, so Bessie wins.


*/