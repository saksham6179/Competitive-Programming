import java.io.*;
import java.util.*;
import java.lang.*;

public class aOneAndTwo{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer>twoCount = new HashMap<>();
            int count = 0;
            twoCount.put(0,0);
            for(int i = 0;i<n;i++){
              if(Integer.parseInt(st.nextToken())==2){
                count++;
                twoCount.put(count,i);
              }
            }
            System.out.println((count%2==0)?twoCount.get((count/2))+1 : -1);
        }
    }
}