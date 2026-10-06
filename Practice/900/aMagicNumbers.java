import java.io.*;
import java.util.*;

public class aMagicNumbers{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag = false;
        int fourCount = 0;
        String ans = "YES";
        while(n>0){
            int d= n%10;
            n=n/10;
            if(d!=1 && d!=4){
                flag = true;
                break;
            }
            if(d==4){
                fourCount++;
                if(fourCount>2){
                    break;
                }
                flag = true;
            }
            if(d==1){
                fourCount = 0;
                flag = false;
            }
        }
        if(flag){
            ans = "NO";
        }
        System.out .println(ans);
    }
}


/*
Codeforces: 320A - Magic Numbers
https://codeforces.com/problemset/problem/320/A
*/
