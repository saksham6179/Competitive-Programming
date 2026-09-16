import java.io.*;
import java.util.*;

public class aDubStep{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean flag = false;
        StringBuilder song = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            if((s.length()-i)<3){
                song.append(s.substring(i,s.length()));
                break;
            }
            String str = s.substring(i,i+3);
            if(!str.equals("WUB")){ 
                song.append(s.charAt(i));
                flag = true;
                i++;
            }else{
                if(flag){
                    flag = false;
                    song.append(' ');
                 }
                i+=3;
            }
        }
        System.out.println(song.toString());
    }
}


/*
Codeforces 208A - Dubstep
https://codeforces.com/problemset/problem/208/A
*/
