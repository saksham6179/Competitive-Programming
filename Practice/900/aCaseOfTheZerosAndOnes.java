import java.io.*;
import java.util.*;

public class aCaseOfTheZerosAndOnes{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int ones = 0, zeros = 0;
        for(int i= 0;i<n;i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }else{
                ones++;
            }
        }
        System.out.println(n - ((ones + zeros) - Math.abs(ones-zeros)));
    }
}

/*
Codeforces: 556A - Case of the Zeros and Ones
https://codeforces.com/problemset/problem/556/A
*/