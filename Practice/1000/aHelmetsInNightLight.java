import java.io.*;
import java.util.*;
import java.lang.*;
 
public class aHelmetsInNightLight{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
            int[] res = new int[n]; 
            st = new StringTokenizer(br.readLine());
            for(int i = 0;i<n;i++){
                res[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            HashSet<Integer>set = new HashSet<>();
	        HashMap<Integer,Long>ResMap = new HashMap<>();
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(num < p){
                    set.add(num);
		            ResMap.put(num,ResMap.getOrDefault(num,(long)0)+res[i]);
                }
            }
            int m = 0;
            int[] arr = new int[set.size()];
            for(int s : set){
                arr[m++] = s;
            }
            Arrays.sort(arr);
            long ans = p;
            long k = n-1;
            for(int i = 0;i<m;i++){
                if(k==0){
                    break;
                }
                if(ResMap.get(arr[i]) < k){
                    ans += (ResMap.get(arr[i]) * arr[i]);
                    k -= ResMap.get(arr[i]);
                }else{
                    ans += (k * (long)arr[i]);
                    k = 0;
                }
	        }
	        ans += (k * p);
            System.out.println(ans);
        }
    }
}