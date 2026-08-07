import java.io.*;
import java.util.*;
import java.lang.*;

public class dOddQueries{
    public static void main(String[] args)throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> prefixSumParity = new HashMap<>();
            prefixSumParity.put(0,0);
            for(int i = 1;i<=n;i++){
                int currParity =  Integer.parseInt(st.nextToken())%2;
                prefixSumParity.put(i,(prefixSumParity.get(i-1)%2==currParity)?0:1);
            }
            for(int i = 0;i<q;i++){
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), rangeSumParity = ((k%2!=((r-l)+1)%2) || k%2==0)?0:1, remainingSumParity =  (prefixSumParity.get(l-1)+((prefixSumParity.get(n)+prefixSumParity.get(r))%2))%2;
                System.out.println((remainingSumParity!=rangeSumParity)?"YES":"NO");
            }
        }
    }
}

/*
Problem: Codeforces 1807D - Odd Queries
Link: https://codeforces.com/problemset/problem/1807/D
*/