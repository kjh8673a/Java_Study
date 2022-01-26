package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 02581
제목: 소수


풀이)

소수 : 1과 자기자신으로만 나누어떨어진다.
n~m 소수들의 합과 최솟값
소수가 없을 경우 -1출력


*/

public class Baekjoon_02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        if (m == 1) { // 1은 소수가 아니다
            m = 2;
        }

        int sosu[] = new int[n-m+1];

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) { // i의 제곱근까지만 반복
                if((i != j) && (i % j == 0)) { // sosu[i-m] 이 m에 대한 정보를 갖는다 m=2일경우 sosu[0]에 2정보를 넣는다
                    sosu[i-m]++;
                    break;
                } 
            }
        }

        int sum = 0;
        int min = 0;

        for (int i = sosu.length-1; i >= 0; i--) {  // 최솟값을 찾기 위해 위에서부터 아래로
            if(sosu[i] == 0) { // 배열의 값이 0이면 소수
                sum += (i+m);
                min = i+m;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
