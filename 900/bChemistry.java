import java.io.*;
import java.util.*;
import java.lang.*;

public class bChemistry{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            HashSet<Character> set = new HashSet<>();
            for(int i = 0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    set.remove(s.charAt(i));
                    continue;
                }
                set.add(s.charAt(i));
            } 
            String ans = "NO";
            if(set.size()-1 <= k){
                ans = "YES";
            }
            System.out.println(ans);
        }
    }
}