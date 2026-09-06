import java.io.*;
import java.util.*;

public class aFootball{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 1;
        String ans = "NO";
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                if(count>=7){
                    ans = "YES";
                }
                count = 0;
            }
            count++;
        }
        if(count>=7){
            ans = "YES";
        }
        System.out.println(ans);
    }
}

/*
Codeforces: 96A - Football
https://codeforces.com/problemset/problem/96/A
*/