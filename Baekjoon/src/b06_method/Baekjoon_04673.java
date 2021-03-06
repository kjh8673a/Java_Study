package b06_method;

/*
06 함수
문제번호: 04673
제목: 정수 셀프 넘버


풀이)

양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 

예를 들어, d(75) = 75+7+5 = 87이다.

n을 d(n)의 생성자라고 한다. 
33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 

생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 
1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력


*/

public class Baekjoon_04673 {
    static int d(int n) { // 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
        
        // 정수 n의 자리수 구하기
        int cnt = 0;
        int a = n;
        while (a > 0) {
            // a를 10으로 나눈 몫이 0보다 클때마다 자리수 카운트 +1
            a = a/10;
            cnt++;
        }
        // System.out.println("자리수 : " + cnt);

        // n과 n의 각 자리수를 더하기 (d(n))
        // sum의 초기값 n으로 설정, 
        // n을 10으로 나눈 나머지를 sum에 더하고, 
        // n을 10으로 나눈 몫을 새로운 n으로 설정하여 자리수만큼 for문 반복
        int sum = n;
        int b = n;
        for (int i=0; i < cnt; i++) {
            sum += b%10;
            b = b/10;
        }
        // System.out.println("d(n) : " + sum);
        // 구한 sum을 반환하는 함수 d(n)
        return sum;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[10000]; // 0~9999 배열 생성(1~10000까지 정보 저장)
        
        for (int i = 1; i <= 10000; i++) {
            if (d(i) <= 10000) { // d(n)이 10000이하일때
                arr[d(i)-1]++; // 배열에서 d(i)-1번째 배열 ++ (1에 대한 정보는 arr[0]에 저장)
            } else { //d(n)이 10000보다 커지면 저장할 배열이 없으므로 패스
                continue;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) { // 배열의 값이 0이라는 것은 d(n)으로 반환되지 않았다는 뜻
                System.out.println(i+1);
            } else {
                continue;
            }
        }
    }
}
