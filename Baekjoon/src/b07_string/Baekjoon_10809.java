package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 10809
제목: 알파벳 찾기
문제: 
알파벳 소문자로만 이루어진 단어 S가 주어진다.

각각의 알파벳에 대해서, 
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        sc.close();

        int[] arr = new int[26]; // 알파벳 a~z배열 생성
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 배열의 값 -1로 설정
        }

        // char형 a는 int형 97로 변환.
        // a를 0으로 하기 위해서 -97
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) (s.charAt(i)); // s의 i+1번째 알파벳을 int로 변환

            if (arr[ch - 97] == -1) { // 알파벳 배열의 값이 -1일때만 값 변경
                arr[ch - 97] = i;
            } else {
                continue;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
