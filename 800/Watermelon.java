import java.util.*;
import java.io.*;

public class Watermelon{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());
        String ans = "NO";
        if(weight%2==0 && weight>2){
            ans = "YES";
        }
        System.out.println(ans);
    }
}