import java.io.*;
import java.util.*;

public class bRoofConstruction{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            n--;
            int pow = 1;
            while(pow <= n){
                pow = pow<<1;
            }
            pow /= 2;
            for(int i = n;i>=pow;i--){
                System.out.print(i + " ");
            }
            System.out.print(0 + " ");
            for(int i = 1;i<pow;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Codeforces: 1632B - Roof Construction
https://codeforces.com/problemset/problem/1632/B
*/