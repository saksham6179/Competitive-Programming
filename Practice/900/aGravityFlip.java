import java.io.*;
import java.util.*;

public class aGravityFlip{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] noOfBox = new int[n];
        for(int i = 0;i<n;i++){
            noOfBox[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(noOfBox);
        for(int i = 0;i<n;i++){
            System.out.print(noOfBox[i] + " ");
        }
        System.out.println();
    }
}

/*
Codeforces: 405A - Gravity Flip
https://codeforces.com/problemset/problem/405/A
*/