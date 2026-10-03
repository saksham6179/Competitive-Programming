import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine();
            int start = 0, end = n-1;
            int count = 0;
            while(start< end){
                if(s.charAt(start)!=s.charAt(end)){
                    if(s.charAt(start)!=c){
                        count++;
                    }
                    if(s.charAt(end)!=c){
                        count++;
                    }
                }
                start++;
                end--;
            }
            System.out.println(count);           
        }
    }
}

/* 
Problem Statement

A. Turn Into a Palindrome
time limit per test1 second
memory limit per test256 megabytes
Ali has a string s
 consisting of n
 lowercase Latin letters. He also has a character c
, which is a lowercase Latin letter. In one coin, he can perform the following operation on the string s
:

First, he chooses an index 1≤i≤n
.
Then he replaces si
 with the character c
.
Ali wants to turn the string s
 into a palindrome∗
, but he does not want to spend too many coins on it. Your task — compute the minimum number of coins he has to spend to turn the string s
 into a palindrome.

∗
A string t
 of length m
 is a palindrome if ti=tm−i+1
 holds for every 1≤i≤m

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤500
). The description of the test cases follows.

The first line of each test case contains an integer n
 and a lowercase Latin letter c
 (1≤n≤100
) — the length of the string s
 and the character c
.

The second line of each test case contains the string s
 consisting of n
 lowercase Latin letters.

Output
For each test case, output one number — the minimum number of coins Ali needs to spend for the string to become a palindrome.

Example
InputCopy
5
4 b
abca
3 p
xyx
5 e
abcbb
8 d
adbccbad
10 c
codeforces
OutputCopy
1
0
2
2
8
Note
In the first test case, in one coin, you can replace s3
 with b
. After the replacement, the string becomes abba
, which is already a palindrome. It can be proven that 1
 is the minimum number of coins required.

In the second test case, the string s
 is already a palindrome.

In the third test case, it is enough to change s1
 and s5
 to e
. After two replacements, the string becomes ebcbe
, which is already a palindrome.

In the fourth test case, in two coins, you can replace s1
 and s7
.


*/