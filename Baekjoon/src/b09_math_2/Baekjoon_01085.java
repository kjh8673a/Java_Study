package b09_math_2;

import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 01085
제목: 직사각형에서 탈출


풀이)
                (w,h)
        (x,y)
(0,0)

(x-0), (y-0), (w-x), (h-y) 중 최솟값

math함수 써보기

*/
public class Baekjoon_01085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        int arr[] = {x-0, y-0, w-x, h-y};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);


        // Scanner in = new Scanner(System.in);

		// int x = in.nextInt();
		// int y = in.nextInt();
		// int w = in.nextInt();
		// int h = in.nextInt();


		// int x_min = Math.min(x, w-x);	// x축 최소거리
		// int y_min = Math.min(y, h-y);	// y축 최소거리
        
		// // x와 y축 최소거리 중 가장 작은 값
		// System.out.println(Math.min(x_min, y_min));
    }
}
