package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 03009
제목: 네 번째 점


풀이)

축에 평행한 직사각형
(x1, y1)
(x2, y2)
(x3, y3)

*/

public class baekjoon_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] xy1 = {sc.nextInt(), sc.nextInt()};
        int[] xy2 = {sc.nextInt(), sc.nextInt()};
        int[] xy3 = {sc.nextInt(), sc.nextInt()};
        sc.close();

        int x = 0;
        int y = 0;

        if(xy1[0] == xy2[0]) {
            x = xy3[0];
        } else if(xy2[0] == xy3[0]) {
            x = xy1[0];
        } else if(xy3[0] == xy1[0]) {
            x = xy2[0];
        }

        if(xy1[1] == xy2[1]) {
            y = xy3[1];
        } else if(xy2[1] == xy3[1]) {
            y = xy1[1];
        } else if(xy3[1] == xy1[1]) {
            y = xy2[1];
        }

        System.out.printf("%d %d", x, y);
    }
}
