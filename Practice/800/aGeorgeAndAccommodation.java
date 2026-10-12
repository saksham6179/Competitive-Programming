import java.io.*;
import java.util.*;

public class aGeorgeAndAccommodation{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            if(q-p >= 2){
                count++;
            }
        }
        System.out.println(count);              
    }
}

/*
Codeforces: 467A - George and Accommodation
https://codeforces.com/problemset/problem/467/A
*/