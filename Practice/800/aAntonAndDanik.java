import java.io.*;
import java.util.*;

public class aAntonAndDanik{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int anton = 0, danik = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='A'){
                anton++;
            }else{
                danik++;
            }
        }
        if(anton==danik){
            System.out.println("Friendship");
        }else if(anton>danik){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
}

/*
Codeforces: 734A - Anton and Danik
https://codeforces.com/problemset/problem/734/A
*/