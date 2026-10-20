import java.io.*;
import java.util.*;

public class aDivisibilityProblem{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), div = a/b;
            if(div * b < a){
                div++;
            }
            System.out.println((div*b)-a);
        }
    }
}

/*
Codeforces: 1328 - Divisibility Problem
https://codeforces.com/problemset/problem/1328/A
*/