import java.io.*;
import java.util.*;
import java.lang.*;

public class aOddDivisor{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            if(n%2!=0){
                System.out.println("YES");
                continue;
            }
            String ans = "NO";
            long i = n/2;
            while(i>2){
                if(n%i==0 && i%2!=0){
                    ans = "YES";
                    break;
                }
                i/=2;
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1475A - Odd Divisor
https://codeforces.com/problemset/problem/1475/A
*/