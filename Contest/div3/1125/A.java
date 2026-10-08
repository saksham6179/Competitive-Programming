import java.io.*;
import java.util.*;

public class A{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
            System.out.println((x+r) + " " + y);              
        }
    }
}

/*
Problem Statement

A. In Search of Convenience
time limit per test1 second
memory limit per test256 megabytes
K1o0n got a router and placed it at point (x0,y0)
; we will consider the apartment layout as a coordinate plane, and the floor is tiled, so the furniture can stand only at lattice points with integer coordinates.

The internet spreads exactly R
 meters around the router. K1o0n wants to move his computer as far away from it as possible — but still so that the internet is available. Therefore, the desk with the computer must be placed exactly on the reception boundary, at a distance of R
 from the router. For example, if the router is at point (5,5)
 and R=5
, then the desk can be placed at point (2,1)
, because (5−2)2+(5−1)2=52
.

Find any point with integer coordinates that is exactly R
 away from (x0,y0)
.

Recall that the distance from the point (x0,y0)
 to the point (x,y)
 is (x0−x)2+(y0−y)2−−−−−−−−−−−−−−−−−√
.

Input
The first line contains an integer t
 (1≤t≤104
) — the number of testcases.

The only line of each testcase contains three integers x0
, y0
, and R
 (−10≤x0,y0≤10
, 1≤R≤25
) — the coordinates of the router and the coverage radius.

Output
For each testcase, output two integers x
 and y
 — the coordinates of the desk.

If there are several suitable points, output any of them.

Example
InputCopy
3
0 0 1
5 5 5
10 10 13
OutputCopy
0 1
2 1
-2 5

*/ 