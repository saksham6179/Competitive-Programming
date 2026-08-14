import java.io.*;
import java.util.*;
import java.lang.*;

public class bOddGrasshopper{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), ans = 0;
            if(a%2==0){
                if((b/2)%2!=0){
                    if(b%2==0){
                        ans = a +1;
                    }else{
                        ans = a + (((b+1)/4)*4);
                    }
                }else{
                    if(b%2==0){
                        ans = a;
                    }else{
                        ans = a - ((((b+1)/4)*4)+1);
                    }
                }
            }else{
                if((b/2)%2!=0){
                    if(b%2==0){
                        ans = a-1;
                    }else{
                        ans = a - (((b+1)/4)*4);
                    }
                }else{
                    if(b%2==0){
                        ans = a;
                    }else{
                        ans = a + ((((b+1)/4)*4)+1);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces 1607B - Odd Grasshopper
https://codeforces.com/problemset/problem/1607/B
*/