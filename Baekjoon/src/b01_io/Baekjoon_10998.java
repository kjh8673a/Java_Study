package b01_io;

import java.util.Scanner;

/*
01 입출력과 사칙연산
문제번호: 10998
제목: A×B
문제: 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt(); // A 입력
        b = sc.nextInt(); // B 입력

        System.out.println(a * b); // A×B 출력
        sc.close();
    }
}
