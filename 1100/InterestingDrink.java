import java.util.*;
import java.io.*;

public class InterestingDrink{
    public static int bs(int[]prizes,int low,int high,int budget){
        if(low>high){
            return 0;
        }
        int mid = low + (high-low)/2;
        if(budget>=prizes[mid]){
            if(mid+1 == prizes.length|| budget<prizes[mid+1]){
                return mid+1;
            }
            return bs(prizes,mid+1,high,budget);
        }
        return bs(prizes,low,mid-1,budget);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] prizes = new int[n];
        for(int i = 0;i<n;i++){
            prizes[i] = Integer.parseInt(st.nextToken());
        }
        int d = Integer.parseInt(br.readLine());
        int[] budget = new int[d];
        for(int i = 0;i<d;i++){
            budget[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prizes);
        for(int i = 0;i<d;i++){
            System.out.println(bs(prizes,0,n-1,budget[i]));
        }
    }
}