package b07_string;

/*
07 문자열
문제번호: 01316
제목: 그룹 단어 체커
문제: 
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 
각 문자가 연속해서 나타나는 경우만을 말한다. 

예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

첫째 줄에 단어의 개수 N이 들어온다. 
N은 100보다 작거나 같은 자연수이다. 
둘째 줄부터 N개의 줄에 단어가 들어온다. 
단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
*/

import java.util.Scanner;

public class Baekjoon_01316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 단어 개수 입력
        int ans = n; // 그룹단어의 개수, 초기값은 단어 개수 n

        for (int i = 0; i < n; i++) {
            String s = sc.next(); // 단어 입력
            int[] arr = new int[26]; // 알파벳 배열 생성 // 소문자a는 int로하면 97
            arr[s.charAt(0)-97] = 1; // 첫번째 문자 배열에 넣어놓기
            for(int j = 1; j < s.length(); j++) {
                if (s.charAt(j-1) != s.charAt(j)) { // 현재문자와 이전문자 같지 않다면
                    if(arr[s.charAt(j)-97] != 0) { // 현재문자 배열이 0이 아니라면
                        ans--; // 그룹단어개수 -1
                        break;
                    }
                }
                arr[s.charAt(j)-97]++; // 현재문자 배열에 숫자 채우기 (나왔던 문자들은 0이 아니도록)
            }
        }
        sc.close();

        System.out.println(ans);
    }
}
