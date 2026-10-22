import java.io.*;
import java.util.*;

public class bFollowingTheString{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int count = 0;
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i]==0){
                    count++;
                }
            }
            HashSet<Character>set = new HashSet<>();
            for(int i = 97;i<97+count;i++){
                set.add((char)i);
            }
            char[] string = new char[n];
            for(char c : set){
                int k = 0;
                for(int i = 0;i<n;i++){
                    if(k==arr[i]){
                        arr[i] = -1;
                        string[i] = c;
                        k++;
                    }
                }
            }
            for(int i = 0;i<n;i++){
                System.out.print(string[i]);
            }
            System.out.println();
        }
    }
}

/*
Problem: Codeforces 1927B - Following the String
Link: https://codeforces.com/problemset/problem/1927/B
*/