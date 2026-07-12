import java.io.*;
import java.util.*;
import java.lang.*;

public class aEverybodyLikesGoodArrays{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int preParity = Integer.parseInt(st.nextToken())%2;
            int ans = 0;
            for(int i = 1;i<n;i++){
                int currParity= Integer.parseInt(st.nextToken())%2;
                if(preParity==currParity){
                    ans++;
                    continue;
                }
                preParity = currParity;
            }
            System.out.println(ans);
        }
    }
}