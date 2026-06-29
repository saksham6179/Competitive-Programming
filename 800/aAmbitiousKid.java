import java.io.*;
import java.util.*;

public class aAmbitiousKid{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            int dif = Math.abs(Integer.parseInt(st.nextToken()));
            if(dif<ans){
                ans = dif;
            }
        }
        System.out.println(ans);
    }
}