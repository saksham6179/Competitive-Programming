import java.io.*;
import java.util.*;

public class aGameWithSticks{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        if(Math.min(n,m)%2==0){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }
    }
}

/*
Codeforces 451A - Game With Sticks
https://codeforces.com/problemset/problem/451/A
*/
