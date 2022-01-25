package b07_string;

/*
07 문자열
문제번호: 01316
제목: 그룹 단어 체커

풀이)
단어 n개중에 그룹단어가 몇개인지
그룹단어개수 초기값 n으로 설정
그룹단어가 아닌 단어가 나올때마다 n--

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
                    if(arr[s.charAt(j)-97] != 0) { // 현재문자 배열이 0이 아니라면(이미 나왔던 문자)
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
