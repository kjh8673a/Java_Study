package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 01193
제목: 분수찾기


풀이)

분수 (1/1) (1/2 2/1) (3/1 2/2 1/3) (1/4 2/3 3/2 4/1)...
그룹 1       2           3            4             ...
*/

public class Baekjoon_01193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 1 ~ 10,000,000
        sc.close();

        // (1+i)*(i/2) > 10,000,000
        // i = 4471 -> 9,997,156
        // i = 4472 -> 10,001,628

        int arr[] = new int[4473]; // {1, 3, 6, 10, 15, 21....}
        int sum = 0; // 입력한 x가 몇번째 그룹에 있는지 확인하기 위함
        int num = 0;
        for (int i = 1; i < arr.length; i++) { // arr[1] ~ arr[4472] 저장
            sum += i;
            arr[i] = sum;

            if (x == 1) { // 1을 입력했을때
                num = 1;
                break;
            } else {
                if (x <= arr[i] && x > arr[i - 1]) { // arr[i-1] < x <= arr[i] 일때 x은 i번째 그룹에 있다
                    num = i;
                    break;
                }
            }
        }
        // System.out.println("num" + num);

        int top; // 분자
        int bottom; // 분모
        if (num == 1) { // 1번 그룹은 따로
            System.out.println("1/1");
        } else if (num % 2 == 1) {
            if (x % num == 0) { // 홀수 그룹의 분모
                bottom = num;
            } else {
                bottom = x % num;
            }
            top = num - bottom + 1; // 홀수그룹의 분자

            System.out.println(top + "/" + bottom);

        } else if (num % 2 == 0) {
            if (x % (num + 1) == 0) { // 짝수 그룹의 분자
                top = num;
            } else {
                top = x % (num + 1) - 1;
            }
            bottom = num + 1 - top; // 짝수 그룹의 분모

            System.out.println(top + "/" + bottom);
        }

    }
}
