import java.io.*;
import java.util.*;
import java.lang.*;

public class cSkiResort{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int count = 0;
            long ans = 0;
            for(int i = 0;i<n;i++){
                if(q >= Integer.parseInt(st.nextToken())){
                    count++;
                }else{
                    if(count >= k){
                        long dif = (count-k) + 1;
                        ans += (dif * (dif+1))/2;
                    }
                    count = 0;
                }
            }
            if(count >=k){
                long dif = (count-k) + 1;
                ans += (dif * (dif+1))/2;
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1840C - Ski Resort
https://codeforces.com/problemset/problem/1840/C
*/
