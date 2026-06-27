import java.io.*;
import java.util.*;

public class ADoremysPaint3{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ans = "YES";
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j = 0;j<n;j++){
                int temp = Integer.parseInt(st.nextToken());
                if(ans.equals("YES")){
                    hm.put(temp,hm.getOrDefault(temp,0)+1);
                    if(hm.size()>2){
                        ans = "NO";
                    }
                }
            }
            if(hm.size()==2){
                int dif = 0;
                for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
                    dif += entry.getValue();
                    dif *= -1;
                }
                if(dif<-1 || dif> 1){
                    ans= "NO";
                }
            }
            System.out.println(ans);
        }
    }
}