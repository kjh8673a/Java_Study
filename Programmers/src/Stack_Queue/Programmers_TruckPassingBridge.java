package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
스택/큐
문제번호: 42583
제목: 다리를 지나는 트럭

풀이)
트럭이 다리를 지나는데 걸리는 시간

*/

public class Programmers_TruckPassingBridge {
    public static void main(String[] args) {
        int[] truck_weights = { 7, 4, 5, 6 };

        int answer = solution(2, 10, truck_weights);

        System.out.println(answer);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 시간
        Queue<Integer> q = new LinkedList<>();

        int sum = 0; // 다리에 올라가있는 트럭의 무게 합
        for(int w : truck_weights) {

            while(true) {
                if(q.isEmpty()) {
                    q.offer(w);
                    sum += w;
                    answer++;
                    break;
                } else if(q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if(sum + w > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(w);
                        sum += w;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
