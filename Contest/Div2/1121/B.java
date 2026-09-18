import java.io.*;
import java.util.*;

public class B{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            long ans = Long.MIN_VALUE, sum = 0;
            for(int i = 0;i<m-1;i++){
                int num = Integer.parseInt(st.nextToken());
                maxHeap.offer(num);
                sum += num;
            }
            for(int i = m-1;i<n;i++){
                int bm = Integer.parseInt(st.nextToken());
                ans = Math.max(ans, ((long)m * bm) - sum);
                if(!maxHeap.isEmpty() && bm < maxHeap.peek()){
                    maxHeap.offer(bm);
                    sum += bm;
                    sum -= maxHeap.poll();
                }
            }
            System.out.println(ans);
        }
    }
}

/*
I was not able to solve this question during the contest. Later, I
upsolved it with the help of ChatGPT.

The main idea was to derive a formula from the given condition.

After expanding the formula:

    1(b1 - 0) + 2(b2 - b1) + 3(b3 - b2) + ... + m(bm - bm-1)

we get:

    m * bm - (b1 + b2 + ... + b(m-1))

So, for a fixed bm, we need to choose the smallest possible
(m-1) elements before it, because their sum is subtracted.

Therefore, for every element that can be the last element bm, we
need to know the sum of the smallest (m-1) elements before it.

Initially, I was trying to find the correct subsequence from A that
would give the maximum score. But after deriving the formula, I
realized that I don't actually need to construct the subsequence.
I only need to find the maximum possible score.

To maintain the smallest (m-1) elements efficiently, I used a
max-heap. The max-heap stores the smallest (m-1) elements seen so far,
and its top is the largest among those elements.

When a smaller element arrives, I remove the current largest element
from the heap and insert the new smaller element. This keeps the
smallest (m-1) elements in the heap.

This gives O(n log m) time complexity.

This was a good upsolve for me :) because I learned how algebraic
simplification can completely change the way a problem is approached.
Instead of directly trying to construct the required subsequence, I
could focus only on maximizing the resulting expression.

Problem Statement 

B. Knife's Pill Farm

time limit per test1.5 seconds
memory limit per test256 megabytes

Mr. Knife has drafted n
 absurd posts for a channel on a chat platform. His goal is to farm pill emoji reactions. Unfortunately, the channel's pill-farming bot uses an unnecessarily elaborate scoring rule.

The drafts have absurdity ratings a1,a2,…,an
, which may be negative. Mr. Knife must publish exactly m
 drafts in their original order. Their ratings form a subsequence∗
 b
 of a
 with length m
.

His pill score starts at 0
. When he publishes the i
-th chosen draft, the bot changes his score by i⋅(bi−bi−1)
, where b0=0
. A negative change deducts points, and the score is allowed to become negative. Thus, his final pill score is
∑i=1mi⋅(bi−bi−1).

What is the maximum pill score Mr. Knife can obtain by choosing which drafts to publish?

∗
A sequence a
 is a subsequence of a sequence b
 if a
 can be obtained from b
 by the deletion of several (possibly, zero or all) elements from arbitrary positions.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤104
). The description of the test cases follows.

The first line of each test case contains two integers n
 and m
 (1≤m≤n≤2⋅105
) — the number of drafts and the number of posts Mr. Knife must publish.

The second line contains n
 integers a1,a2,…,an
 (−107≤ai≤107
) — the absurdity ratings of the drafts.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105
.

Output
For each test case, print one integer — the maximum pill score Mr. Knife can obtain by publishing exactly m
 drafts in their original order.

Example
InputCopy
6
5 3
0 8 1 7 3
4 3
0 -4 10 -2
4 2
0 5 -2 4
6 3
0 9 8 7 6 5
1 1
7
3 2
5 -100 4
OutputCopy
20
34
10
15
7
108
Note
In the first test case, Mr. Knife can publish the drafts with ratings [0,1,7]
. His final pill score is
1⋅(0−0)+2⋅(1−0)+3⋅(7−1)=20.

In the second test case, he can publish the drafts with ratings [0,−4,10]
. The second post deducts points, but the third post more than makes up for it. His final pill score is
1⋅(0−0)+2⋅(−4−0)+3⋅(10−(−4))=34.


*/