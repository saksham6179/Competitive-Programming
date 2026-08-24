import java.io.*;
import java.util.*;
import java.lang.*;


public class aStrangePartition{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken()), sum = 0,max = 0, min = 0;
            st = new StringTokenizer(br.readLine());
            for(int i = 0;i<n;i++){
                long num  = Long.parseLong(st.nextToken());
                if(num%x==0){
                    min += (num/x);
                }else{
                    sum += num;
                }
                max += (num%x==0)?num/x : ((num/x) + 1);
            }
            if(sum>0){
                min += (sum/x) + (sum%x==0?0:1);
            }
            System.out.println(min + " " + max);
        }
    }
}

/*
Codeforces 1471A - Strange Partition
https://codeforces.com/problemset/problem/1471/A
*/