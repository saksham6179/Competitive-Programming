import java.io.*;
import java.util.*;
import java.lang.*;

public class bArrayCloningTechnique{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            for(int i = 0;i<n;i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);
            int max = 1, tempMax = 1, ans = 0;
            for(int i = 1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                    tempMax = 0;
                }
                max = Math.max(max,++tempMax);
            }
            while(n > max){
                ans++;
                if(n >= (max *2)){
                    ans += max;
                    max *= 2;
                }else{
                    ans += (n-max);
                    max = n;
                }
            }
            System.out.println(ans);
        }
    }
}

/*
    Codeforces 1665B - Array Cloning Technique
    https://codeforces.com/problemset/problem/1665/B
*/