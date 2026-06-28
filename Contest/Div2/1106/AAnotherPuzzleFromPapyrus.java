import java.io.*;
import java.util.*;

public class AAnotherPuzzleFromPapyrus{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k = 0;k<t;k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[n];
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            StringTokenizer stt = new StringTokenizer(br.readLine());
            boolean flag = true;
            for(int i = 0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                b[i]= Integer.parseInt(stt.nextToken());
                if(a[i]-b[i]<0){
                    flag=false;
                    ans = Integer.MAX_VALUE;
                }
                if(flag){
                    ans += (a[i]-b[i]);
                }
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int tempAns = c;
            for(int i = 0;i<n;i++){
                if(a[i]-b[i]<0){
                    ans = -1;
                    break;
                }
                tempAns += (a[i]-b[i]);
            }
            if(ans!=-1){
                ans = Math.min(ans,tempAns);
            }
            System.out.println(ans);
        }
    }
}