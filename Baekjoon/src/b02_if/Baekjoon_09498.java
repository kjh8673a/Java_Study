package b02_if;

import java.util.Scanner;

/*
02 if문
문제번호: 09498
제목: 시험 성적
문제: 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_09498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시험 점수 입력
        sc.close();

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}