package ExhaustiveSearch;

import java.util.HashSet;
import java.util.Iterator;

/*
완전탐색
문제번호: 42839
제목: 소수찾기

풀이)

*/

public class Programmers_FindPrimeNumber {
    HashSet<Integer> numberSet = new HashSet<>();

    public void recursive(String comb, String others) {
        // 현재 조합을 set에 추가한다.
        if (!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }
        
        // 남은 숫자 중 한개를 더해 새로운 조합을 만든다. -> recursive함수 재귀
        for(int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }
    
    // 에라토스테네스의 체
    public boolean isPrime(int num) {
        if(num == 0 || num == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(String numbers) {
        int answer = 0;

        // 모든 조합의 숫자를 만든다.
        recursive("", numbers);

        // 소수의 개수를 센다.
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
            int number = it.next();
            if(isPrime(number)) {
                answer++;
            }
        }

        // 소수의 개수를 반환한다.
        return answer;
    }

    public static void main(String[] args) {
        Programmers_FindPrimeNumber sol = new Programmers_FindPrimeNumber();
        System.out.println(sol.solution("011"));

    }
}
