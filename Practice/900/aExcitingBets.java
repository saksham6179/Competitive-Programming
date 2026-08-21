import java.io.*;
import java.util.*;
import java.lang.*;

public class aExcitingBets{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
            long excitement = Math.abs(a-b), moves = 0;
            if(excitement <= Math.min(a,b)){
                moves = (excitement==0)?0 :Math.min(a,b)%excitement;
                moves = Math.min(moves,excitement-moves);
            }else{
                moves = Math.min(excitement-Math.min(a,b),Math.max(a,b)-excitement);
            }
            System.out.println(excitement + " " + moves);
        }
    }
}

/*
Codeforces 1543A - Exciting Bets
https://codeforces.com/problemset/problem/1543/A
*/
