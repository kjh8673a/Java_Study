package Kakao;

public class Programmers_CrainDoll {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] pick = new int[moves.length];

        for(int i = 0; i < moves.length; i++) {
            int idx = moves[i]-1;

            for(int j = 0; j < board.length; j++) {
                if(board[j][idx] != 0) {
                    pick[i] = board[j][idx];
                    board[j][idx] = 0;
                    System.out.println("pick[" + i + "]:" + pick[i]);
                    break;
                } else if(board[board.length-1][idx] == 0) {
                    pick[i] = 0;
                    System.out.println("pick[" + i + "]:" + pick[i]);
                    break;
                }
            }
        }

        for(int i = 1; i < pick.length; i++) {
            if(pick[i] == pick[i-1] && pick[i] != 0) {
                answer += 2;
                pick[i] = pick[i-1] = 0;
            } else if(pick[i-1] == 0) {
                for (int j = i-1; j > 0; j--) {
                    if(pick[j] != 0) {
                        if(pick[i] == pick[j]) {
                            answer += 2;
                            pick[i] = pick[j] = 0;
                        }
                        break;
                    }                    
                }
            }
        }
        
        return answer;
    }


    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = solution(board, moves);

        System.out.println(answer);


        /*
        0 0 0 0 0
        0 0 1 0 3
        0 2 5 0 1
        4 2 4 4 2
        3 5 1 3 1
        */

        /*
        0 0 0 0 0
        0 0 0 0 0
        0 0 5 0 0
        0 2 4 4 2
        0 5 1 3 1
        */

        // 1 5 3 5 1 2 1 4

        // 4 3 1 1 3 2 0 4

    }
}
