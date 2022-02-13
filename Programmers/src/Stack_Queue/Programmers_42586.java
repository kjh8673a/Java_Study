package Stack_Queue;

/*
스택/큐
문제번호: 42586
제목: 기능개발

풀이)
배포는 하루에 한번, 진도율이 95%인 작업의 개발속도가 4%라면 2일 뒤 배포



*/
public class Programmers_42586 {

    public static void main(String[] args) {
        int[] progresses = { 93, 30, 55 };
        int[] speeds = { 1, 30, 5 };

        for (int i : solution(progresses, speeds)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        int[] done = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + day * speeds[i] < 100) {
                day++;
            }
            done[day]++;
        }

        int cnt = 0;
        for (int i : done) {
            if (i > 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int idx = 0;
        for (int i : done) {
            if (i > 0) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }

}
