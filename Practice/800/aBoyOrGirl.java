import java.io.*;
import java.util.*;

public class aBoyOrGirl{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<Character>set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}

/*
Codeforces: 236A - Boy or Girl
https://codeforces.com/problemset/problem/236/A
*/