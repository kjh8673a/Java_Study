package Kakao;

public class Programmers_SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] arr1new = new int[n];
        int[] arr2new = new int[n];

        String[] answer = new String[n];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new String();
        }

        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < n; j++) {
                int cnt = 0;
                if(Math.pow(2, i) <= arr1[j]) {
                    arr1new[j] += Math.pow(10, i);
                    arr1[j] -= Math.pow(2, i);
                    cnt++;
                }

                if(Math.pow(2, i) <= arr2[j]) {
                    arr2new[j] += Math.pow(10, i);
                    arr2[j] -= Math.pow(2, i);
                    cnt++;
                }

                if(cnt > 0) {
                    answer[j] += "#";
                }else {
                    answer[j] += " ";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = solution(n, arr1, arr2);
        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
