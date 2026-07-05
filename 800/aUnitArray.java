import java.util.*;
import java.io.*;
import java.lang.*;

public class aUnitArray{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int neg = 0;
            int pos = 0;
            for(int i = 0;i<n;i++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp<0){
                    neg++;
                }else{
                    pos++;
                }
            }
            if(pos-neg>=0 && neg%2==0){
                System.out.println(0);
                continue;
            }else if(pos>=neg){
                System.out.println(1);
            }else{
                int ans = (neg-pos + 1)/2;
                if((neg-ans)%2!=0){
                    ans += 1;
                }
                System.out.println(ans);
            }
        }
    }
}