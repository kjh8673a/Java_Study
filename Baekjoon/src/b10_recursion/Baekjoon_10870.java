package b10_recursion;

import java.util.Scanner;

/*
10 재귀
문제번호: 10870
제목: 피보나치 수 5


풀이)
F(n) = F(n-1) + F(n-2)
*/

public class Baekjoon_10870 {

    static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(n));
    }
}
