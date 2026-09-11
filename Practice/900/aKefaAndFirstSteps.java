import java.io.*;
import java.util.*;

public class aKefaAndFirstSteps{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pre = Integer.parseInt(st.nextToken());
        int maxLength = 1;
        int count = 1;
        for(int i = 1;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num<pre){
                maxLength = Math.max(maxLength,count);
                count = 0;
            }
            count++;
            pre = num;
        }
        maxLength = Math.max(maxLength,count);
        System.out.println(maxLength);
    }
}

/*
Codeforces: 580A - Kefa and First Steps
https://codeforces.com/problemset/problem/580/A
*/