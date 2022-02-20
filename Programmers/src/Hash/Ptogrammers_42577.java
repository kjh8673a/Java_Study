package Hash;

import java.util.HashMap;

/*
해시
문제번호: 42577
제목: 전화번호 목록

풀이)
containsKey
substring(0,j)
*/
public class Ptogrammers_42577 {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};

        boolean answer = solution(phone_book);

        System.out.println(answer);
    }

    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
