import java.io.*;
import java.util.*;

public class C{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int count = n+1;
            if(s.charAt(0)=='1'){
                count = 0;
                for(int i = 1;i<n;i++){
                    if(s.charAt(i)=='0'){
                        count++;
                    }
                }
                System.out.println(count);
                continue;
            }
            int[] prefix = new int[n];
            int[] suffix = new int[n+1];
            prefix[0] = (s.charAt(0)=='1'?1 : 0);
            suffix[n-1] = (s.charAt(n-1)=='0'?1 : 0);
            for(int i = 1;i<n;i++){
                prefix[i] = prefix[i-1];
                if(s.charAt(i)=='1'){
                    prefix[i]++;
                }
            }
            for(int i = n-2;i>=0;i--){
                suffix[i] = suffix[i+1];
                if(s.charAt(i)=='0'){
                    suffix[i]++;
                }
            }
            for(int i = 0;i<n;i++){
                count = Math.min(count, prefix[i] + suffix[i+1]);
            } 
            System.out.println(count);
        }
    }
}
 

/*
Problem statement is at the end of the comment. First, my journey with this problem :)

I was not able to get this problem accepted during the contest.

Initially, I was trying to calculate the answer based on the points
where the string was becoming unsorted.

I did notice one important case: if the string starts with '1', then
the only possible sorted string is a string of all '1's. So, we just
need to change every '0' into a '1', which means the answer is the
number of zeros.

For the case where the string starts with '0', I was trying to find
the minimum cost at every position where s[i] > s[i + 1].

My idea was that at such a point, I could either:

1. Make the '1' into a '0'. In that case, I would need to make all the
   '1's behind that position into '0' as well.

2. Make the '0' into a '1'. In that case, I would need to make all the
   '0's after that position into '1'.

So, for every "10" transition, I was checking which option would cost
less.

But this approach gave me WA.

I tried solving it multiple times during the contest and even after
the contest, but I still couldn't figure it out.

Then, with some help from ChatGPT (my savior T_T), I understood the
idea of using a boundary.

The key observation is that if a binary string is sorted, it can only
look like:

    0000000
    1111111
    000...000111...111

So instead of only looking at the positions where the string becomes
unsorted, I can try every possible boundary between the 0s and 1s.

For example, for:

    01001101

the possible boundaries are:
  Initial Array   ->    sorted Array
    |01001101     ->     |11111111
    0|1001101     ->     0|1111111
    01|001101     ->     00|111111
    010|01101     ->     000|11111
    0100|1101     ->     0000|1111
    01001|101     ->     00000|111
    010011|01     ->     000000|11
    0100110|1     ->     0000000|1
    01001101|     ->     00000000|

For each boundary, everything on the left should become '0' and
everything on the right should become '1'.

So:

- Every '1' on the left costs 1 operation because it needs to become '0'.
- Every '0' on the right costs 1 operation because it needs to become '1'.

Therefore:

    cost = number of 1s on the left
         + number of 0s on the right

I check every possible boundary and take the minimum cost.
That minimum is the answer.

This is how I finally upsolved the problem :)
Proud of myself B).

The main thing I learned from this problem is that instead of only
looking at where the current string is becoming invalid, I should also
try to think about what a valid final state can look like.

Here, once I realized that every sorted binary string can be represented
by a single boundary, the whole problem became much easier to think about.

C. AND, OR, Sort!
time limit per test2 seconds
memory limit per test256 megabytes
You are given a binary string∗
 s
 of length n
.

You may perform the following operation any number of times (possibly zero):

choose an integer i
 (1≤i≤n
), and replace si
 with either the bitwise AND or the bitwise OR of s1,s2,…,si
.
Note that the bitwise AND or bitwise OR of a single element is equal to the element itself.

Your goal is to make s
 sorted in non-decreasing order†
.

Find the minimum number of operations required to sort s
 in non-decreasing order.

∗
A binary string only contains characters 0
 and 1
.

†
If s
 is in non-decreasing order, then s1≤s2≤…≤sn
.

Input
The first line contains a single integer t
 (1≤t≤104
) — the number of test cases.

The first line of each test case contains a single integer n
 (2≤n≤2⋅105
) — the length of the binary string s
.

The second line of each test case contains the binary string s
 of length n
. Each character of s
 is either 0 or 1.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105
.

Output
For each test case, print a single integer — the minimum number of operations required to sort s
 in non-decreasing order.

Example
InputCopy
6
4
0011
4
1000
5
01000
8
01001101
7
0101010
7
0111101
OutputCopy
0
3
1
2
3
1
Note
In the first test case, the string is already sorted, so no operations are required.

In the second test case, we can use bitwise OR to change the last three characters to 1, obtaining 1111 in 3
 operations.


*/