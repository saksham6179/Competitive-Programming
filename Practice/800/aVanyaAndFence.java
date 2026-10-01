import java.io.*;
import java.util.*;

public class aVanyaAndFence{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(Integer.parseInt(st.nextToken())>h){
                ans++;
            }
            ans++;
        }
        System.out.println(ans);
    }
}

/*
Codeforces: 677A - Vanya and Fence
https://codeforces.com/problemset/problem/677/A
*/