import java.io.*;
import java.util.*;

public class mMinimumLCM{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int a = n/2, b = n-a;
            if(n%2!=0){
                 a = 1;
                 b = n-a;
                 int sqrtN = (int)Math.sqrt(n);
                 for(int i = 2;i<=sqrtN;i++){
                    if(n%i==0){
                        a = n/i;
                        b = n-a;
                        break;
                    }
                 }
            }
            System.out.println(a + " "  + b);
        }
    }
}

/*
Codeforces: 1765M - Minimum LCM
https://codeforces.com/problemset/problem/1765/M
*/