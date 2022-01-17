import java.util.Scanner;

/*
문제번호: 8958
제목: OX퀴즈
문제: "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 

    O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 

    문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 

    예를 들어, 10번 문제의 점수는 3이 된다.

    "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

    OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
*/

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            str[i] = a;
        }
        sc.close();

        for (int j = 0; j < str.length; j++) {
            String[] ox = str[j].split("X");
            System.out.println(ox[0]);
            System.out.println(ox[1]);
            System.out.println(ox[2]);
            System.out.println(ox[3]);
            System.out.println(ox[4]);

        }
        
        // for (int h = 0; h < arr.length; h++) {
        //     System.out.print(arr[h] + " ");
        // }
    }
}
