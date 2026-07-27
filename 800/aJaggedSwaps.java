import java.io.*;
import java.util.*;

public class aJaggedSwaps{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ans = "NO";
            if(Integer.parseInt(st.nextToken())==1){
                ans = "YES";
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1896A - Jagged Swaps
Link: https://codeforces.com/problemset/problem/1896/A
*/