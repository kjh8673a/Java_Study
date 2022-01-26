package b08_math_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n; // 소수 개수, 소수 아닌거마다 --
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) { // 1은 소수가 아니다
                cnt--;
            } else {
                for (int j = 2; j < Math.sqrt(a); j++) {
                    if (a % j == 0) { // i와 j가 다를 때, i가 j로 나누어 떨어진다면 소수X
                        cnt--;
                        break;
                    }
                }
            }
        }
        sc.close();

        System.out.println(cnt);

    }
}
