package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 01152
제목: 단어의 개수
문제: 
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 

이 문자열에는 몇 개의 단어가 있을까? 

이를 구하는 프로그램을 작성하시오. 

단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
*/

public class Baekjoon_01152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        String[] word = s.split(" "); // " " 기준으로 나누기
        // " the first character is a blank"
        // [, the, first, character, is, a, blank]

        int cnt = 0; // 단어의 개수 카운트
        for(int i = 0; i < word.length; i++) {
            if (word[i].length() >= 1) { // word[i]의 길이가 0이 아닐때 카운트
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
