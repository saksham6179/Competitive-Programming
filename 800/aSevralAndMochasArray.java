import java.util.*;
import java.io.*;
import java.lang.*;

public class aSevralAndMochasArray{
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            String ans = "NO";
            for(int i= 0;i<n-1;i++){
                for(int j = i+1;j<n;j++){
                    if(gcd(arr[i],arr[j])<=2){
                        ans ="YES";
                        break;
                    }
                }
                if(ans.equals("YES")){
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}