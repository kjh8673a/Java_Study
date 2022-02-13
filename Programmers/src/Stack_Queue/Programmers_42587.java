package Stack_Queue;

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
        
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        int[] sort = new int[priorities.length];
        int max = priorities[0];
        int maxnum = 0;
        for(int i = 0; i < priorities.length; i++) {
            if(priorities[i] > max) {
                max = priorities[i];
                maxnum = i;
            }
        }
        sort[0] = maxnum;

        return answer;
    }


}
