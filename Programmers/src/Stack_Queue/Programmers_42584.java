package Stack_Queue;

import java.util.Arrays;

/*
스택/큐
문제번호: 42584
제목: 주식가격

풀이)
arr[i] > arr[j] -> 가격이 떨어지지 않은 기간 : j-i

*/

public class Programmers_42584 {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 2, 3 };

        int[] answer = solution(prices);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            if(i == prices.length-1) {
                answer[prices.length-1] = 0;
            } else {
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[i] > prices[j]) {
                        answer[i] = j-i;
                        break;
                    }else {
                        answer[i] = prices.length-1 - i;
                    }
                }
            }
        }
        return answer;
    }
}
