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
             // X기준으로 자르기 OOXXOXXOOO는 {"OO", "", "O", "", "OOO"}로 잘려서 배열에 들어감
            String[] ox = str[j].split("X");
            // System.out.println(ox.length);
            int sum = 0;
            for (int k = 0; k < ox.length; k++) {
                // ox배열의 각 요소들을 string으로 해서 길이구하기
                String s = ox[k];
                int s_len = s.length();
                // ox[k]의 길이가 0이 될때까지 sum에 길이(s_len)을 더해주고 s_len에서 1빼서 다시 while문 반복
                // ox[0] = OO 이므로 s_len = 2 이다. while문을 통해 sum = 2 + 1 실행 후 ox[1]로 while문 다시 반복
                while(s_len > 0) {
                    sum += s_len;
                    s_len--;
                }
            }
            System.out.println(sum);
        }
    }
}