import java.io.*;
import java.util.*;
import java.lang.*;

public class dDistanceSplit{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            HashSet<Character>set = new HashSet<>();
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            for(int i = 0;i<n;i++){
                set.add(s.charAt(i));
                prefix[i] = set.size();
            }
            set.clear();
            for(int i = n-1;i>=0;i--){
                set.add(s.charAt(i));
                suffix[i] = set.size();
            }
            int ans = 0;
            for(int i = 0;i<n-1;i++){
                ans = Math.max(ans,(prefix[i] + suffix[i+1]));
            }
            System.out.println(ans);
        }
    }
}


/*
Codeforces: 1791D - Distinct Split
https://codeforces.com/problemset/problem/1791/D
*/