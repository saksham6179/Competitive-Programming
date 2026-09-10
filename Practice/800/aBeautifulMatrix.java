import java.io.*;
import java.util.*;

public class aBeautifulMatrix{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int moves = 0;
        for(int i = 1;i<=5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1;j<=5;j++){
                int num = Integer.parseInt(st.nextToken());
                if(num==1){
                    moves = Math.abs(3-i) + Math.abs(3-j);
                }
            }
        }
        System.out.println(moves);
    }
}

/*
Codeforces: 263A - Beautiful Matrix
https://codeforces.com/problemset/problem/263/A
*/
