import java.io.*;
import java.util.*;

public class aPetyaAndStrings{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine(), s2 = br.readLine();
        int ans = 0;
        for(int i = 0;i<s1.length();i++){
            int ch1 = (int)s1.charAt(i);
            int ch2 = (int)s2.charAt(i);
            ch1 = (ch1>90)?ch1-32 :  ch1;
            ch2 = (ch2>90)?ch2-32 : ch2;
            if(ch1 < ch2){
                ans = -1;
                break;
            }
            if(ch2 < ch1){
                ans = 1;
                break;
            }
        }
        System.out.println(ans);
    }
}

/*
Codeforces: 112A - Petya and Strings
https://codeforces.com/problemset/problem/112/A
*/