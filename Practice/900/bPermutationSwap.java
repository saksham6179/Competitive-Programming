import java.io.*;
import java.util.*;
import java.lang.*;

public class bPermutationSwap{
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = Math.abs(1-Integer.parseInt(st.nextToken()));
            for(int i = 2;i<=n;i++){
                int diff = Math.abs(i - Integer.parseInt(st.nextToken()));
                ans = gcd(ans,diff);
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1828B - Permutation Swap
Link: https://codeforces.com/problemset/problem/1828/B
*/