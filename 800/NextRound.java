import java.util.*;
import java.io.*;

public class NextRound{
    public static int bs(int[] arr,int low,int high,int k){
        if(low>high){
            return 0;
        }
        int mid = low + (high-low)/2;
        if(arr[mid]>=k && arr[mid]>0){
            if(mid+1 == arr.length || (arr[mid+1]<k || arr[mid+1]==0)){
                return mid+1;
            }
            return bs(arr,mid+1,high,k);
        }
        return bs(arr,low,mid-1,k);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];
        for(int i = 0;i<n;i++){
            scores[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(bs(scores,0,n-1,scores[k-1]));
    }
}