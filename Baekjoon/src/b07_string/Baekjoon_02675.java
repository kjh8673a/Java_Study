package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 02675
제목: 문자열 반복
문제: 
문자열 S를 입력받은 후에, 
각 문자를 R번 반복해 새 문자열 P를 만든 후 
출력하는 프로그램을 작성하시오. 

즉, 첫 번째 문자를 R번 반복하고, 
두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 

S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
*/

public class Baekjoon_02675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt(); // 반복횟수 입력
            String s = sc.next(); // 문자열 입력

            for (int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) { // charAt(j)를 r번 출력
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}
