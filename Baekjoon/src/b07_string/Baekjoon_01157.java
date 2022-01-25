package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 01157
제목: 단어 공부

풀이)
모든 문자 대문자로 바꾸기
알파벳 배열을 생성해서 단어에 나오는 알파벳마다 해당 배열 ++

배열의 최댓값이 뭔지 구하고
해당 배열이 무슨 알파벳의 정보를 담고있는지 다시 변환


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
            arr[ch - 65]++; // 알파벳 배열++ (A의 경우 arr[0]++)
        }

        int max = arr[0];
        int maxno = 0; // 몇번째 배열이 최댓값을 보유하고 있는지
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxno = i; // i번 배열이 최댓값을 가지고 있다
            } 
        }
        
        // 최댓값이 중복되는 경우 체크
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
