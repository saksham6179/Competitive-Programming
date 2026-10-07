import java.io.*;
import java.util.*;

public class cDoubleEndedStrings{
    public static boolean valid(int mid,String a,String b){
        for(int i = 0;i<a.length()-mid+1;i++){
            String A = a.substring(i,i+mid);
            for(int j = 0;j<b.length()-mid+1;j++){
                String B = b.substring(j,j+mid);
                if(A.equals(B)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String a = br.readLine(), b = br.readLine();
            int max = Math.min(a.length(),b.length()), min = 0, maxCommon = 0;
            while(min <= max){
                int mid = (max + min)/2;
                if(valid(mid,a,b)){
                    maxCommon = mid;
                    min = mid+1;
                }else{
                    max = mid-1;
                }
            }
            System.out.println((a.length() + b.length()) - maxCommon * 2);
        }
    }
}

/*
Codeforces: 1506C - Double-ended Strings
https://codeforces.com/problemset/problem/1506/C
*/