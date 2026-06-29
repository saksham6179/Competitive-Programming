import java.util.*;
import java.io.*;

public class bCrimsonTriples{
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    static int lcm(int a, int b) {
        return Math.abs(a / gcd(a, b) * b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int u = 0;u<t;u++){
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    for(int k=1;k<=n;k++){
                        if(gcd(lcm(i,j),lcm(j,k))==gcd(i,k)){
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}