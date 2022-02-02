package b09_math_2;

import java.util.Arrays;
import java.util.Scanner;

/*
09 기본 수학 2
문제번호: 04153
제목: 직각삼각형


풀이)

자연수 3개 입력 -> 정렬 -> 피타고라스

*/

public class Baekjoon_04153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int arr[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break; // 0 0 0 일때 종료
            }
            
            Arrays.sort(arr); // 정렬 -> arr[2]가 최댓값
            
            if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
    
}
