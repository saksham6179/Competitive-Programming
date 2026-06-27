import java.util.*;
import java.io.*;

public class ALineTrip{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];
        for(int i = 0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int[] line = new int[n];
            st = new StringTokenizer(br.readLine());
            int max = 0;
            int longDist = 0;
            for(int j = 0;j<n;j++){
                int temp = Integer.parseInt(st.nextToken());
                if(longDist < (temp-max)){
                    longDist = temp-max;
                }
                max = temp;
            }
            ans[i] = Math.max(longDist,((x-max)*2));
        }
        for(int i = 0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}