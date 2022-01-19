package b01_io;

import java.util.Scanner;

/*
01 입출력과 사칙연산
문제번호: 10430
제목: 나머지
문제: (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
    (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
*/

public class Baekjoon_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // A 입력
        int b = sc.nextInt(); // B 입력
        int c = sc.nextInt(); // C 입력
        sc.close();

        System.out.println((a + b) % c); // (A+B)%C 출력
        System.out.println(((a % c) + (b % c)) % c); // ((A%C) + (B%C))%C 출력
        System.out.println((a * b) % c); // (A×B)%C 출력
        System.out.println(((a % c) * (b % c)) % c); // ((A%C) × (B%C))%C 출력
    }
}
