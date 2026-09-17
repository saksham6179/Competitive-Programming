import java.io.*;
import java.util.*;

public class cTrafficLight{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine();
            if(c=='g'){
                System.out.println(0);
                continue;
            }
            int[] suffix = new int[n];
            int count = 0;
            boolean flag = false;
            for(int i = n-1;i>=0;i--){
                if(s.charAt(i)=='g'){
                    flag = true;
                    count = 0;
                }else if(flag){
                    suffix[i] = ++count;
                }
            }
            int ans = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)==c){
                    if(suffix[i]!=0){
                        ans = Math.max(ans,suffix[i]);
                    }else{
                        int temp = ((n-i)-1) + (suffix[0]+1);
                        ans = Math.max(ans,temp);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1744C - Traffic Light
https://codeforces.com/problemset/problem/1744/C
*/