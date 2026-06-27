import java.io.*;
import java.util.*;

public class ADontTryToCount{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l1 = Integer.parseInt(st.nextToken());
            int l2 = Integer.parseInt(st.nextToken());
            String s1 = br.readLine();
            String s2 = br.readLine();
            int count = 0;
            while(s1.length() < l2){
                s1 = s1 + s1;
                count++;
            }
            if(!s1.contains(s2)){
                s1 = s1 + s1;
                count++;
            }
            if(!s1.contains(s2)){
                count= -1;
            }
            System.out.println(count);
        }
    }
}