package b04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
04 while문
문제번호: 10951
제목: A+B - 4
풀이) 
hasNext() : 다음 입력에 입력된 값이 있다면 true 없거나 ctrl+z 입력시 false
*/

// public class Baekjoon_10951 {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         while(sc.hasNextInt()) { // hasNextInt(): 입력값이 정수일 경우 true반환, 정수가 아닐경우 예외 -> false반환
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(a+b);
//         }
//         sc.close();
//     }
// }

public class Baekjoon_10951 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while((str=br.readLine()) != null) { // readLine() -> throws IOException 해줘야한다
            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken()); // StringTokenizer사용하면 문자열로 반환한다 -> int형으로 변환해줘야한다(Integer.parseInt)
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}