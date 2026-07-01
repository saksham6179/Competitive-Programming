import java.io.*;
import java.util.*;

public class bSequenceGame{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] ans = new int[n*2];
            int pre = Integer.parseInt(st.nextToken());
            ans[0] = pre;
            int k = 1;
            for(int j =1;j<n;j++){
                int temp= Integer.parseInt(st.nextToken());
                if(pre>temp){
                    ans[k++] = temp;
                }
                pre = temp;
                ans[k++] = pre;
            }
            System.out.println(k);
            for(int j = 0;j<k;j++){
                System.out.print(ans[j] + " ");
            }
            System.out.println("");
        }
    }
}