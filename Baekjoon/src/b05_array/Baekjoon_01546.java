package b05_array;

import java.util.Scanner;

/*
05 1차원 배열
문제번호: 01546
제목: 평균
문제: 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 

    일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 

    그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

    예를 들어, 세준이의 최고점이 70이고, 
    수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

    세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
*/
public class Baekjoon_01546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            arr[i] = a;
        }
        sc.close();

        double max = arr[0]; // 최댓값 고르기
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        double[] arr2 = new double[n];
        for (int k = 0; k < arr.length; k++) {
            arr2[k] = arr[k] / max * 100;
        }

        double avg = 0;
        for (int l = 0; l < arr2.length; l++) {
            avg += arr2[l] / n;
        }
        System.out.println(avg);
    }
}