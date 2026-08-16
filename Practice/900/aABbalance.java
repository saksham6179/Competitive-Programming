import java.io.*;
import java.util.*;
import java.lang.*;

public class aABbalance{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringBuilder s = new StringBuilder(br.readLine());
            int abCount = 0,baCount = 0;
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)=='a' && s.charAt(i+1)=='b'){
                    abCount++;
                }else if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    baCount++;
                }
            }
            int i = 0;
            while(abCount!=baCount && i<s.length()-1){
                if((s.charAt(i)=='a' && s.charAt(i+1)=='a') && abCount>baCount){
                    s.setCharAt(i,'b');
                    abCount--;
                }else if((s.charAt(i)=='b' && s.charAt(i+1)=='b') && baCount>abCount){
                    s.setCharAt(i,'a');
                    baCount--;
                }else if((s.charAt(i)=='a' && s.charAt(i+1)=='b') && abCount>baCount){
                    s.setCharAt(i,'b');
                    abCount--;
                }else if((s.charAt(i)=='b' && s.charAt(i+1)=='a') && baCount>abCount){
                    s.setCharAt(i,'a');
                    baCount--;
                }
                i++;
            }
            System.out.println(s.toString());
        }
    }
}

/*
 Codeforces 1606A - AB Balance
 https://codeforces.com/problemset/problem/1606/A
 */