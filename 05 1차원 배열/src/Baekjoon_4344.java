import java.util.Scanner;

/*
문제번호: 4344
제목: 평균은 넘겠지
문제: 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
    
    당신은 그들에게 슬픈 진실을 알려줘야 한다.

    첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

    둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
    이어서 N명의 점수가 주어진다. 
    점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

    각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
*/

public class Baekjoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt(); // 테스트 케이스의 개수 입력
        double[] rate = new double[c]; // 각 테스트 케이스 마다 비율계산하여 배열에 저장

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt(); // 각 테스트 케이스 마다 학생의 수 n 입력
            double[] arr = new double[n];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                double s = sc.nextDouble(); // n명의 점수 입력
                arr[j] = s; // 점수 배열에 넣어놓기
                sum += s; // 점수 합계 계산
            }
            double avg = sum / n; // 평균
            
            double people = 0;
            for (int k = 0; k < arr.length; k++) { // 평균보다 점수가 높은 사람 몇명인지
                if (arr[k] > avg) {
                    people += 1;
                }
            }

            double r = (people/arr.length)*100; 
            rate[i] = r;
        }
        sc.close();

        for (int h = 0; h < rate.length; h++) {
            System.out.printf("%.3f%%\n", rate[h]);
        }
    }
}