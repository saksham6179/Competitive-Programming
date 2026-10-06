import java.io.*;
import java.util.*;

public class bDivanAndANewProject{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] order = new int[n];
            HashMap<Integer,Deque<Integer>>map = new HashMap<>();
            HashMap<Integer,Integer>arrMap = new HashMap<>();
            HashSet<Integer>set = new HashSet<>();
            for(int i= 0;i<n;i++){
                order[i] = Integer.parseInt(st.nextToken());
                set.add(order[i]);
                arrMap.put(order[i],arrMap.getOrDefault(order[i],0) + 1);
            }
            int[] arr = new int[set.size()];
            int k = 0;
            for(int s : set){
                arr[k++] = s;
            }
            Arrays.sort(arr);
            int m = n/2;
            k = 0;
            long ans = 0;
            if(n%2==1){
                map.put(arr[k],new ArrayDeque<>());
                map.get(arr[k]).offerLast(m+1);
                arrMap.put(arr[k],arrMap.get(arr[k])-1);
                ans += 2 * (m+1) * arr[k];
            }
            while(m>0){
                if(arrMap.get(arr[k])==0){
                    k++;
                }
                if(!map.containsKey(arr[k])){
                    map.put(arr[k],new ArrayDeque<>());
                }
                map.get(arr[k]).offerLast(m);
                arrMap.put(arr[k],arrMap.get(arr[k])-1);
                ans+= (2 * (long)m * arr[k]);
                if(arrMap.get(arr[k])==0){
                    k++;
                }
                if(!map.containsKey(arr[k])){
                    map.put(arr[k],new ArrayDeque<>());
                }
                map.get(arr[k]).offerLast(m * -1);
                arrMap.put(arr[k],arrMap.get(arr[k])-1);
                ans+= (2 * (long)m * arr[k]);
                m--;
            }
            for(int i = 0;i<n;i++){
                int value = map.get(order[i]).pollFirst();
                order[i] = value;
            }
            System.out.println(ans);
            System.out.print(0 + " ");
            for(int i = 0;i<n;i++){
                System.out.print(order[i] + " ");
            }
            System.out.println();
        }
    }
}

/*
Codeforces: 1614B - Divan and a New Project
https://codeforces.com/problemset/problem/1614/B
*/