import java.io.*;
import java.util.*;

public class aMagnets{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pre = Integer.parseInt(br.readLine()), count = 1;
        for(int i = 1;i<n;i++){
            int curr = Integer.parseInt(br.readLine());
            if(pre%10==curr/10){
                count++;
            }
            pre = curr;
        }
        System.out.println(count);
    }
}

/*
Codeforces: 344A - Magnets
https://codeforces.com/problemset/problem/344/A
*/