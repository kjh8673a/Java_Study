package DFSnBFS;
/*
DFS/BFS
문제번호: 43162
제목: 네트워크

풀이)
dfs 재귀


*/
public class Programmers_Network {

    public static void dfs(int i, int[][] computers, boolean[] check) {
        check[i] = true;
        for(int j = 0; j < computers.length; j++) {
            if(computers[i][j] == 1 && !check[j]) {
                dfs(j, computers, check);
            }
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!check[i]) {
                dfs(i, computers, check);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution(n, computers));
    }
}
