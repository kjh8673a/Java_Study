package Kakao;

public class Programmers_NewIDRecommend {
    public static String solution(String new_id) {
        String answer = "";

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String step1 = new_id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String step2 = "";
        for(int i = 0; i < step1.length(); i++) {
            int asc = (int)step1.charAt(i);
            if((asc >= 97 && asc <= 122) || (asc >= 48 && asc <= 57) || (asc == 45) || (asc == 95) || (asc == 46)) {
                step2 += step1.charAt(i);
            }
        }

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        while(step2.contains("..")) {
            step2 = step2.replace("..", ".");
        }
        String step3 = step2;
        
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(step3.startsWith(".")) {
            step3 = step3.substring(1);
        }
        if(step3.endsWith(".")) {
            step3 = step3.substring(0, step3.length()-1);
        }
        String step4 = step3;

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(step4.equals("")) {
            step4 = "a";
        }
        String step5 = step4;

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
            // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(step5.length() >= 16) {
            step5 = step5.substring(0, 15);
        }
        if(step5.endsWith(".")) {
            step5 = step5.substring(0, step5.length()-1);
        }
        String step6 = step5;
        
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        String step7 = step6;
        
        if(step6.length() <= 2) {
            while(step7.length() < 3) {
                step7 += step6.charAt(step6.length()-1);
            }
        }
        /* 왜 안되는지?
        if(step6.length()==2) {
            step7 = step6 + step6.charAt(step6.length()-1);
        }
        if(step6.length()==1) {
            step7 = step6 + step6.charAt(step6.length()-1) + step6.charAt(step6.length()-1);
        }
        */
        answer = step7;
        
        return answer;
    }

    public static void main(String[] args) {
        String new_id = "=.=";

        String answer = solution(new_id);
        
        System.out.println(answer);
    }
}
