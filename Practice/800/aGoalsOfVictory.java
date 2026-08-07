import java.io.*;
import java.util.*;

public class aGoalsOfVictory{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0;
            for(int j = 0;j<n-1;j++){
                ans += Integer.parseInt(st.nextToken());
            }
            ans *= -1;
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1877A - Goals of Victory
Link: https://codeforces.com/problemset/problem/1877/A
*/