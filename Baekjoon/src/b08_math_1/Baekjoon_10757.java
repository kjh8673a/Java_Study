package b08_math_1;

import java.math.BigInteger;
import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 10757
제목: 큰 수 A+B


풀이)
A+B를 출력
long타입보다 범위가 크다
BigInteger


*/

public class Baekjoon_10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();

        System.out.println(a.add(b));

    }
}
