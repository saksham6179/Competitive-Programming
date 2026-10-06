import java.io.*;
import java.util.*;

public class bTrianglesOnARectangle{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
            long ans = 0;
            for(int i = 0;i<4;i++){
                st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());
                for(int j = 2;j<k;j++){
                    last = Integer.parseInt(st.nextToken());
                }
                ans = Math.max(ans,(last-first)* (long)(i<2?h:w));
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1620B - Triangles on a Rectangle
https://codeforces.com/problemset/problem/1620/B
*/