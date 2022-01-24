package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 01712
제목: 손익분기점


풀이)
a = 고정비용
b = 한대 노트북 생산 비용
c = 노트북 판매 가격
i = 몇 대 팔지?
c*i > a + b*i
i > a / (c - b)
*/

public class Baekjoon_01712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 고정비용 A
        int b = sc.nextInt(); // 한 대의 노트북 생산 가변비용 B (총비용: a+bi)
        int c = sc.nextInt(); // 노트북 가격 C (총수입: c*i)
        sc.close();

        // c*i > a + b*i
        // i > a / (c - b)

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }

    }
}
