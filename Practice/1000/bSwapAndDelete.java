import java.io.*;
import java.util.*;
import java.lang.*;

public class bSwapAndDelete{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            int zeros = 0, ones = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    zeros++;
                }else{
                    ones++;
                }
            }
            int ans = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    if(zeros==0){
                        ans = s.length()-i;
                        break;
                    }
                    zeros--;
                }else{
                    if(ones==0){
                        ans = s.length()-i;
                        break;
                    }
                    ones--;
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1913B - Swap and Delete
https://codeforces.com/problemset/problem/1913/B
*/
