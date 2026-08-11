import java.io.*;
import java.util.*;
import java.lang.*;

public class dDeletiveEditing{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder str = new StringBuilder(st.nextToken());
            String s = st.nextToken();
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(int i = str.length()-1;i>=0;i--){
                char ch = str.charAt(i);
                if(!map.containsKey(ch) || map.get(ch)==0){
                    str.deleteCharAt(i);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            String ans = "NO";
            if(s.equals(str.toString())){
                ans = "YES";
            }
            System.out.println(ans);
        }
    }
}
 
/*
Codeforces: 1666D - Deletive Editing
https://codeforces.com/problemset/problem/1666/D
*/