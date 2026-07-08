import java.util.*;
import java.io.*;
import java.lang.*;

public class aWalkingMaster{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if(d-b >=0){
                a+= (d-b);
                if(a-c >=0 ){
                    System.out.println((d-b)+(a-c));
                    continue;
                }
            }
            System.out.println(-1);
        }
    }
}