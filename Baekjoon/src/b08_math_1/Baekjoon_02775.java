package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 02775
제목: 부녀회장이 될테야

풀이)
a층의 b호에 살려면 
자신의 아래(a-1)층의 1호부터 b호까지 
사람들의 수의 합만큼 사람들을 데려와 살아야 한다

k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지

0층의 i호에는 i명
1층의 3호에는 6명
2층의 3호에는 10명


2층:    1   4   10  20  35  ....
1층:    1   3   6   10  15  21  28  36  45  54
0층:    1   2   3   4   5   6   7   8   9   10

2차원 배열로 다 채워놓고 나중에 k,n을 찾는다.
*/

public class Baekjoon_02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스의 수 t

        int apt[][] = new int[15][15]; // k, n 0~14

        for (int i = 0; i < 15; i++) {
            apt[0][i] = i; // 0층 i호에는 i명
            apt[i][1] = 1; // i층 1호에는 1명
        }

        for (int i = 1; i < 15; i++){
            for (int j = 2; j < 15; j++) { // 층수-1집과 호수-1집을 더한다
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        for(int i = 0; i < t; i++) {
            int k = sc.nextInt(); // k층
            int n = sc.nextInt(); // n호

            System.out.println(apt[k][n]);
        }
        sc.close();
        
    }
    
}
