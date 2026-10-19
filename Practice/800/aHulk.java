import java.io.*;
import java.util.*;

public class aHulk{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i<n;i++){
            if(i%2==0){
                System.out.print("I hate ");
            }else{
                System.out.print("I love ");
            }
            if(i!=n-1){
                System.out.print("that ");
            }
        }
        System.out.println("it");
    }
}

/*
Codeforces: 705A - Hulk
https://codeforces.com/problemset/problem/705/A
*/