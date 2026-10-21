import java.io.*;
import java.util.*;

public class bKanaAndDragonQuestGame{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            while(x>10 && n>0){
                x /= 2;
                if(x<=10){
                    x+= 10;
                    break;
                }
                x+= 10;
                n--;
            }
            x -= (10 * m );
            if(x <= 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

/*
Codeforces: 1337B - Kana and Dragon Quest Game
https://codeforces.com/problemset/problem/1337/B
*/