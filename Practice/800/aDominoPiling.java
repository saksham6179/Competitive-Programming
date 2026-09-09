import java.io.*;
import java.util.*;

public class aDominoPiling{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        System.out.println((m*n)/2);
    }
}

/*
Codeforces: 50A - Domino piling
https://codeforces.com/problemset/problem/50/A
*/