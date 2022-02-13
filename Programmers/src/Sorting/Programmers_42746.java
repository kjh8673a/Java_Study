package Sorting;
/*
정렬
문제번호: 42746
제목: 가장 큰 수

풀이)
주어진 정수가 [6, 10, 2]라면 
[6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
이중 가장 큰 수는 6210입니다.

https://st-lab.tistory.com/243

*/

public class Programmers_42746 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNumbers = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]); // 배열 문자형으로 변환
        }

        return answer;
    }
}
