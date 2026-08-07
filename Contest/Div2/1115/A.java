import java.io.*;
import java.util.*;
import java.lang.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer>count = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                count.put(num,count.getOrDefault(num,0)+1);
                set.add(num);
            }
            int[] nums = new int[set.size()];
            int k = 0;
            int ans = 0;
            for(int num:set){
                nums[k++] = num;
            }
            Arrays.sort(nums);
            int bre = k-1;
            int totalCount = count.get(nums[bre]);
            for(int i = k-2;i>=0;i--){
                int tempCount = count.get(nums[i]);
                if(tempCount >= totalCount){
                    bre = i;           
                }
                totalCount += tempCount;
            }
            totalCount = 0;
            for(int i = k-1;i>=bre;i--){
                if(i==bre){
                    ans += (totalCount * nums[i]);
                    count.put(nums[i],count.get(nums[i])-totalCount);
                }else{
                    ans += (count.get(nums[i])*nums[i]);
                    totalCount += count.get(nums[i]);
                }
            }
            int i = bre;
            while(i>=0){
                if(count.get(nums[i])>0){
                    int countNum = 1;
                    int sum = nums[i];
                    count.put(nums[i],count.get(nums[i])-1);
                    int j = i-1;
                    while(j>=0){
                        if(count.get(nums[j])>0){
                            sum += nums[j];
                            countNum++;
                            count.put(nums[j],count.get(nums[j])-1);
                            break;
                        }else{
                            j--;
                        }
                    }
                    if(countNum>1){
                        ans += sum;
                    }else{
                        int c = Math.min(2,count.get(nums[i])+1);
                        ans += (nums[i]*c);
                        break;
                    }
                }else{
                    i--;
                }
            }
            System.out.println(ans);
        }
    }
}

/* this was the question i was not able to solve in the contest. yes i was not able to solve any question in the 1115 div2 contest. I tried to solve this question even after the contest and able to solve it on the next day of contest. :) 

Problem Statement

A. Boss Fight
time limit per test1 second
memory limit per test256 megabytes
You are fighting a boss with an unknown amount of health. You have a sequence of n
 spell cards, where the i
-th card deals ai
 damage. You can rearrange your hand and play the cards in any order you choose.

The boss has an adaptive shield. If you ever play two cards in a row that deal the exact same amount of damage, the shield permanently activates. The card that triggers the shield still deals its normal damage, but all subsequent cards you play will deal 0
 damage.

Find the maximum total health the boss can have such that you will defeat him if you arrange and play your cards optimally.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤100
). The description of the test cases follows.

The first line of each test case contains a single integer n
 (1≤n≤50
) — the number of spell cards.

The second line of each test case contains n
 integers a1,a2,…,an
 (1≤ai≤1000
) — the damage dealt by each card.

Output
For each test case, output a single integer — the maximum total health the boss can have such that you will defeat him.

Example
InputCopy
4
1
100
4
10 5 10 10
5
1 2 3 4 5
6
7 7 7 7 7 7
OutputCopy
100
35
15
14
Note
In the first test case, you have only 1
 card. You play it, dealing 100
 damage.

In the second test case, you can arrange your hand as [10,5,10,10]
. You play the first 10. Then you play the 5. Then you play the second 10. Then you play the final 10. Because you played two 10s in a row, the shield activates. However, the card that triggers the shield still deals its normal damage. The total damage dealt is 10+5+10+10=35
.

In the third test case, all cards are distinct. You can simply play them in any order to deal the sum of their damage: 1+2+3+4+5=15
.

In the fourth test case, all 6
 cards deal exactly 7 damage. No matter what order you play them in, your second card will be identical to your first. The second card will trigger the shield and deal its normal damage, but the remaining 4
 cards will deal 0
 damage. The total damage dealt is 7+7=14
.

*/ 