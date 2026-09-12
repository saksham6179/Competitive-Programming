import java.io.*;
import java.util.*;

public class C{
    public static long highestBitValue(long n){
        long value = 1;
        while(n >= value<<1){
            value = value<<1;
        }
        return value;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
            long maxValue = x+y;
            long changingBit = (x & (~maxValue));
            if(changingBit==0){
                System.out.println(maxValue + " " + (x-(x&maxValue)));
                continue;
            }
            long highestBit = highestBitValue(changingBit);
            long finalX = (x ^ highestBit);
            finalX = finalX - (finalX & (highestBit-1));
            finalX = finalX + (maxValue & (highestBit-1));
            System.out.println(maxValue + " " + (x-finalX));
        }
    }
}

/*
Problem Statement

C. Maximize XOR, Minimize Operations

I was not able to solve this during the contest.
It took me around 3-4 days after the contest to finally get it accepted.

I also took ChatGPT's help to understand the problem and get through it.
I learned and implemented a lot of new things while solving this question,
especially bitwise operations, bit masks, XOR, and greedy bit construction.

This is one of my favorite questions till now because of how much I learned
from struggling with it. :)

Time Limit: 2 seconds
Memory Limit: 512 megabytes

You are given two non-negative integers x and y. In one operation, you can
decrease x by 1 and simultaneously increase y by 1. The operation cannot be
performed if x = 0.

For each initial pair, perform some number of operations, possibly zero, so
that the value of x XOR y becomes as large as possible. Among all ways to
obtain the maximum value, choose the one with the minimum number of operations.

Output the maximum value of x XOR y and the minimum required number of
operations.

Example:

Input:
3
3 1
0 5
6 4

Output:
4 3
5 0
10 4
*/