import java.io.*;
import java.util.*;

public class aRedVersusBlue{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int split = r/(b+1), extra = r%(b+1);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i<n){
                for(int j = 0;j<split;j++){
                    sb.append('R');
                    i++;
                }
                if(extra>0){
                    extra--;
                    sb.append('R');
                    i++;
                }
                if(b>0){
                    sb.append('B');
                    b--;
                    i++;
                }
            }
            System.out.println(sb.toString());
        }
    }
}

/*
Codeforces: 1659A - Red Versus Blue
https://codeforces.com/problemset/problem/1659/A
*/