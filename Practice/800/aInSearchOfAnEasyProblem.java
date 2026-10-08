import java.io.*;
import java.util.*;

public class aInSearchOfAnEasyProblem{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = false;
        for(int i = 0;i<n;i++){
            if(Integer.parseInt(st.nextToken())==1){
                flag = true;
            }
        }
        if(flag){
            System.out.println("HARD");
        }else{
            System.out.println("EASY"); 
        }
    }
}

/*
Codeforces: 1030A - In Search of an Easy Problem
https://codeforces.com/problemset/problem/1030/A
*/