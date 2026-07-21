import java.io.*;
import java.util.*;
import java.lang.*;

public class bLongestDivisorsInterval{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            long ans = 0;
            long divisor = 1;
            while(n%divisor == 0 && divisor <= n){
                divisor++;
                ans++;
            }
            System.out.println(ans);
        }
    }
}