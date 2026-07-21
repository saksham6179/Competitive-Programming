import java.io.*;
import java.util.*;
import java.lang.*;

public class aJellyfishAndUndertale{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long totalTime = b-1;
            for(int i = 0;i<n;i++){
                int temp = Integer.parseInt(st.nextToken());
                totalTime += Math.min(a-1,temp);
            }
            totalTime += 1;
            System.out.println(totalTime);
        }
    }
}