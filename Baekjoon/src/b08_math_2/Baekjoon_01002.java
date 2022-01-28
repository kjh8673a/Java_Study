package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 01002
제목: 터렛


풀이)
A(x1,y1) - 거리 r1
B(x2,y2) - 거리 r2

A-B 거리 : {Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)}제곱

경우의수 : 2, 1, 0, 무한
무한 -> 중점이같고 거리도 같다
0 -> r1+r2 < A-B거리 || r1-r2 > A-B거리
1 -> r1+r2 = A-B거리 || r1-r2 = A-B거리
2 -> else

*/

public class Baekjoon_01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if ((r1+r2)*(r1+r2) < (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) {
                System.out.println(0);
            } else if ((r1-r2)*(r1-r2) > (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) {
                System.out.println(0);
            } else if ((r1+r2)*(r1+r2) == (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) {
                System.out.println(1);
            } else if ((r1-r2)*(r1-r2) == (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();

    }
}