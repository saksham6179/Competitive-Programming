import java.io.*;
import java.util.*;

public class C1{
    static int[] next; // next pointer DSU/ DSU on next concept :) DSU - Disjoint set union 
    public static int find(int x){
        if(next[x]==x){
            return x;
        }
        return next[x] = find(next[x]);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            next = new int[n+1];
            for(int i = 0;i<=n;i++){
                next[i] = i;
            }
            int count = 0;
            for(int i = 1;i<=n;i++){
                int div = Integer.parseInt(st.nextToken());
                int first = div*i, last = ((div+1)*i)-1;
                if(first>=n){
                    continue;
                }
                last = Math.min(last,n-1);
                int x = find(first);
                while(x<=last){
                    next[x] = find(x+1);
                    x = next[x];
                    count++;
                }
            }
            System.out.println(n- count);
            for(int i = 0;i<n;i++){
                if(next[i]==i){
                    System.out.print(next[i] + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
Problem Statement

C1. Floor of MEX (Easy Version)

I was not able to solve this problem during the contest.
While upsolving, I had the key idea of removing the unwanted elements,
but I didn't know how to optimize the process.

With the help of ChatGPT, I learned about the Next-Pointer DSU
(DSU on Next) technique and used it to optimize the solution.

This was a really cool problem because I learned a completely new
DSU technique from it. I'm glad I upsolved it and learned something
new from a problem I couldn't solve during the contest. :)

Time Limit: 2 seconds
Memory Limit: 256 megabytes

Let
f(S,x)=mex({⌊y/x⌋:y∈S}),
where S is a set of non-negative integers and x is a positive integer.

Farmer John chooses a (possibly empty) subset A⊆{0,1,…,n−1}.
He then constructs an array a of length n, where
ak=f(A,k) for every 1≤k≤n.

Bessie hides the set A, and Farmer John is left with
the array a1,a2,…,an.

The task is to construct any subset B⊆{0,1,…,n−1}
such that f(B,k)=ak for every 1≤k≤n.

It is guaranteed that such a set B exists.

*/