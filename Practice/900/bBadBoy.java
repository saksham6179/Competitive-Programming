import java.io.*;
import java.util.*;
import java.lang.*;

public class bBadBoy{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());
            System.out.println("1 1" + " " + n + " " + m);
        }
    }
}

/*
Codeforces 1537B - Bad Boy
https://codeforces.com/problemset/problem/1537/B
*/