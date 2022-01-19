package b01_io;

import java.util.Scanner;

/*
01 입출력과 사칙연산
문제번호: 01008
제목: A/B
문제: 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
    첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
*/

public class Baekjoon_01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a; // 소수점 아래까지 표현하기 위해서 int대신 double을 사용
        double b;
        a = sc.nextDouble(); // A 입력
        b = sc.nextDouble(); // B 입력

        System.out.println(a / b); // A/B 출력
        sc.close();
    }
}
