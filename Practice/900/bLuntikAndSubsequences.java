import java.io.*;
import java.util.*;
import java.lang.*;

public class bLuntikAndSubsequences{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int zeroCount = 0, oneCount = 0;
            for(int i = 0;i<n;i++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp==0){
                    zeroCount++;
                }
                if(temp==1){
                    oneCount++;
                }
            }
            System.out.println(oneCount + oneCount * ((1L << zeroCount) -1));
        }
    }
}

/*
Codeforces 1582B - Luntik and Subsequences
https://codeforces.com/problemset/problem/1582/B
*/