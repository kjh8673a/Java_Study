package b09_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 01929
제목: 소수 구하기


풀이)

소수 : 1과 자기자신으로만 나누어떨어진다.
m~n범위의 소수

*/

public class Baekjoon_01929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
    
        if(m == 1) { // 1은 소수가 아니다
            m = 2;
        }

        int sosu[] = new int[n-m+1]; // n-m+1개 배열

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) { // i의 제곱근까지만 반복
                if((i != j) && (i % j == 0)) { // 소수가 아니다
                    sosu[i-m]++; // sosu[i-m] 이 m에 대한 정보를 갖는다 m=2일경우 sosu[0]에 2정보를 넣는다
                    break;  
                } else if (i == j) { // j가 i와 같아질때까지 위의 if문 조건 만족하는게 없으면 소수이다
                    break;
                }
            }
        }

        for (int i = 0; i < sosu.length; i++) {
            if(sosu[i] == 0) {
                System.out.println(i+m);
            }
        }
        

    }
}