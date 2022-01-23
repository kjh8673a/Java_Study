package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 01157
제목: 단어 공부
문제: 
알파벳 대소문자로 된 단어가 주어지면, 
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 

단, 대문자와 소문자를 구분하지 않는다.

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/

public class Baekjoon_01157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s1 = s.toUpperCase(); // 모든 문자열 대문자로 변환
        sc.close();

        int[] arr = new int[26]; // 알파벳 배열 생성

        // char형 A는 int형 65로 변환.
        // A를 0으로 하기 위해서 -65
        for (int i = 0; i < s1.length(); i++) {
            int ch = (int) (s1.charAt(i)); // i번째 문자를 int형으로 변환
            arr[ch - 65]++; // 알파벳 배열++ (a의 경우 arr[0]++)
        }

        int max = arr[0];
        int maxno = 0; // 몇번째 배열이 최댓값을 보유하고 있는지
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxno = i; // i번 배열이 최댓값을 가지고 있다
            } 
        }
        // arr[i] != 0 && max == arr[i]
        
        for(int i = 0; i < arr.length; i++) { // max, maxno를 정하고 나서
            if (i == maxno) { // i가 maxno인 경우는 제외하고
                continue;
            } else if (arr[i] == max) { // 위에서 구한 max와 같은 값이 있는 경우 max를 -1로 한다
                max = -1;
                break;
            }
        }

        if (max == -1) {
            System.out.println("?");
        } else { // char형 A를 int형으로 변환하면 65
            System.out.println((char) (maxno + 65));
        }
    }
}
