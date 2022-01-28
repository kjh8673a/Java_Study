package b08_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 3053
제목: 택시 기하학


풀이)

원주율 : Math.PI
소수점아래 6자리까지 printf -> %6f

*/


public class Baekjoon_03053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble(); // 반지름 r
        sc.close();
        
        System.out.printf("%6f\n", Math.PI * r * r); // 유클리드 기하학
        System.out.printf("%6f", 2 * r * r); // 택시 기하학
    }
}
