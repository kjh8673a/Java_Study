import java.util.Scanner;

/*
문제번호: 10950
제목: A+B - 3
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t]; // 스캐너 입력 다 받고 결과 출력하기 위해 for문 반복마다 배열에 저장

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt(); // 한 줄에 2개 입력받을 수 있는 방법이 있는지?
            arr[i] = a + b;
        }
        sc.close();

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
