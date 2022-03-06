package DFSnBFS;

/*
DFS/BFS
문제번호: 43165
제목: 타겟넘버

풀이)
dfs 재귀


*/
public class Programmers_TargetNumber {

    public static int dfs(int idx, int sum, int[] numbers, int target) {
        if(idx == numbers.length) {
            // 합이 target과 같으면 1, 다르면 0 반환.
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        // 현재 idx값의 합결과에 + or -
        result += dfs(idx+1, sum+numbers[idx], numbers, target);
        result += dfs(idx+1, sum-numbers[idx], numbers, target);
        return result;
    }

    
    public static int solution(int[] numbers, int target) {
        int answer = 0;

        // +-numbers[0]값으로 각각 dfs함수 시작
        answer += dfs(1, numbers[0], numbers, target);
        answer += dfs(1, -numbers[0], numbers, target);

        return answer;
    }   
    

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        int answer = solution(numbers, target);

        System.out.println(answer);

    }
}
