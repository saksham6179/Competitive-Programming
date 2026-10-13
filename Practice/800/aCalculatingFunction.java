import java.io.*;
import java.util.*;

public class aCalculatingFunction{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0, oddLast = (n%2==0 ? n-1 : n), evenLast = (n%2==0 ? n : n-1);
        long nn = ((evenLast-1)/2) + 1;
        if(n>1){
            sum = ((2 + evenLast)/2) * nn;
        }
        nn = ((oddLast-1)/2) + 1;
        sum -=  ((1+oddLast)/2) * nn;
        System.out.println(sum);
    }
}

/*
Codeforces: 486A - Calculating Function
https://codeforces.com/problemset/problem/486/A
*/