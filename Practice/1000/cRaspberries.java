import java.io.*;
import java.util.*;
import java.lang.*;

public class cRaspberries{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()), ans = (num%k==0?0 : (k - (num%k))),evenCount = (num%2==0?1 : 0);
            for(int i = 1;i<n;i++){
                num = Integer.parseInt(st.nextToken());
                if(ans==0){
                    continue;
                }
                if(num%k==0){
                    ans = 0;
                    continue;
                }
                if(num%2==0){
                    evenCount++;
                }
                ans = Math.min(ans,k-(num%k));
            }
            if(k==4 && ans!=0){
                if(evenCount>=1){
                    ans = (evenCount>1?0 : 1);
                }else{
                    ans = Math.min(ans,2);
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1883C - Raspberries
https://codeforces.com/problemset/problem/1883/C
*/