import java.io.*;
import java.util.*;
import java.lang.*;

public class aAvtoBus{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            if(n>=4 && n%2==0){
                long max = n/4;
                long min = n/6;
                min += (n%6!=0)?1:0;
                System.out.println(min + " " + max);
            }else{
                System.out.println(-1);
            }
            
        }
    }
}

/*
Problem: Codeforces 1679A - AvtoBus
Link: https://codeforces.com/problemset/problem/1679/A
*/