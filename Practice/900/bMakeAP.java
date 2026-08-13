import java.io.*;
import java.util.*;
import java.lang.*;

public class bMakeAP{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            String ans = "NO";
            if(b<a && b<c){
                if((a+c)%2==0 && ((a+c)/2)%b==0){
                    ans = "YES";
                }
            }else if(b>a && b>c){
                int temp1 = b-a;
                int temp2 = b-c;
                if(((b+temp1)%c==0) || ((b+temp2)%a==0)){
                    ans = "YES";
                }
            }else{
                int max = Math.max(a,c), min = Math.min(a,c), temp1 = max-b, temp2 = b-min;
                if((a+c)%2==0 && ((a+c)/2)%b==0){
                    ans = "YES";
                }else if(((b-temp1)>0 &&(b-temp1)%min==0 || (b+temp2)%max==0)){
                    ans = "YES";
                }
            }
            System.out.println(ans);
        }
    }
}

/*
1624B - Make AP
https://codeforces.com/problemset/problem/1624/B
*/