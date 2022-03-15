package ExhaustiveSearch;
import java.util.Arrays;

/*
완전탐색
문제번호: 42842
제목: 카펫

풀이)
노란색을 갈색이 둘러쌓는 구조.

갈색 가로 - 2 = 노랑 가로
갈색 세로 - 2 = 노랑 세로

갈색 >= 8
노랑 >= 1
가로 >= 세로
*/

public class Programmers_Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;

        int[] answer = solution(brown, yellow);

        System.out.println(Arrays.toString(answer));

    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow;

        for(int i = 3; i <= Math.sqrt(area); i++) {
            int sero = i;
            int garo = area / sero;
            
            if(sero <= garo && (sero - 2) * (garo - 2) == yellow) {
                answer[0] = garo;
                answer[1] = sero;
                break;
            }
        }

        return answer;
    }
}
