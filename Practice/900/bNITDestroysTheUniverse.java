import java.io.*;
import java.util.*;
import java.lang.*;

public class bNITDestroysTheUniverse{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            int ans = 0;
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(pre==0){
                    pre = num;
                    continue;
                }
                if(pre!=0 && num==0){
                    ans++;
                }
                pre = num;
            }
            if(pre!=0){
                ans++;
            }
            System.out.println(Math.min(ans,2));
        }
    }
}

/*
Problem: Codeforces 1696B - NIT Destroys the Universe
Link: https://codeforces.com/problemset/problem/1696/B
*/