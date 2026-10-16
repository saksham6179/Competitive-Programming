import java.io.*;
import java.util.*;

public class bDrinks{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        for(int i = 0;i<n;i++){
            int percentage = Integer.parseInt(st.nextToken());
            sum += percentage;
        }
        double total = n * 100;
        System.out.println((sum/total) * 100);
    }
}


/*
Codeforces: 200B - Drinks
https://codeforces.com/problemset/problem/200/B
*/