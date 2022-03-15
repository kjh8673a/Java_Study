package DFSnBFS;
/*
DFS/BFS
문제번호: 43164
제목: 여행경로

풀이)
dfs 재귀

tickets -> [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"], ["SFO", "ICN"], ["ICN", "AAA"]]
return -> ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO", "ICN", "AAA"]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_TravelRoute {
    static ArrayList<String> answers;
    static boolean[] visited;

    public static void dfs(String[][] tickets, String destination, String route, int cnt) {
        if(cnt == tickets.length) {
            answers.add(route);
            return;
        }

        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(destination)) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], route+","+tickets[i][1], cnt+1);
                visited[i] = false;
            }
        }
    }

    public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answers = new ArrayList<String>();

        dfs(tickets, "ICN", "ICN", 0);

        Collections.sort(answers);
        String[] answer = answers.get(0).split(",");
        return answer;
    }

    public static void main(String[] args) {
        String[][] tickets = 
        {{"ICN", "SFO"}, {"ICN", "AAA"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}, {"SFO", "ICN"}, {"ICN", "ATL"}};

        System.out.println(Arrays.toString(solution(tickets)));
    }
}
