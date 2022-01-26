package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 01978
제목: 소수 찾기


풀이)

소수 : 1과 자기자신으로만 나누어떨어진다.
n개의 수를 입력하여 그 중 소수가 몇개인지

*/

public class Baekjoon_01978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n; // 소수 개수, 소수 아닌거마다 --
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) { // 1은 소수가 아니다
                cnt--;
                continue;
            } else {
                for (int j = 2; j <= Math.sqrt(a); j++) { // a의 제곱근까지만 반복
                    if ((a != j) && (a % j == 0)) { // a와 j가 다를 때, a가 j로 나누어 떨어진다면 소수X
                        cnt--;
                        break;
                    }
                }
            }
        }
        sc.close();

        System.out.println(cnt);

    }

}
