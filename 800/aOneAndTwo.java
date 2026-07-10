import java.io.*;
import java.util.*;
import java.lang.*;

public class aOneAndTwo{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int product = 1;
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                product *= arr[i];
            }
            int tempProduct = 1;
            int k = -1;
            for(int i = 0;i<n;i++){
                tempProduct *= arr[i];
                if(product/tempProduct==tempProduct){
                    k = i+1;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}