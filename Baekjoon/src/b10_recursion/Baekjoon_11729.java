package b10_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
10 재귀
문제번호: 11729
제목: 하노이 탑 이동 순서


풀이)


*/

public class Baekjoon_11729 {

    static void hanoi(int n, int x, int y) {
        
        if (n > 1) {
            hanoi(n-1, x, 6-x-y); // 기둥 번호의 합 = 6
        }
        System.out.println(x + " " + y);
        if (n > 1) {
            hanoi(n-1, 6-x-y, y);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        sb.append((int)(Math.pow(2, n) - 1));
        System.out.println(sb);

        hanoi(n, 1, 3);
    }
}
