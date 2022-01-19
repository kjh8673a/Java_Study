package b03_for;

import java.util.Scanner;

/*
03 for문
문제번호: 11022
제목: A+B - 8
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + " + " + b + " = " + (a + b);
        }
        sc.close();

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Case #" + (j+1) + ": " + arr[j]);
        }
    }
}