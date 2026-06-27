import java.util.*;
import java.io.*;

public class HalloumiBoxes{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String[] ans = new String[k];
        for(int i= 0;i<k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            if(l>=2){
                ans[i]= "YES";
            }else{
                ans[i]="YES";
                int num = Integer.parseInt(st.nextToken());        
                for(int m = 1;m<n;m++){
                    int temp = Integer.parseInt(st.nextToken());
                    if(num>temp){
                        ans[i]= "NO";
                        break;

                    }
                    num = temp;
                }
            }
        }
        for(int i = 0;i<k;i++){
            System.out.println(ans[i]);
        }
    }
}