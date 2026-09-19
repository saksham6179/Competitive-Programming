import java.io.*;
import java.util.*;

public class aVasyaAndSocks{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int ans = n - (n%m);
        n = (n/m) + (n%m);
        while(n>=m){
            ans += (n -(n%m));
            n = (n/m) + (n%m); 
        }
        ans += n;
        System.out.println(ans);
    }
}    

/*
Codeforces 460A - Vasya and Socks
https://codeforces.com/problemset/problem/460/A
*/