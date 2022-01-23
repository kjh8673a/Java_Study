package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 11720
제목: 숫자의 합
문제: 
N개의 숫자가 공백 없이 쓰여있다. 

이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
둘째 줄에 숫자 N개가 공백없이 주어진다.
*/

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자의 개수 입력
        String a = sc.next(); //숫자 n개를 string으로 입력
        sc.close();

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += a.charAt(i)-48; // a의 i번째 숫자를 더해준다
        }                          // charAt동작 후 int형으로 변환하면 아스키코드가 나오기때문에 
        System.out.println(sum);   // 원하는 int값으로 사용하기 위해서는 -48이나 -'0'을 해줘야한다

    }
}
