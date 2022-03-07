package Kakao;
/*
카카오 인턴십
문제번호: 67256
제목: 키패드 누르기

풀이)
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
(3,0) (3,1) (3,2)

*/
public class Programmers_PressKeypad {

    public String solution(int[] numbers, String hand) {
        String answer = "";

        int[] left = {3,0};
        int[] right = {3,2};
        int[][] keypad = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};

        for(int num : numbers) {
            if(num==1 || num==4 || num==7) {
                answer += "L";
                left = keypad[num];
            } else if(num==3 || num==6 || num==9) {
                answer += "R";
                right = keypad[num];
            } else {
                int numtoleft = Math.abs(keypad[num][0]-left[0])+(keypad[num][1]-left[1]);
                int numtoright = Math.abs(keypad[num][0]-right[0])+(right[1]-keypad[num][1]);
                if(numtoleft<numtoright) {
                    answer += "L";
                    left = keypad[num];
                } else if(numtoleft>numtoright) {
                    answer += "R";
                    right = keypad[num];
                } else {
                    if(hand.equals("left")) {
                        answer += "L";
                        left = keypad[num];
                    } else {
                        answer += "R";
                        right = keypad[num];
                    }
                }
            }
        }
        return answer;
    }
}
