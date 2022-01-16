import java.util.Scanner;

/*
문제번호: 10871
제목: X보다 작은 수
문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        sc.close();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < x) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}