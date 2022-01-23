package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 11654
제목: 아스키 코드
문제: 
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 

주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
입력으로 주어진 글자의 아스키 코드 값을 출력한다.
*/

public class Baekjoon_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next(); // 문자, 숫자를 받는다 string
        sc.close();
        int result = a.charAt(0); // charAt으로 입력한 값을 char형으로 만들고, int형으로 만든다.

        System.out.println(result);

    }
}
