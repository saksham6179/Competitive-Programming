import java.io.*;
import java.util.*;
import java.lang.*;

public class bComparisonString{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int ans = 1;
            int count = 1;
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    count++;
                    ans = Math.max(ans,count);
                }else{
                    count = 1;
                }
            }
            System.out.println(ans+1);
        }
    }
}

/*
Problem: Codeforces 1837B - Comparison String
Link: https://codeforces.com/problemset/problem/1837/B
*/