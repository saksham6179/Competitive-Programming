import java.io.*;
import java.util.*;

public class aILovePercentageUsernamePercentage{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0, min = Integer.parseInt(st.nextToken()), max = min;
        for(int i = 1;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            if(min > num){
                min = num;
                count++;
            }
            if(max < num){
                max = num;
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Codeforces: 155A - I_love_%username%
https://codeforces.com/problemset/problem/155/A
*/