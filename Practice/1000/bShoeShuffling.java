import java.io.*;
import java.util.*;

public class bShoeShuffling{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int pre = Integer.parseInt(st.nextToken()), preIndex = 0, count = 1;
            boolean flag = true;
            for(int i = 1;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(flag==true){
                    if(num!=pre){
                        if(count==1){
                            flag = false;
                        }
                        arr[preIndex] = i;
                        pre = num;
                        preIndex = i;
                        count = 1;
                    }else{
                        arr[i] = i;
                        count++;
                    }
                }
            }
            if(count==1){
                flag = false;
            }
            arr[preIndex] = n;
            if(flag){
                for(int i = 0;i<n;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
        }
    }
}

/*
Codeforces 1691B - Shoe Shuffling
https://codeforces.com/problemset/problem/1691/B
*/