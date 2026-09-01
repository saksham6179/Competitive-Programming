import java.io.*;
import java.util.*;
import java.lang.*;

public class bOlyaAndGameWithArrays{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][];
            for(int i= 0;i<n;i++){
                int m = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i] = new int[m];
                for(int j = 0;j<m;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int firstColMin = Integer.MAX_VALUE, secondColMin = firstColMin;
            long ans = 0;
            for(int i = 0;i<n;i++){
                int firstMin = arr[i][0], secondMin = -1;
                for(int j = 1;j<arr[i].length;j++){
                    if(arr[i][j]<firstMin){
                        secondMin = firstMin;
                        firstMin = arr[i][j];
                    }else if(arr[i][j]<secondMin || secondMin==-1){
                        secondMin = arr[i][j];
                    }
                }
                ans += (long)secondMin;
                secondColMin = Math.min(secondColMin,secondMin);
                firstColMin = Math.min(firstColMin,firstMin);
            }
            ans -= secondColMin;
            ans += firstColMin;
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1859B - Olya and Game with Arrays
https://codeforces.com/problemset/problem/1859/B
*/