import java.io.*;
import java.util.*;
import java.lang.*;

public class aMochaAndMath{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = Integer.parseInt(st.nextToken());
            for(int i = 1;i<n;i++){
                ans &= Integer.parseInt(st.nextToken());
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1559A - Mocha and Math
https://codeforces.com/problemset/problem/1559/A
*/