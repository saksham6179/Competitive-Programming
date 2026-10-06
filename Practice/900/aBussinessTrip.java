import java.io.*;
import java.util.*;

public class aBussinessTrip{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[12];
        for(int i = 0;i<12;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i = 11;i>=0 && sum<k;i--){
            sum+= arr[i];
            count++;
        }
        System.out.println((sum<k?-1 : count));
    }
}

/*
Codeforces: 149A - Business trip
https://codeforces.com/problemset/problem/149/A
*/