import java.io.*;
import java.util.*;

public class aPuzzles{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] pieces = new int[m];
        for(int i = 0;i<m;i++){
            pieces[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pieces);
        int ans = pieces[n-1] - pieces[0];
        for(int i = 1;i<m-n+1;i++){
            ans = Math.min(ans,pieces[(i+n)-1]-pieces[i]);
        }
        System.out.println(ans);
    }
}

/*
Codeforces 337A - Puzzles
https://codeforces.com/problemset/problem/337/A
*/