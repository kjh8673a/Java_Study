package b06_method;

import java.util.Scanner;

/*
06 함수
문제번호: 15596
제목: 정수 N개의 합
문제: 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
    작성해야 하는 함수는 다음과 같다.
    
    Java: 
    long sum(int[] a); (클래스 이름: Test)
    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
    리턴값: a에 포함되어 있는 정수 n개의 합 
*/

public class Baekjoon_15596 {
    static long sum(int[] a) {
        long ans = 0;

        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수 몇 개를 저장할지
        int arr[] = new int[n]; // 정수 n개가 저장되어 있는 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(sum(arr));
    }
}