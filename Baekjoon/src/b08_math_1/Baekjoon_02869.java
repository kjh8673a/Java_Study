package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 02869
제목: 달팽이는 올라가고 싶다

풀이)
v - (a-b)i <= a
정상까지 a미터 이하로 남았을 때 i를 구한다
걸리는 일 수는 i+1

시간초과
*/

public class Baekjoon_02869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 낮에 몇 미터 올라갈지
        int b = sc.nextInt(); // 밤에 몇 미터 미끄러지는지
        int v = sc.nextInt(); // 나무의 높이
        sc.close();

        int i = (v - a) / (a - b);

        if (a == v) { // a와 나무 높이 같을때 -> 1일 (i값은 0이기때문에 따로 취급)
            System.out.println(1);
        } else if (i < 1) { // 계산값이 0.xxxxx일때 i값은 0이지만 하루만에 올라갈 수 없다
            System.out.println(i + 2);
        } else {
            System.out.println(i + 1);
        }

    }

}
