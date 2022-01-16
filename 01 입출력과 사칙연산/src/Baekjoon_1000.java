import java.util.Scanner;

/*
문제번호: 1000
제목: A+B
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt(); // A 입력
        b = sc.nextInt(); // B 입력

        System.out.println(a + b); // A+B 출력
        sc.close();
    }
}
