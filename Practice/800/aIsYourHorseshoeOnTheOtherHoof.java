import java.io.*;
import java.util.*;

public class aIsYourHorseshoeOnTheOtherHoof{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i<4;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(4 - set.size());
    }
}

/*
Codeforces: 228A - Is your horseshoe on the other hoof?
https://codeforces.com/problemset/problem/228/A
*/