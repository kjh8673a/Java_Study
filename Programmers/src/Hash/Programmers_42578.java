package Hash;

import java.util.HashMap;

/*
해시
문제번호: 42578
제목: 위장

풀이)
getOrDefault
keySet
*/

public class Programmers_42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int answer = solution(clothes);
        
        System.out.println(answer);
    }
    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        return answer-1;
    }
}
