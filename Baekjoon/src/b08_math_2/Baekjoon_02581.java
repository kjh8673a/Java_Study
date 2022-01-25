package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 02581
제목: 소수


풀이)

소수 : 1과 자기자신으로만 나누어떨어진다.

*/

public class Baekjoon_02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sosu[] = new int[10001]; // 0~10000
        sosu[0] = sosu[1] = 1; // 0과 1은 소수가 아니므로 배열에 먼저 1입력. 0,1은 나누기연산 곤란하다

        for (int i = 2; i < sosu.length; i++) {
            for (int j = 2; j < sosu.length; j++) {
                if((i != j) && (i % j == 0)) { // i와 j가 다를 때, i가 j로 나누어 떨어진다면 배열에 +1
                    sosu[i]++;
                    break;
                } else if (i == j) { // j가 i와 같아질때까지 위의 if문 조건 만족하는게 없으면 소수이다
                    break;
                }
            }
        }

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int min = 0;

        for (int i = n; i >= m; i--) { // 최솟값을 찾기 위해 위에서부터 아래로
            if (sosu[i] == 0) { // 배열의 값이 0이면 소수
                sum += i;
                min = i;
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
