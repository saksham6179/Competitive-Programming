import java.io.*;
import java.util.*;

public class bQueueAtTheSchool{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        StringBuilder s = new StringBuilder(br.readLine());
        for(int k = 0;k<t;k++){
            for(int i = 0;i<n-1;i++){
                if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
                    s.setCharAt(i,'G');
                    s.setCharAt(i+1,'B');
                    i+=1;
                }
            }
        }
        System.out.println(s.toString());
    }
}

/*
Codeforces: 266B - Queue at the School
https://codeforces.com/problemset/problem/266/B
*/