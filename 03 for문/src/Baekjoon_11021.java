import java.util.Scanner;

/*
문제번호: 11021
제목: A+B - 7
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Case #" + (j+1) + ": " + arr[j]);
        }
    }
}