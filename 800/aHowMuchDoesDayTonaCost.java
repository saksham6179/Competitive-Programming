import java.io.*;
import java.util.*;

public class aHowMuchDoesDayTonaCost{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String ans = "NO";
            for(int j = 0;j<n;j++){
                if(Integer.parseInt(st.nextToken())==k){
                    ans = "YES";
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1878A - How Much Does Daytona Cost?
Link: https://codeforces.com/problemset/problem/1878/A
*/