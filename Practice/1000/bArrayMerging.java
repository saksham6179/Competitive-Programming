import java.io.*;
import java.util.*;
import java.lang.*;

public class bArrayMerging{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer arr1 = new StringTokenizer(br.readLine());
            StringTokenizer arr2 = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer>map = new HashMap<>();
            int pre  = Integer.parseInt(arr1.nextToken());
            int count = 1;
            int ans = 1;
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(arr1.nextToken());
                if(num!=pre){
                    if(map.getOrDefault(pre,0)<count){
                        map.put(pre,count);
                        ans = Math.max(ans,count);
                    }
                    count = 0;
                }
                pre = num;
                count++;
            }
            if(map.getOrDefault(pre,0)<count){
                map.put(pre,count);
                ans = Math.max(ans,count);
            }
            count = 1;
            pre = Integer.parseInt(arr2.nextToken());
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(arr2.nextToken());
                if(num!=pre){
                    ans = Math.max(ans,(map.getOrDefault(pre,0)+count));
                    count = 0;
                }
                count++;
                pre = num;
            }
            ans = Math.max(ans,(map.getOrDefault(pre,0)+count));
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1831B - Array Merging
https://codeforces.com/problemset/problem/1831/B
*/