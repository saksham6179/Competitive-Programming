import java.io.*;
import java.util.*;

public class aAddAndDivide{
    public static int findCount(int a,int b){
       int count = Integer.MAX_VALUE;
       for(int i = 0;i<31;i++){
            if(b+i==1){
                continue;
            }
            int m = a;
            int tempCount = i;
            while(m>0){
                m /= (b+i);
                tempCount++;
            }
            count= Math.min(tempCount,count);
       }
       return count;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            System.out.println(findCount(a,b));
        }
    }
}

/*
Codeforces: 1485A - Add and Divide
https://codeforces.com/problemset/problem/1485/A
*/