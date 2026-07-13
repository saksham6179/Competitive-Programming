import java.io.*;
import java.util.*;
import java.lang.*;

public class aTwoPermutations{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            System.out.println((n-b-a > 1 || n==a && a==b)? "YES" : "NO");
        }
    }
}