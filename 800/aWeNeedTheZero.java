    import java.io.*;
    import java.util.*;
    import java.lang.*;

    public class aWeNeedTheZero{
        public static void main(String[] args)throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] ele = new int[n];
                ele[0] = Integer.parseInt(st.nextToken());
                int xorAll = ele[0];
                for(int i = 1;i<n;i++){
                    ele[i] = Integer.parseInt(st.nextToken());
                    xorAll = xorAll ^ ele[i];
                }
                int ans = -1;
                if(n%2==1 || (n%2==0 && xorAll==0)){
                    ans = xorAll;
                }
                System.out.println(ans);
            }
        }
    }