import java.io.*;
import java.util.*;
import java.lang.*;

public class cVasilijeInCacak{
    public static void main(String[] args)throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long firstSum =   ((long)k *((long)k+1))/2;
            long diff = n-k;
            long diffSum = (diff * (diff+1))/2;
            long totalSum =  ((long)n *((long)n+1))/2;
            long lastSum = totalSum - diffSum;
            if(x<firstSum || x>lastSum){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}