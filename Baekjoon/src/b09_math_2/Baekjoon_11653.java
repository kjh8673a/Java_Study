package b09_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 11653
제목: 소인수분해


풀이)

정수 N이 주어졌을 때, 소인수분해 / 오름차순 출력
72 = 2 * 2 * 2 * 3 * 3

*/

public class Baekjoon_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int a = n;

        for (int i = 0; i <= n; i++) {
            while ((i>=2) && (a % i == 0)) {
                System.out.println(i);
                a = a / i;
            }
        }
    }
}
