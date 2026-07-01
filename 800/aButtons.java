import java.io.*;
import java.util.*;
import java.lang.*;

public class aButtons{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            a += Integer.parseInt(st.nextToken())%2;
            String ans = "First";
            if(b>=a){
                ans = "Second";
            }
            System.out.println(ans);
        }
    }
}