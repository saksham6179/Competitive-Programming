import java.io.*;
import java.util.*;

public class bBasketballTogether{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] powers = new int[n];
        for(int i = 0;i<n;i++){
            powers[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        Arrays.sort(powers);
        int start = 0, end = n-1;
        int teamScore = powers[end];
        while(start<end){
            if(teamScore>d){
                count++;
                end--;
                teamScore = powers[end];
            }else{
                start++;
                teamScore += powers[end];
            }
        }
        if(teamScore>d){
            count++;
        }
        System.out.println(count);
    }
}

/*
Codeforces 1725B - Basketball Together
https://codeforces.com/problemset/problem/1725/B
*/