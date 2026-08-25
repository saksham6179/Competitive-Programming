import java.io.*;
import java.util.*;
import java.lang.*;

public class bSumOfMedians{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n*k];
            for(int i = 0;i<(n*k);i++){ 
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int i = (n*k)-1,skip = n/2,count = 0;
            long ans = 0;
            while(i>=0){
                if(skip==0){
                    ans += arr[i];
                    skip = n/2;
                    count++;
                    i--;
                    if(count==k){
                        break;
                    }
                    continue;
                }
                skip--;
                i--;
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1440B - Sum of Medians
https://codeforces.com/problemset/problem/1440/B
*/