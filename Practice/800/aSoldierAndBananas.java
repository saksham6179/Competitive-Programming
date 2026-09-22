import java.io.*;
import java.util.*;

public class aSoldierAndBananas{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken()), n = Long.parseLong(st.nextToken()), w = Long.parseLong(st.nextToken());
        long moneyNeed = k * ((w * (w+1))/2);
        System.out.println(Math.max(0,moneyNeed-n));
    }
}

/*
Codeforces 546A - Soldier and Bananas
https://codeforces.com/problemset/problem/546/A
*/