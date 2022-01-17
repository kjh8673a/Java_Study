import java.util.Scanner;

/*
문제번호: 2577
제목: 숫자의 개수
문제: 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 

계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
*/

public class Baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int n = a * b * c;
        int length = (int)(Math.log10(n)+1); // int의 자릿수 구하기
        int[] arr = new int[length];
        int i = 0;

        while (n > 0) {
            int s = n%10;
            arr[i] = s; // 일의자리부터 차례대로 배열에 넣기
            i++;
            n = n/10;
        }
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // count배열: count[0]은 0의 개수 ~ count[9]는 9의 개수
        for (int j = 0; j < arr.length; j ++) {
            for (int k = 0; k < count.length; k++) {
                if (arr[j] == k) {
                    count[k] += 1; // arr배열의 값이 k(0~9)와 같을 때 마다 count[k] 1씩
                } 
            }
        }
        for (int h = 0; h < count.length; h++) {
            System.out.print(count[h] + " ");
        }
    }
}
