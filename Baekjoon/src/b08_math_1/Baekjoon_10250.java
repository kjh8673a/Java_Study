package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 10250
제목: ACM 호텔

풀이) 101 201 301 .... h01 -> 
    102 202 302 ... h02 -> ... -> 1w 2w 3w ... hw

    1호는 h개있다.
*/

public class Baekjoon_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // t번의 테스트

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt(); // 층 수 h
            int w = sc.nextInt(); // 한 층에 있는 방 수 w
            int n = sc.nextInt(); // n번째 손님

            int floor = 0; // 층수
            int room = 0; // 호수

            if (n % h == 0) { // 손님%층수=0 -> 꼭대기층 룸넘버에 +1안해줘도된다
                room = n / h;
            } else {
                room = n / h + 1;
            }

            if (n % h == 0) { // 손님%층수=0 -> 꼭대기층 층수=h
                floor = h;
            } else {
                floor = n % h;
            }

            System.out.printf("%d%02d\n", floor, room); // 룸 번호만 %02d로 표현
        }
        sc.close();
    }

}
