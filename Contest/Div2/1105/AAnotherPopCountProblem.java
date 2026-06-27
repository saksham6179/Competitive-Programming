import java.util.*;
import java.io.*;

public class AAnotherPopCountProblem{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n =  Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int ans = 0;
            int cost = 1;
            int avl = k;
            while(cost<=n){
                int take = Math.min((n/cost),avl);
                ans += take;
                avl = take;
                n = n - (avl * cost);
                cost *= 2;
            }
            System.out.println(ans);
        }
    }
}

