import java.io.*;
import java.util.*;
import java.lang.*;

public class bMakeItIncreasing{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int count = 0;
            for(int i = n-2;i>=0;i--){
                while(arr[i] >= arr[i+1]){
                    if(arr[i]==0){
                        count = -1;
                        break;
                    }
                    arr[i] /= 2;
                    count++;
                }
                if(count==-1) break;
            }
            System.out.println(count);
        }
    }
}

/*
 Problem: Make It Increasing
 Codeforces: https://codeforces.com/problemset/problem/1675/B
 */