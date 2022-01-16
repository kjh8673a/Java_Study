import java.util.Scanner;

/*
문제번호: 10869
제목: 사칙연산
문제: 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt(); // A 입력
        b = sc.nextInt(); // B 입력

        System.out.println(a + b); // A+B 출력
        System.out.println(a - b); // A-B 출력
        System.out.println(a * b); // A*B 출력
        System.out.println(a / b); // A/B(몫) 출력
        System.out.println(a % b); // A%B(나머지) 출력
        sc.close();
    }
}
