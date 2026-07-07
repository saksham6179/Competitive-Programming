import java.util.*;
import java.lang.*;
import java.io.*;

public class aCoins{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if(n%2==0 || k%2==1){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}