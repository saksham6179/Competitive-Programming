import java.io.*;
import java.util.*;
import java.lang.*;

public class aDesorting{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            int ans = Integer.MAX_VALUE;
            for(int i = 1;i<n;i++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp<pre || ans==0){
                    ans = 0;
                    continue;
                }
                ans = Math.min(ans,((temp-pre)/2)+1);
                pre = temp;
            }
            System.out.println(ans);
        }
    }
}