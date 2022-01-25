package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 02292
제목: 벌집


풀이)
몇번째 껍질에 있는지?
껍질의 개수 : 
1 -> 6 -> 12 -> 18 -> 24 (6씩 증가한다)
6*0 6*1 6*2 6*3 ... = 6*(1+2+3+4+....+i)
= 6*(1+i)*(i/2)
*/


public class Baekjoon_02292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        //  n의 최댓값 1,000,000,000
        // 6*(1+i)*(i/2) > 1,000,000,000
        // i = 18257; -> 999,954,144
        // i = 18258; -> 1,000,118,466

        int arr[] = new int[18258];
        int sum = 1; // n번째 껍질까지 개수 합
        
        for (int i = 0; i < 18258; i++) {
            sum += 6*i; 
            arr[i] = sum; // arr[i] = 6*0 + 6*1 + 6*2 + 6*3 + ... + 6*i
            if (n == 1) {  // 1을 입력했을때
                System.out.println(1);
                break;
            } else if (i >= 1) { // arr[1]일때부터 조건
                if (n <= arr[i] && n > arr[i-1]) { // arr[i-1] < n <= arr[i] 일때 n은 i+1번째 껍질에 있다
                    System.out.println(i+1);
                    break;
                }
            } 
                
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int route = 1;
        int range = 2;

        if (a == 1) {
            System.out.println(1);
        } else {
            while (range <= a) {
                range = range + (route * 6);
                route++;
            }
            System.out.println(route);

        }
    }

}
*/