import java.io.*;
import java.util.*;

public class aEvenOdds{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
        if(k<=(n+1)/2){
            System.out.println(((k-1)*2)+1);
        }else{
            System.out.println((k-((n+1)/2))*2);
        }
    }
}

/*
Codeforces: 318A - Even Odds
https://codeforces.com/problemset/problem/318/A
*/