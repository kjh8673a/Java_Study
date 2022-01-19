package b03_for;

import java.util.Scanner;

/*
03 for문
문제번호: 08393
제목: 합
문제: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/

public class Baekjoon_08398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N 입력
        sc.close();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);
    }
}
