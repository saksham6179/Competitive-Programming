import java.io.*;
import java.util.*;
import java.lang.*;

public class aHelmetsInNightLight{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
            int[] res = new int[n]; 
            st = new StringTokenizer(br.readLine());
            for(int i = 0;i<n;i++){
                res[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            HashMap<Integer,Long>ResMap = new HashMap<>();
            HashSet<Integer>set = new HashSet<>();
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num < p ){
                    ResMap.put(num,ResMap.getOrDefault(num,(long)0)+res[i]);
                    set.add(num);
                }
            }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for(int s : set){
                minHeap.offer(s);
            }
            long ans = p;
            long k = n-1;
            while(k>0 && !minHeap.isEmpty()){
                int num = minHeap.poll();
                if(ResMap.get(num)<k){
                    ans += (ResMap.get(num) * (long)num);
                    k -= ResMap.get(num);
                }else{
                    ans += (k * (long)num);
                    k = 0;
                }   
            }
            ans+= (k * p);
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1876A - Helmets in Night Light
https://codeforces.com/problemset/problem/1876/A
*/