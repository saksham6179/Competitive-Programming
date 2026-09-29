import java.io.*;
import java.util.*;

public class aWrongSubtraction{
    public static void main(String[] args)throws Exception{
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        while(k>0){
            int d = n%10;
            d += 1;
            if(k>=d){
                n /= 10;
            }else{
                n -= k;
            }
            k -= Math.min(k,d);
        }
        System.out.println(n);
    }
}


/*
Codeforces: 977A - Wrong Subtraction
https://codeforces.com/problemset/problem/977/A
*/