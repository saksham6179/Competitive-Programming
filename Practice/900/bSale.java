import java.io.*;
import java.util.*;

public class bSale{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] tvPrices = new int[n];
        for(int i = 0;i<n;i++){
            tvPrices[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tvPrices);
        int maxMoney = 0;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(tvPrices[i]<0 && j<m){
                maxMoney -= tvPrices[i];
                j++;
            }
        }
        System.out.println(maxMoney);
    }
}

/*
Codeforces 34B - Sale
https://codeforces.com/problemset/problem/34/B
*/