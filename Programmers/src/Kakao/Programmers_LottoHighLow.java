package Kakao;

import java.util.Arrays;

public class Programmers_LottoHighLow {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int win_cnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    win_cnt++;
                }
            }
        }

        int zero_cnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
            }
        }

        int max = 7-(win_cnt + zero_cnt);
        int min = 7-(win_cnt);
        if(win_cnt == 0) {
            min = 6;
        }
        if(win_cnt == 0 && zero_cnt == 0) {
            max = 6;
        }


        int[] answer = {max, min};
        return answer;

    }

    public static void main(String[] args) {
        int[] lottos = {38, 19, 20, 40, 15, 25};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] answer = solution(lottos, win_nums);

        System.out.println(Arrays.toString(answer));
    }
}
