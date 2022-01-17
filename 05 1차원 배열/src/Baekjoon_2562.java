import java.util.Scanner;

/*
문제번호: 2562
제목: 최댓값
문제: 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
*/

public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        sc.close();

        int max = 0;
        int k = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                k = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(k);
    }
}
