import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new  StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            int pow =  (n-k)+1;
            long ans = 1<<pow;
            ans += (long)2 * (k-1);
            System.out.println(ans);
        }
    }
}


/*
Problem Statement

A. SauSaGe Bank
time limit per test1 second
memory limit per test256 megabytes
Everyone in SauSaGe City is talking about its famous bank that offers a seemingly impossible deal:

"Leave your money with us, and we'll double it every single day!"

Hamed decides to give it a try, so he deposits 1
 dollar into his account.

Suppose that at the beginning of a day, his bank balance is x
 dollars. Every day, the following events happen in order:

In the morning, the bank magically doubles his balance, so it becomes 2x
 dollars.
At night, Hamed may choose to withdraw all of the money from his bank account. If he does, the withdrawn amount is added to his card, and his bank account is immediately reset to 1
 dollar so that the doubling process can begin again the next day. Otherwise, he leaves the money in the bank.
Unfortunately, this incredible bank will remain open for exactly n
 days before shutting down forever.

Hamed wants to withdraw money on exactly k
 different days before the bank closes. Determine the maximum amount of money that can be on Hamed's card after the n
-th day.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤500
). The description of the test cases follows.

The only line of each test case contains the two integers n
 and k
 (1≤k≤n≤30
).

Output
For each test case, print a single integer — the maximum amount of money that can be on Hamed's card after the n
-th day.

Example
InputCopy
5
1 1
2 1
4 3
5 5
10 2
OutputCopy
2
4
8
10
514
Note
In the first test case, his bank balance becomes 2
 on the first day, and he chooses to withdraw it.

In the second test case, he can withdraw his money on the 2
-nd day.

In the third test case, he can withdraw his money on the 1
-st, 3
-rd, and 4
-th days. He receives 2
, 4
, and 2
, respectively.

*/