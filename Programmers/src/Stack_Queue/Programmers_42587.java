package Stack_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
스택/큐
문제번호: 42587
제목: 프린터

풀이)
arr = [2, 1, 3, 2] -> 중요도가 가장높은 arr[2]가 가장 먼저 출력된다
A B C D 라고하면 C D A B 순으로 출력된다


*/
public class Programmers_42587 {

    public static void main(String[] args) {
        int[] priorities = { 2, 1, 3, 2 };

        int answer = solution(priorities, 2);

        System.out.println(answer);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : priorities) {
            queue.offer(i);
        }
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == queue.peek()) {
                    if(location == i) {
                        return answer;
                    }
                    answer++;
                    queue.poll();
                }
            }
        }
        return answer;
    }
}
