package Sorting;
import java.util.Arrays;

/*
정렬
문제번호: 42747
제목: H-Index

풀이)
[3, 0, 6, 1, 5]
논문 n편중, h번 이상 인용된 논문이 h편 이상, 나머지 논문이 h번 이하 인용


*/

public class Programmers_42747 {
    public static void main(String[] args) {
        int[] array = {3, 0, 6, 1, 5};

        int answer = solution(array);
        
        System.out.println(answer);
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations); // 0 1 3 5 6

        for(int i = citations.length-1; i >= 0; i--) {
            if(citations[i] <= answer) { // 인용횟수가 answer(논문 편수)보다 작아지는 순간
                break;
            }
            answer++;
        }

        return answer;
    }
}
