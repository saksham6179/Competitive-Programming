import java.io.*;
import java.util.*;

public class dBlackAndWhiteStripe{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            int minimumCount = n, windowCount = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)=='W'){
                    windowCount++;
                }
                if(i==k-1){
                    minimumCount = windowCount;
                }
                if(i>=k){
                    if(s.charAt(i-k)=='W'){
                        windowCount--;
                    }
                    minimumCount = Math.min(windowCount,minimumCount);
                }
            }
            System.out.println(minimumCount);
        }
    }
}

/*
Codeforces: 1690D - Black and White Stripe
https://codeforces.com/problemset/problem/1690/D
*/