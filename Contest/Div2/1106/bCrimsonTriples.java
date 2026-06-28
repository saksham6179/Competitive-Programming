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
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(1,1);
        int max = 1;
        for(int u = 0;u<t;u++){
            int n = Integer.parseInt(br.readLine());
            int i = 1;
            int ans = 0;
            if(n<=max){
                for(int m =n;m>0;m--){
                    if(hm.contains(m)){
                        i = m+1;
                        ans = hm.get(m);
                        break;
                    }
                }
            }else{
                i = max+1;
                ans = hm.get(max);
            }
            for(i;i<=n;i++){
                for(int j = 1;j<=n;j++){
                    for(int k=1;k<=n;k++){
                        if(gcd(lcm(i,j),lcm(j,k))==gcd(i,k)){
                            ans++;
                        }
                    }
                }
            }
            if(!hm.contains(n)){
                hm.put(n,ans);
            }
            if(max<n){
                max = n;
            }
            System.out.println(ans);
        }
    }
}