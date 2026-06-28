import java.io.*;
import java.util.*;

public class CTargetPractice{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0;i<t;i++){
            int ans = 0;
            for(int j = 0;j<10;j++){
                String row  = br.readLine();
                for(int k = 0;k<10;k++){
                    if(row.charAt(k)=='X'){
                        int t = j - 0;
                        int b = 9 - j;
                        int l = k - 0;
                        int r = 9 - k;
                        ans += Math.min(Math.min(t,b),Math.min(t,b));
                    }
                }
            }
          System.out.println(ans);
        }
    }
}