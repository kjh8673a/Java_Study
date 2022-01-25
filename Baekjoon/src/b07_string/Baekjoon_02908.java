package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 02908
제목: 상수
문제: 

풀이)
세자리 숫자 두개 입력받아서 거꾸로 바꾸기
(백의자리 <-> 일의자리, 십의자리는 그대로)
바뀐 숫자 두개 비교

*/

public class Baekjoon_02908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        // 일의자리 * 100 = new 백의자리
        // 십의자리 = new 십의자리
        // 백의자리 / 100 = new 일의자리
        int s1;
        s1 = (n1 % 10) * 100 + ((n1 % 100) - (n1 % 10)) + (n1 / 100);

        int s2;
        s2 = (n2 % 10) * 100 + ((n2 % 100) - (n2 % 10)) + (n2 / 100);

        if (s1 > s2) {
            System.out.println(s1);
        } else if (s1 < s2) {
            System.out.println(s2);
        }

    }
}
