import java.io.*;
import java.util.*;

public class aHelpfulMaths{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] count = new int[5];
        for(int i = 0;i<s.length();i+=2){
            if(s.charAt(i)=='1'){
                count[0]++;
            }else if(s.charAt(i)=='2'){
                count[1]++;
            }else{
                count[2]++;
            }
        }
        boolean flag = false;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<count[i];j++){
                flag = true;
                System.out.print((i+1));
                if(j+1!=count[i]){
                    System.out.print("+");
                }
            }
            if(count[i+1]>0 && flag){
                System.out.print("+");
            }
        }
        System.out.println();
    }
}

/*
Codeforces: 339A - Helpful Maths
https://codeforces.com/problemset/problem/339/A
*/
