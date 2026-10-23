import java.io.*;
import java.util.*;

public class cStripes{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String extraLine = br.readLine();
            char[][] grid = new char[8][8];
            for(int i = 0;i<8;i++){
                String s = br.readLine();
                for(int j = 0;j<8;j++){
                    grid[i][j] = s.charAt(j);
                }
            }
            for(int i = 0;i<8;i++){
                boolean row = true, column = true;
                for(int j = 0;j<8;j++){
                    char rowCh = grid[i][j], colCh = grid[j][i];
                    if(colCh!='B'){
                        column = false;
                    }
                    if(rowCh!='R'){
                        row = false;
                    }
                }
                if(row){
                    System.out.println("R");
                    break;
                }
                if(column){
                    System.out.println("B");
                    break;
                }
            }
        }
    }
}


/*
Problem: Codeforces 1742C - Stripes
Link: https://codeforces.com/problemset/problem/1742/C/stripes
*/
