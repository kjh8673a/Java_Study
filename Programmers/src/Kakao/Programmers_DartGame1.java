package Kakao;

public class Programmers_DartGame1 {
    public static int solution(String dartResult) {
        int answer = 0;
        int keep1 = dartResult.charAt(0)-48;
        int keep2 = 0;

        // keep1 -> keep2 -> answer
        
        for(int i = 1; i < dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i)) && dartResult.charAt(i) !='0'){
                answer += keep2;
                keep2 = keep1;
                keep1 = dartResult.charAt(i)-48;
            }
            if(dartResult.charAt(i) == '0') {
                if(dartResult.charAt(i-1) == '1'){
                    keep1 = 10;
                } else {
                    answer += keep2;
                    keep2 = keep1;
                    keep1 = dartResult.charAt(i)-48;
                }
            }
            if(dartResult.charAt(i) == 'S') {
                keep1 = keep1*1;
            }
            if(dartResult.charAt(i) == 'D') {
                keep1 = keep1*keep1;
            }
            if(dartResult.charAt(i) == 'T') {
                keep1 = keep1*keep1*keep1;
            }
            if(dartResult.charAt(i) == '*') {
                keep1 = keep1*2;
                keep2 = keep2*2;
            }
            if(dartResult.charAt(i) == '#') {
                keep1 = keep1*(-1);
            }
        }

        answer += keep1 + keep2;

        return answer;
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        
        int answer = solution(dartResult);

        System.out.println(answer);

    }
}
