import java.io.*;
import java.util.*;

public class CoverInWater{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];
        for(int i = 0;i<t;i++){
            int j = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int k= 0;
            while(k<j){
                if(s.charAt(k)=='#'){
                    k++;
                }else if(s.charAt(k)=='.'){
                    int count = 0;
                    while(k<j && s.charAt(k)=='.'){
                        count++;
                        k++;
                    }
                    if(count>2){
                        ans[i] = 2;
                        break;
                    }else{
                        ans[i] += count;
                    }
                }
            }
        }
        for(int i = 0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}