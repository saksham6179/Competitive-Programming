import java.io.*;
import java.util.*;
import java.lang.*;

public class aMainakAndArray{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()), last = first, max = first, min = first, ans = 0;
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                ans = Math.max(ans,(last-num));
                max = Math.max(max,num); 
                min = Math.min(min,num);
                last = num;
            }
            ans = Math.max(ans,(last-first));
            if(last==max){
                 ans = max-min;
            }else{
                ans = Math.max(ans,(max-first));
                ans = Math.max(ans,(last - min));
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1726A - Mainak and Array
Link: https://codeforces.com/problemset/problem/1726/A
*/