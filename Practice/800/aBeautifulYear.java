import java.io.*;
import java.util.*;

public class aBeautifulYear{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder year = new StringBuilder(br.readLine());
        int[] digits = new int[11];
        boolean flag = false;
        int iterator = 0;
        for(int i = 0;i<4;i++){
            int ch = (int)year.charAt(i) - (int)'0';
            if(digits[ch]>0 && !flag){
                flag = true;
                while(digits[ch]>0){
                    ch++;
                }
                while(ch==10){
                    i--;
                    ch = (int)year.charAt(i) - (int)'0';
                    digits[ch] = 0;
                    ch+=1;
                    while(digits[ch]>0){
                        ch++;
                    }
                    if(ch<10){
                        break;
                    }
                }
                digits[ch]++;
                ch = (int)'0' + ch;
                year.setCharAt(i,(char)ch);
                iterator = 0;
                continue;
            }else if(!flag){
                digits[ch]++;
            }
            if(flag){
                while(digits[iterator]>0){
                    iterator++;
                }
                digits[iterator]++;
                ch = iterator + (int)'0';
                year.setCharAt(i,(char)ch);
            }
        }
        if(flag){
            System.out.println(year.toString());
        }else{
            int index = 4;
            for(int i = 3;i>=0;i--){
                int ch = (int)year.charAt(i) - (int)'0';
                digits[ch] = 0;
                ch++;
                while(digits[ch]>0){
                    ch++;
                }
                if(ch<10){
                    digits[ch]++;
                    ch = ch + (int)'0';
                    year.setCharAt(i,(char)ch);
                    iterator = 0;
                    index = i+1;
                    break;
                }
            }
            for(int i = index;i<4;i++){
                while(digits[iterator]>0){
                    iterator++;
                }
                digits[iterator]++;
                int ch = iterator + (int)'0';
                year.setCharAt(i,(char)ch);
            }
            System.out.println(year.toString());
        }
    }
}

/*
Problem: Beautiful Year
Codeforces: https://codeforces.com/problemset/problem/271/A
 */