package ExhaustiveSearch;
import java.util.Arrays;

/*
완전탐색
문제번호: 42840
제목: 모의고사

풀이)
1번 수포자 -> 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ....
2번 수포자 -> 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, ....
3번 수포자 -> 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, ....

*/

public class Programmers_MockExam {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        int[] answer = solution(answers);

        System.out.println(Arrays.toString(answer));

    }

    public static int[] solution(int[] answers) {
        int[] per1 = {1, 2, 3, 4, 5};
        int[] per2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == per1[i%per1.length]) score[0]++;
            if(answers[i] == per2[i%per2.length]) score[1]++;
            if(answers[i] == per2[i%per3.length]) score[2]++;
        }

        int max = score[0]; // 최고점수 찾기
        for (int i = 0; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            }
        }
        
        int cnt = 0; // 최고점수 맞은 사람이 몇명인지
        for (int i = 0; i < score.length; i++) {
            if(max == score[i]) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int a = 0;
        for(int i = 0; i < score.length; i++) {
            if(max == score[i]) {
                answer[a++] = i+1;
            }
        }

        return answer;
    }
}
