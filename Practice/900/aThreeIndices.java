import java.io.*;
import java.util.*;
import java.lang.*;

public class aThreeIndices{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            boolean flag = false;
            String ans = "NO";
            for(int i = 2;i<=n;i++){
                int cur = Integer.parseInt(st.nextToken());
                if(!ans.equals("NO")){
                    continue;
                }
                if(pre > cur && flag){
                    ans = "YES\n" + (i-2) +" " + (i-1) + " " + i;
                }else if(pre < cur && !flag){
                    flag = true;
                }
                pre = cur;
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1380A - Three Indices
https://codeforces.com/problemset/problem/1380/A
*/