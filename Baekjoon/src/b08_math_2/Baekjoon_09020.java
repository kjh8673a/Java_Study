package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 09020
제목: 골드바흐의 추측


풀이)

2보다 큰 모든 짝수는 소수 2개의 합으로 나타낼수있다.
4 = 2 + 2
12 = 5 + 7

*/

public class Baekjoon_09020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트케이스 수 T

        for (int a = 0; a < t; a++) {
            int n = sc.nextInt(); // 2보다 큰 짝수 n
            int sosu[] = new int[n];
    
            sosu[0] = sosu[1] = 1;
    
            for (int i = 2; i < n; i++) {
                for (int j = 2; j <= Math.sqrt(i); j++) { // i의 제곱근까지만 반복
                    if((i != j) && (i % j == 0)) { 
                        sosu[i]++;
                        break;
                    } 
                }
            }
    
            for(int i = n/2; i >= 0; i--) { // 여러가지인경우 두 수의 차이가 작은것부터 -> n/2부터 --
                if ((sosu[i] == 0) && (sosu[n-i] == 0)) {
                    System.out.println(i + " " + (n-i));
                    break;
                }
            }
        }
        sc.close();
    }
}
