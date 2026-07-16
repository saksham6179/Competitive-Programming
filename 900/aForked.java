import java.io.*;
import java.util.*;
import java.lang.*;
 
public class aForked{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int kX = Integer.parseInt(st.nextToken()), kY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int qX = Integer.parseInt(st.nextToken()), qY = Integer.parseInt(st.nextToken());
            int ans = 0;
            int xAxisDiff = Math.abs(kX-qX);
            int yAxisDiff = Math.abs(kY-qY);
            if(Math.min(xAxisDiff,yAxisDiff)==0){
              int dif = Math.max(xAxisDiff,yAxisDiff);
              if(dif%2==0 && (dif/2==a || dif/2==b)){
                ans =2;
              }
            }
            if(kX+a == qX+b || kX+a == qX-b){
                if(kY+b == qY-a || kY+b == qY+a){
                    ans = 2;
                }else if(kY-b == qY-a || kY-b == qY+a){
                    ans = 2;
                }
            }
            if(kX-a == qX+b || kX-a == qX-b){
                if(kY+b == qY-a || kY+b == qY+a){
                    ans = 2;
                }else if(kY-b == qY-a || kY-b == qY+a){
                    ans = 2;
                }
            }
            if(kX+b == qX+a || kX+b == qX-a){
                if(kY+a == qY-b || kY+a == qY+b){
                    ans = 2;
                }else if(kY-a == qY-b || kY-a == qY+b){
                    ans = 2;
                }
            }
            if(kX-b == qX+a || kX-b == qX-a){
                if(kY+a == qY-b || kY+a == qY+b){
                    ans = 2;
                }else if(kY-a == qY-b || kY-a == qY+b){
                    ans = 2;
                }
            }
            if((xAxisDiff/2== a && yAxisDiff/2==b) || (xAxisDiff/2==b && yAxisDiff/2==a)){
                ans = 1;
            }
            System.out.println(ans);
        }
    }
}