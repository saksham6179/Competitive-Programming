import java.io.*;
import java.util.*;

public class aTram{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int noOfPeople = 0, capacity = 0;
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            noOfPeople -= a;
            noOfPeople += b;
            capacity = Math.max(noOfPeople, capacity);
        }
        System.out.println(capacity);
    }
}

/*
Codeforces: 116A - Tram
https://codeforces.com/problemset/problem/116/A
*/