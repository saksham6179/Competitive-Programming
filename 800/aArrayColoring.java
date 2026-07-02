import java.io.*;
import java.util.*;
import java.lang.*;

public class aArrayColoring{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int oddCount = 0;
            String ans = "YES";
            for(int i = 0;i<n;i++){
                if(Integer.parseInt(st.nextToken())%2!=0){
                    oddCount++;
                }
            }
            if(oddCount%2!=0){
                ans = "NO";
            }
            System.out.println(ans);
        }
    }
}