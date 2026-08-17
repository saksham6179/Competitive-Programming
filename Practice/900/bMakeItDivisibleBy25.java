import java.io.*;
import java.util.*;
import java.lang.*;

public class bMakeItDivisibleBy25{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String num = br.readLine();
            int ans = Integer.MAX_VALUE;
            HashMap<Character,Integer>map = new HashMap<>();
            for(int i = num.length()-1;i>=0;i--){
                if((num.charAt(i)=='7' || num.charAt(i)=='2') && map.containsKey('5')){
                    String temp = num.substring(0,i+1) + num.substring(map.get('5'),map.get('5')+1);
                    ans = Math.min(num.length()-temp.length(),ans);
                }else if((num.charAt(i)=='5' || num.charAt(i)=='0') && map.containsKey('0')){
                    String temp = num.substring(0,i+1) + num.substring(map.get('0'),map.get('0')+1);
                    ans  = Math.min(num.length()-temp.length(),ans);
                }else if((num.charAt(i)=='5' || num.charAt(i)=='0') && !map.containsKey(num.charAt(i))){
                    map.put(num.charAt(i),i);
                }
            }
            System.out.println(ans);
        }
    }
}

/*
 Codeforces 1593B - Make It Divisible by 25
 https://codeforces.com/problemset/problem/1593/B
*/