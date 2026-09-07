import java.io.*;
import java.util.*;

public class aTwins{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int tempSum = 0, count = 0;
        for(int i = n-1;i>=0;i--){
            if(tempSum > sum){
                break;
            }
            tempSum += arr[i];
            sum -= arr[i];
            count++;
        }
        System.out.println(count);
    }
}

/*
Codeforces: 160A - Twins
https://codeforces.com/problemset/problem/160/A
*/