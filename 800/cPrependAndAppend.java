import java.io.*;
import java.util.*;
import java.lang.*;

public class cPrependAndAppend{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int i = 0;
            int j = n-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                i++;
                j--;
                n-=2;
            }
            System.out.println(n);
        }
    }
}