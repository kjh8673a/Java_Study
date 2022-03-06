package DFSnBFS;

/*
DFS/BFS
문제번호: 43163
제목: 단어 변환

풀이)
dfs 재귀


*/

public class Programmers_ChangeWords {
    static int answer;
    static boolean[] visited;
    
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        for(int i = 0; i < words.length; i++) {
            if(visited[i]) {
                continue;
            }

            int diff = 0;
            for(int j = 0; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) {
                    diff++;
                }
            }

            if (diff == 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }

    }


    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }
}
