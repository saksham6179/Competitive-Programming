import java.io.*;
import java.util.*;

public class aPresents{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] friends = new int[n];
        for(int i = 0;i<n;i++){
            int To = Integer.parseInt(st.nextToken());
            friends[To-1] = i+1;
        }
        for(int i = 0;i<n;i++){
            System.out.print(friends[i] + " ");
        }
        System.out.println();
    }
}

/*
Codeforces: 136A - Presents
https://codeforces.com/problemset/problem/136/A
*/