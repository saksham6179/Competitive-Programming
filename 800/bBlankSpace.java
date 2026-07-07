import java.util.*;
import java.io.*;
import java.lang.*;

public class bBlankSpace{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0,temp = 0;
            for(int i = 0;i<n;i++){
                if(Integer.parseInt(st.nextToken())!=0){
                    temp=0;
                    continue;
                }
                ans= Math.max(ans,++temp);
            }
            System.out.println(ans);
        }
    }
}