package b10_recursion;

import java.util.Scanner;

/*
10 재귀
문제번호: 10872
제목: 팩토리얼


풀이)
N! = 1 * 2 * ....* (N-1) * N

0! = 1
n > 0 이면 n! = n * (n-1)!
*/

public class Baekjoon_10872 {

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(factorial(n));
    }
}
