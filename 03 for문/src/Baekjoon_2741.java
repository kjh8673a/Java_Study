import java.util.Scanner;

/*
문제번호: 2741
제목: N 찍기
문제: 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N 입력
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
