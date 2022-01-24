package b08_math_1;

import java.util.Scanner;

/*
08 기본 수학 1
문제번호: 02839
제목: 설탕 배달

풀이)
설탕 n Kg 채우기
봉지는 3 Kg, 5 Kg 두 종류
봉지 최대한 적게 가져가기
먼저 a: (n을 5로나누고), b: (n을 5로 나눈 나머지)를 3으로 나눈다
b가 딱 나눠떨어지지 않으면 -1출력


첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

*/

public class Baekjoon_02839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 설탕 n Kg을 배달해야 한다
        sc.close();

        // f와 t의 기본값 설정
        int f = n / 5;  // 5 Kg 봉지 개수
        int t = (n % 5) / 3; // 3 Kg 봉지 개수

        if ((n % 5) % 3 != 0) { // (n을 5로나눈 나머지)가 3으로 나누어 떨어지지 않는다면
            for(int i = n/5; i >= 0; i--) {  // 5kg봉지가 많을 수록 총 봉지 개수가 줄어든다. i--
                if((n-5*i) % 3 == 0) { // (n-5i)가 3으로 나누어 떨어지지 않는지 체크
                    f = i;
                    t = (n-5*i) / 3; // 나누어 떨어진다면 f와 t 다시 설정
                    break;
                } else { // 도저히 나누어 떨어지게 할 수 없다면
                    f = 0; // f+t가 -1이 되도록 f와 t 설정
                    t = -1;
                }
            }    
        } 
        
        System.out.println(f + t);
        
    }
}
