import java.io.*;
import java.util.*;

public class aUnitedWeStand{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = Integer.parseInt(st.nextToken());
            int maxNo = 1;
            int[] a = new int[n];
            int k = 0;
            for(int j = 1;j<n;j++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp>max){
                    for(int l= 0;l<maxNo;l++){
                        a[k++]=max;
                    }
                    max = temp;
                    maxNo = 1;
                    continue;
                }
                if(temp==max){
                  maxNo++;
                  continue;
                }
                a[k++] = temp;
            }
            if(maxNo==n){
                System.out.println(-1);
            }else{
                System.out.println(k + " " + maxNo);
                for(int j = 0;j<k;j++){
                    System.out.print(a[j] + " ");
                }
                System.out.println();
                for(int j = 0;j<maxNo;j++){
                    System.out.print(max + " ");
                }
                System.out.println();
            }
        }
    }
}