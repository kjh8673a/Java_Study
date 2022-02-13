package Sorting;
import java.util.Arrays;

/*
정렬
문제번호: 42748
제목: K번째수

풀이)
int[] array -> 배열

int[][] commands -> i, k, k -> 
    array의 i번째부터 k번째까지 자르고 정렬하여 k번째 있는 수를 찾아라
*/

public class Programmers_42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution(array, commands);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] result = new int[commands[i][1]-commands[i][0]+1]; // 새로운 배열 길이 : k-i+1

            for(int j = 0; j < result.length; j++) {
                result[j] = array[commands[i][0] + j - 1];
            }
            Arrays.sort(result);

            answer[i] = result[commands[i][2] - 1];
        }
        return answer;
    }
}
