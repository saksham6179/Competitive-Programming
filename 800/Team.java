import java.io.*;
import java.util.*;

public class Team{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfQue = Integer.parseInt(br.readLine());
        int solvableQue = 0;
        for(int i = 0;i<noOfQue;i++){
            int solutionCount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j<3;j++){
                if(Integer.parseInt(st.nextToken())==1){
                    solutionCount++;
                }
            }
            if(solutionCount>=2){
                solvableQue++;
            }
        }
        System.out.println(solvableQue);
    }
}