package b09_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 04948
제목: 베르트랑 공준


풀이)

n보다 크고, 2n보다 작거나 같은 소수

2n을 m으로 지정하고 n~m사이 소수 개수

*/

public class Baekjoon_04948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int cnt = n; // n보다 크고 2n보다 작은 자연수는 n개
            if(n == 0) break; // n이 입력되면 종료

            for (int i = n+1; i <= 2*n; i++) {
                if (i == 1) { // 1은 소수가 아니다
                    cnt--;
                    continue;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) { // i의 제곱근까지만 반복
                        if ((i != j) && (i % j == 0)) { // i와 j가 다를 때, i가 j로 나누어 떨어진다면 소수X
                            cnt--;
                            break;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
        

    }
}
