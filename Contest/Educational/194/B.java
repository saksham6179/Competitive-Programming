import java.io.*;
import java.util.*;

public class B{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken()), z = Long.parseLong(st.nextToken());
            long diff = (y-x), ans = 0;  
            ans += (z>diff?diff * (z-diff):0);
            for(long i = 0;i<Math.min(diff,z);i++){
                ans += y%x;
                x++;
                y++;
            }
            System.out.println(ans);
        }
    }
}

/* Problem Statement 
B. Monocarp and Projects
time limit per test2 seconds
memory limit per test512 megabytes
Monocarp runs a company. Consider the work of his company over the next k
 months. In the first month, the company has x
 employees, not counting Monocarp himself, and y
 projects need to be completed. In each next month, both the number of employees and the number of projects increase by 1
.

In other words, in month i
 (0≤i<k
), the company has x+i
 employees and needs to complete y+i
 projects.

In each month, Monocarp distributes the projects among the employees. Each employee must receive the same number of projects, and each project can be assigned to at most one employee. Monocarp completes all unassigned projects himself. He always chooses a distribution that makes him complete as few projects as possible.

In particular, if in some month there are a
 employees and b
 projects, then Monocarp assigns exactly ⌊ba⌋
 projects to each employee, and he completes bmoda
 projects himself.

Find the total number of projects that Monocarp will complete himself over the next k
 months.

Input
The first line contains an integer t
 — the number of test cases (1≤t≤104
).

Each test case consists of one line containing three integers x
, y
, and k
 (1≤x≤y≤106
; 1≤k≤1012
).

Additional constraint on the input:

the sum of y
 over all test cases does not exceed 106
.
Output
For each test case, output one integer — the total number of projects that Monocarp will complete himself over k
 months.

Example
InputCopy
7
1 1 1
3 10 2
3 8 6
7 20 1
10 25 100
8 36 17
1 999900 1000000000000
OutputCopy
0
4
18
6
1425
110
999898177699820694
Note
In the first test case, the only employee completes the only project, so Monocarp is left with no projects.

In the second test case, in the first month, 10
 projects are distributed among 3
 employees: each gets 3
 projects, and Monocarp completes 1
 project. In the second month, 11
 projects are distributed among 4
 employees: each gets 2
 projects, and Monocarp completes 3
 projects. The answer is 1+3=4
.

In the third test case, the number of projects completed by Monocarp in the six months is 2
, 1
, 0
, 5
, 5
, and 5
, respectively. Their sum is 2+1+0+5+5+5=18
.
*/