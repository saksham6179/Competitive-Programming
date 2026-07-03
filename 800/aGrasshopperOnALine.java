import java.io.*;
import java.util.*;
import java.lang.*;

public class aGrasshopperOnALine{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if(k>x || x%k!=0){
                System.out.println(1 + "\n" + x);
                continue;
            }
            System.out.println(2 + "\n" + (x-1) + " " + 1);
        }
    }
}