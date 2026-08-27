import java.io.*;
import java.util.*;
import java.lang.*;

public class b01Game{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            int count = 0;
            Stack<Character>stack = new Stack<>();
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(!stack.isEmpty() && stack.peek()!=ch){
                    stack.pop();
                    count++;
                }else{
                    stack.push(s.charAt(i));
                }
            }
            System.out.println((count%2==0?"NET" : "DA"));
        }
    }
} 

/*
Codeforces 1373B - 01 Game
https://codeforces.com/problemset/problem/1373/B
*/