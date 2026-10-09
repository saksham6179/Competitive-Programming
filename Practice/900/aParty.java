import java.io.*;
import java.util.*;

public class aParty{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
        int height = -1;
        for(int i = 0;i<n;i++){
            int manager = Integer.parseInt(br.readLine());
            if(!map.containsKey(manager)){
                map.put(manager,new ArrayList<>());
            }
            map.get(manager).add(i+1);
        }
        Queue<Integer>queue = new ArrayDeque<>();
        queue.offer(-1);
        queue.offer(0);
        while(!queue.isEmpty()){
            int manager = queue.poll();
            if(manager==0){
                height++;
                if(!queue.isEmpty()){
                    queue.offer(0);
                }
                continue;
            }
            if(!map.containsKey(manager)){
                continue;
            }
            for(int i = 0;i<map.get(manager).size();i++){
                queue.offer(map.get(manager).get(i));
            }
        }
        System.out.println(height);
    }
}

/*
Codeforces: 115A - Party
https://codeforces.com/problemset/problem/115/A
*/