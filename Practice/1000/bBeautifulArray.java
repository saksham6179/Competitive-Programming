import java.io.*;
import java.util.*;

public class bBeautifulArray{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), s = Long.parseLong(st.nextToken());
            if(k * b > s){
                System.out.println(-1);
                continue;
            }
            long[] arr = new long[(int)n];
            arr[0] = k*b;
            s = s - arr[0];
            if(s>=k){
                s = s -(k-1);
                arr[0] += (k-1);
            }else{
                arr[0] += s;
                s = 0;
            }
            for(int i = 1;i<n && s>0;i++){
                arr[i] = Math.min(s,k-1);
                s -= arr[i];
            }
            if(s>0){
                System.out.println(-1);
                continue;
            }
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

/*
Codeforces 1715B - Beautiful Array
https://codeforces.com/problemset/problem/1715/B
*/