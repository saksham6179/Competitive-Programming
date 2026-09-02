import java.io.*;
import java.util.*;
import java.lang.*;

public class bMonsters{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
            HashSet<Integer>set = new HashSet<>();
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                int mod = num%k;
                if(mod==0){
                    System.out.print(i+1 + " ");
                    continue;
                }
                if(!map.containsKey(mod)){
                    map.put(mod,new ArrayList<>());
                    set.add(mod);
                }
                map.get(mod).add(i);
            }
            int[] mods = new int[set.size()];
            int m = 0;
            for(int s : set){
                mods[m++] = s;
            }
            Arrays.sort(mods);
            m--;
            while(m>=0){
                for(int i  = 0;i<map.get(mods[m]).size();i++){
                    System.out.print(map.get(mods[m]).get(i) + 1 + " ");
                }
                m--;
            }
            System.out.println();
        }
    }
}

/*
Codeforces 1849B - Monsters
https://codeforces.com/problemset/problem/1849/B
*/