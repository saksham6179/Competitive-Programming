import java.io.*;
import java.util.*;

public class GameWithIntegers{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] ans = new String[t];
        for(int i = 0;i<t;i++){
            int num = Integer.parseInt(br.readLine());
            ans[i] = "Second";
            if(num%3>0 && num%3<3){
                ans[i] = "First";
            }
        }
        for(int i = 0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}