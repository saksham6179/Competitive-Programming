import java.io.*;
import java.util.*;

public class bMEXorMixup{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int xor = 0, count = a;
            if((a-1)%4==0){
                xor = a-1;
            }else if((a-1)%4==1){
                xor = 1;
            }else if((a-1)%4==2){
                xor = a;
            }
            if(xor!=b){
                if((b^xor)==a){
                    count+=2;
                }else{
                    count++;
                }
            }
            
           System.out.println(count);
        }
    }
}

/*
Codeforces: 1567B - MEXor Mixup
https://codeforces.com/problemset/problem/1567/B
*/