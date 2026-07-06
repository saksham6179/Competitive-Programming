import java.util.*;
import java.io.*;
import java.lang.*;

public class aTwinPermutations{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = n+1;
            for(int i = 0;i<n;i++){
                System.out.print(sum-Integer.parseInt(st.nextToken()) + " ");
            }
            System.out.println();
        }
    }
}