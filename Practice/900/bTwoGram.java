import java.io.*;
import java.util.*;

public class bTwoGram{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        HashMap<Integer,Integer>map = new HashMap<>();
        String ans = s.substring(0,2);
        int curValue = 1;
        map.put(((int)s.charAt(0) + ((int)s.charAt(1)*10)),1);
        for(int i = 1;i<n-1;i++){
            int key= (int)s.charAt(i) + ((int)s.charAt(i+1)*10);
            map.put(key,map.getOrDefault(key,0)+1);
            int value = map.get(key);
            if(value>curValue){
                curValue = value;
                ans = s.substring(i,i+2);
            }
        }
        System.out.println(ans);
    }
}

/*
Codeforces 977B - Two-gram
https://codeforces.com/problemset/problem/977/B
*/