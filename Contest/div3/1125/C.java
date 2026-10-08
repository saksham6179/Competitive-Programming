import java.io.*;
import java.util.*;

public class C{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Long,Integer>map = new HashMap<>();
            long ans = 0;
            long[] scores = new long[n];
            int[] arr = new int[n];
            for(int i= 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 0;i<n-4;i++){ 
                long score = (long)arr[i] + arr[i+2] - arr[i+4];
                scores[i] = score;
                int previous = map.getOrDefault(score,0);
                int unValid = 0;
                if(i-2>=0){
                    if(scores[i-2]==score){
                        unValid++;
                    }
                }
                if(i-4 >=0){
                    if(scores[i-4]==score){
                        unValid++;
                    }
                }
                ans += (previous - unValid);
                map.put(score, previous+1);
            }
            System.out.println(ans);
        }
    }
}

/*

I was not able to solve this during the contest and got TLE on test 3. 
My initial approach was different: I stored every score position in a map and then checked the positions, which caused TLE. 
During upsolving took help from chatgpt, I understood the simpler approach: for a triad starting at i, only the triads starting at i-2 and i-4 can overlap with it. 
So I only need to subtract those two from the number of previous triads having the same score.

Problem Statement

C. Unrequited Love
time limit per test2 seconds
memory limit per test256 megabytes
K1o0n reached the stage where, for complete happiness, he only lacked a musical instrument, and bought a synthesizer second-hand. The instrument has n
 keys, giving a1,a2,…,an
 units of audience love.

Playing one note at a time is boring, so K1o0n learned a single technique — a triad: three keys with one key between each pair, pressed simultaneously. A triad starting at x
 (1≤x≤n−4
) is the keys x
, x+2
, and x+4
, which brings ax+ax+2−ax+4
 units of audience love.

The keys are old, and each can withstand exactly one press. Therefore, K1o0n wants to choose exactly two different triads that do not share any keys. In addition, he wants both triads to bring the same amount of audience love.

Count the number of ways to choose two such triads.

Input
The first line contains an integer t
 (1≤t≤104
) — the number of testcases.

The first line of each testcase contains an integer n
 (6≤n≤2⋅105
) — the number of keys.

The second line of each testcase contains n
 integers ai
 (−104≤ai≤104
) — the units of audience love.

It is guaranteed that the sum of n
 over all testcases does not exceed 2⋅105
.

Output
For each testcase, output one integer — the number of unordered pairs of disjoint triads with equal audience love values.

Note that the answer may not fit into a 32-bit type. Use a 64-bit type (long long in C++, long in Java).

Example
InputCopy
3
6
5 1 4 2 2 -4
7
0 0 0 0 0 0 0
12
-4 3 0 -4 -4 -1 -4 1 -3 -2 -2 -1
OutputCopy
1
2
5
Note
In the first testcase, such a pair is unique: x=1
, y=2
: 5+4−2=1+2−(−4)
.

In the second testcase, there are two such pairs: x=1
, y=2
 and x=3
, y=2
, and each triad brings 0
 units of audience love.


*/