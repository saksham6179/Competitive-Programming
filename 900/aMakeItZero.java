import java.io.*;
import java.util.*;
import java.lang.*;

public class aMakeItZero{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String ele  = br.readLine();
            if(n%2!=0){
                System.out.println(4);
                System.out.println(1 + " " + 2);
                System.out.println(1 + " " + 2);
                System.out.println(2 + " " + n);
                System.out.println(2 + " " + n);
                continue;
            }
            System.out.println(2);
            System.out.println(1 + " " + n);
            System.out.println(1 + " " + n);
        }
    }
}