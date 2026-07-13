import java.io.*;
import java.util.*;
import java.lang.*;

public class aExtremelyRound{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            while(n>99){
                ans += 9;
                n /= 10;
            }
            ans += (n>9)? n/10+9 : n%10;
            System.out.println(ans);
        }
    }
}