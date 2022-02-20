package Hash;

import java.util.HashMap;

/*
해시
문제번호: 42576
제목: 완주하지 못한 선수

풀이)
향상된 for문
getOrDefault
keySet

*/

public class Programmers_42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = solution(participant, completion);
        
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
