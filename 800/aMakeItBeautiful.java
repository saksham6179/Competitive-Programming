import java.io.*;
import java.util.*;
import java.lang.*;

public class aMakeItBeautiful{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0]==arr[n-1]){
                System.out.println("NO");
                continue;
            }
            int last = arr[n-1];
            for(int i = n-1;i>0;i--){
                arr[i]= arr[i-1];
            }
            arr[0] = last;
            System.out.println("YES");
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}