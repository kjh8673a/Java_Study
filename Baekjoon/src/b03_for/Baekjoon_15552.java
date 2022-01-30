package b03_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
03 for문
문제번호: 15552
제목: 빠른 A+B
풀이)
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

Scanner 시간초과 -> BufferedReader 사용

println 호출횟수 증가 시간초과 -> 
    1) StringBuilder로 하나의 문자열로 연결시킨 뒤 가장 마지막에 연결된 문자열 출력
    2) BufferedWriter로 버퍼에 담아두었다가 한번에 데이터를 보낸다


*/

// public class Baekjoon_15552 {
//     public static void main(String[] args) throws IOException {
        
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());
        
//         StringTokenizer st; // 문자열 분리

//         for (int i = 0; i < n; i++) {
//             st = new StringTokenizer(br.readLine()," ");
//             bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//         }
//         br.close();

//         bw.flush(); // 버퍼를 비운뒤(flush) 닫는다(close)
//         bw.close();

//     }
// }

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();

        System.out.println(sb);
    }
}
