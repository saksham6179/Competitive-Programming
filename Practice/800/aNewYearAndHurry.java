import java.io.*;
import java.util.*;

public class aNewYearAndHurry{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int avlTime = 240 - k;
        int time = 5;
        int count = 0;
        while(count < n && avlTime >= time){
            count++;
            time += (count+1) * 5;
        }
        System.out.println(count);                                                                                                                                                                                                                                                                                                                       
    }
}

/*
Codeforces: 750A - New Year and Hurry
https://codeforces.com/problemset/problem/750/A
*/