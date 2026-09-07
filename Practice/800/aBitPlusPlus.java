import java.io.*;
import java.util.*;

public class aBitPlusPlus{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        while(n-- > 0){
            String s = br.readLine();
            if(s.charAt(2)=='+' || s.charAt(0)=='+'){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}


/*
Codeforces: 282A - Bit++
https://codeforces.com/problemset/problem/282/A
*/
