import java.io.*;
import java.util.*;
import java.lang.*;

public class aForbiddenInteger{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            if(n==k && k!=x){
                System.out.println("YES\n1\n"+k);
            }else{
                int sum = 0;
                int inc = 1;
                int count = 0;
                if(inc==x){
                    inc++;
                }
                while(sum + inc <=n && inc<=k){
                    sum += inc;
                    if(n-sum <= k && n-sum!=x && n-sum>0){
                        sum = n;
                        count+=2;
                        break;
                    }
                    count++;
                }
                if(sum!=n){
                    System.out.println("NO");
                }else{
                    System.out.println("YES\n" + count);
                    sum = 0;
                    inc = 1;
                    if(inc==x){
                      inc++;
                    }
                    while(sum + inc <=n && inc<=k){
                        sum += inc;
                        System.out.print(inc + " ");
                        if(n-sum <= k && n-sum!=x && n-sum>0){
                            System.out.print(n-sum);
                            break;
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}