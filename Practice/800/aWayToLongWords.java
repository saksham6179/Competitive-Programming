import java.io.*;
import java.util.*;

public class aWayToLongWords{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            if(s.length()>10){
                System.out.println(s.charAt(0) + "" + (s.length()-2) + "" +  s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        }
    }
}

/*
Codeforces: 71A - Way Too Long Words
https://codeforces.com/problemset/problem/71/A
*/
