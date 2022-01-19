package b05_array;

import java.util.Scanner;

/*
05 1차원 배열
문제번호: 10818
제목: 최소, 최대
문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
*/

public class Baekjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            } else if (arr[j] > max) {
                max = arr[j];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}