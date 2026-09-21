import java.io.*;
import java.util.*;

public class bLukeIsAFoodie{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken()),min =0,max = 0, changes = 0;
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min,(pre-num));
                max = Math.max(max,(pre-num));
                if(max-min > 2*x){
                    changes++;
                    pre = num;
                    min = 0;
                    max = 0;
                }
            }
            System.out.println(changes);
        }
    }
}

/*
Codeforces 1704B - Luke Is A Foodie
https://codeforces.com/problemset/problem/1704/B
*/