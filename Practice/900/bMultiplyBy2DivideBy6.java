import java.io.*;
import java.util.*;
import java.lang.*;

public class bMultiplyBy2DivideBy6{
    static private HashMap<Long,Integer> map;
    public static int find(long n){
         if(map.containsKey(n)){
            return map.get(n);
         }
         if(n%2==0 && n%6!=0){
            map.put(n,-1);
         }else if(n%2==0 && n%6==0){
            int value = find(n/6);
            map.put(n,(value!=-1?value+1 : value));
         }else{
            int value = find(n*2);
            map.put(n,(value!=-1?value+1 : value));
         }
         return map.get(n);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        map.put((long)1,0);
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            System.out.println(find(n));
        }
    }
}

/*
Codeforces 1374B - Multiply by 2, divide by 6
https://codeforces.com/problemset/problem/1374/B
*/