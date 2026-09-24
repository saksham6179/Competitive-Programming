import java.io.*;
import java.util.*;

public class aGames{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int[] host = new int[101];
        int[] guest = new int[101];
        host[h]++;
        guest[a]++;
        int count = 0;
        for(int i = 1;i<n;i++){
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            host[h]++;
            guest[a]++;
        }
        for(int i = 0;i<101;i++){
            if(host[i] * guest[i] > 0){
                count+= host[i] * guest[i];
            }
        }
        System.out.println(count);
    }
}

/*
Problem: Codeforces 268A - Games
Link: https://codeforces.com/problemset/problem/268/A
 */