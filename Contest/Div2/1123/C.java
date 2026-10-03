import java.io.*;
import java.util.*;

public class C{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer>list = new ArrayList<>();
            int[] arr = new int[n];
            long ans = 0;
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 2;i*i <=x;i++){
                if(x%i==0){
                    list.add(i);
                }
                while(x%i==0){
                    x/=i;
                }
            }
            if(x>1){
                list.add(x);
            }
            for(int i = 0;i<list.size();i++){
                long sum = 0;
                for(int j = 0;j<n;j++){
                    if(arr[j]%list.get(i)==0){
                        sum+= arr[j];
                    }
                }
                ans = Math.max(ans,sum);
            }
            System.out.println(ans);
        }
    }
}

/*

I was not able to solve this problem during the contest.
I tried several days of upsolving, even with the help of ChatGPT,
but I kept going in the wrong direction.

Initially, I tried to solve this using DP and gcd groups, but that
approach was wrong because the value of x changes during the process,
so gcd(ai, x) can change as well.

The key observation is that:

    gcd(ai, x)

is always a divisor of the current x.

Therefore, the value of x keeps becoming smaller divisors of the
original x. Eventually, we can reach a prime factor p of the
original x.

Once x becomes a prime p, gcd(ai, p) can only be:

    1 or p

There is no other possibility because p is prime.

Therefore, once we reach p, we can completely consume every pile
whose value is divisible by p.

So the solution is:

1. Find all distinct prime factors of the original x.
2. For every prime factor p, calculate the sum of all ai such that
   ai % p == 0.
3. The maximum of these sums is the answer.

For example, if x = 12, its prime factors are 2 and 3.

We calculate:

    sum(2) = all ai divisible by 2
    sum(3) = all ai divisible by 3

and take max(sum(2), sum(3)).

I also learned a useful prime-factorization technique from this
problem:

    for(int i = 2; i*i <= x; i++){
        if(x%i == 0){
            list.add(i);
        }

        while(x%i == 0){
            x /= i;
        }
    }

    if(x > 1){
        list.add(x);
    }

The while loop removes all occurrences of the current factor.
After the loop, if x > 1, the remaining x must be a prime factor.

Problem Statement

C. GCD Treasury
time limit per test2 seconds
memory limit per test256 megabytes

The greedy pirate Dimash found a treasury. It consists of n
 piles of coins, numbered from 1
 to n
. The i
-th pile contains exactly ai
 coins. Pirate Dimash has a number x
 that he can use to steal coins from the treasury. The stealing process works as follows:

First, he chooses an index 1≤i≤n
 such that ai>0
 and gcd
∗
(ai,x)≠1
. If there is no such index, the pirate stops.
Now let gcd(ai,x)
 be g
. The pirate steals exactly g
 coins from pile i
, after which ai
 decreases by g
.
Finally, he sets x
 to g
 and continues stealing coins.
Your task is to help the pirate steal the maximum possible number of coins. Find the maximum number of coins that can be stolen from the treasury.

∗
gcd(ai,x)
 denotes the greatest common divisor (GCD) of integers ai
 and x
.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤104
). The description of the test cases follows.

The first line of each test case contains two integers n
 and x
 (1≤n,x≤3⋅105
) — the number of piles of coins in the treasury and the pirate's number.

The second line of each test case contains n
 integers a1,a2,…an
 (1≤ai≤3⋅105
).

It is guaranteed that the sum of n
 over all test cases does not exceed 3⋅105
.

Output
For each test case, output one number — the maximum number of coins that can be stolen.

Example
InputCopy
5
3 1
2 3 5
3 4
2 3 4
4 2
2 2 2 2
6 6
2 3 2 3 2 3
7 6
9 9 4 4 4 4 4
OutputCopy
0
6
8
9
20
Note
In the first test case, no coin can be stolen.

In the second test case, the pirate steals as follows.

The pirate chooses pile number 3
. He takes 4
 coins, after which the treasury becomes [2,3,0]
 and x
 becomes 4
.
The pirate chooses pile number 1
. He takes 2
 coins, after which the treasury becomes [0,3,0]
, and x
 becomes 2
.
No suitable indices remain, so the pirate stops. The pirate managed to take 4+2=6
 coins.

*/ 