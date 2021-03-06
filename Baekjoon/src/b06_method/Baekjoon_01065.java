package b06_method;

import java.util.Scanner;

/*
06 함수
문제번호: 01065
제목: 한수

풀이)
X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 

1~99 : 한수
100~999 : 계산필요
1000 : 한수X

세자리수 계산 - 
(백의자리-십의자리)-(십의자리-일의자리)=0 -> 한수

*/
public class Baekjoon_01065 {

    public static int han(int n) {
        
        // 정수 n의 자리수 구하기
        int cnt = 0;
        int a = n;
        while (a > 0) {
            // a를 10으로 나눈 몫이 0보다 클때마다 자리수 카운트 +1
            a = a/10;
            cnt++;
        }
        // System.out.println(cnt);

        // 자리수가 1, 2 인것은 한수로 취급.
        // 자리수가 3인경우
        // (백의자리-십의자리)와 (십의자리-일의자리)의 차가 0인 경우 등차수열이라는 뜻.
        int cha;
        if (cnt == 1 || cnt == 2) {
            cha = 0;
        } else if (cnt == 3) {
            int b = n/10; // 세자리수에서 일의자리 날림
            int c = n%100; // 세자리수에서 백의자리 날림
            cha = (b/10 - b%10) - (c/10 - c%10);
        } else {
            cha = 1;
        }

        return cha;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 1000보다 작거나 같은 자연수 n 입력
        sc.close();

        int count = 0; // 한수의 개수를 센다.

        for (int i = 1; i <= n; i++) {
            if (han(i) == 0) { // han(i)가 0이면 한수이므로 count++
                count++;
            } else {
                continue;
            }
        }

        System.out.println(count);
    }
}
