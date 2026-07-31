import java.io.*;
import java.util.*;
import java.lang.*;

public class bNotDividing{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(n==1){
                System.out.println(st.nextToken());
                continue;
            }
            int pre = Integer.parseInt(st.nextToken());
            if(pre==1) pre=2;
            for(int i = 1;i<n;i++){
                int current = Integer.parseInt(st.nextToken());
                while(current%pre==0 || current==1){
                    current++;
                }
                System.out.print(pre + " ");
                pre = current;
            }
            System.out.println(pre);
        }
    }
}

/*
Problem: Codeforces 1794B - Not Dividing
Link: https://codeforces.com/problemset/problem/1794/B
*/