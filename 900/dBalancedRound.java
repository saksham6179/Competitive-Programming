import java.io.*;
import java.util.*;
import java.lang.*;

public class dBalancedRound{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] problems = new int[n];
            for(int i = 0;i<n;i++){
                problems[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(problems);
            int maxSeqCount = 0;
            int currentSeqCount = 0;
            for(int i = 1;i<n;i++){
                if(problems[i]-problems[i-1]>k){
                    maxSeqCount = Math.max(maxSeqCount,(currentSeqCount+1));
                    currentSeqCount = 0;
                }else{
                    currentSeqCount++;
                }
            }
            maxSeqCount = Math.max(maxSeqCount,(currentSeqCount+1));
            System.out.println(n-maxSeqCount);
        }
    }
}

/*
Problem: Codeforces 1850D - Balanced Round
Link: https://codeforces.com/problemset/problem/1850/D
*/