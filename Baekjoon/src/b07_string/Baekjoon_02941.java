package b07_string;

import java.util.Scanner;

/*
07 문자열
문제번호: 02941
제목: 크로아티아 알파벳
문제:
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.


*/

public class Baekjoon_02941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        int cnt = 0; // 크로아티아 알파벳 개수 카운트
        for (int i = 0; i < s.length(); i++) {
            // 문자열의 마지막 문자가 c라면, if문을 실행하지만,
            // i+1은 존재하지 않기때문에 에러가 발생한다. StringIndexOutOfBoundsException
            // 에러가 생기지 않도록 i값이 s.length()-1보다 작을때만 if문을 실행하게 한다.

            if (s.charAt(i) == 'c') {
                if (i < s.length() - 1) { // i+1값을 비교해야하므로 i값이 s.length()-1보다 작을때만
                    if (s.charAt(i + 1) == '=') {
                        i++; // c=
                    } else if (s.charAt(i + 1) == '-') {
                        i++; // c-
                    }
                }
            } else if (s.charAt(i) == 'd') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'z') {
                        if (i < s.length() - 2) { // i+2값을 비교해야하므로 i값이 s.length()-2보다 작을때만
                            if (s.charAt(i + 2) == '=') {
                                i += 2; // dz=
                            }
                        }
                    } else if (s.charAt(i + 1) == '-') {
                        i++; // d-
                    }
                }
            } else if (s.charAt(i) == 'l') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++; // lj
                    }
                }
            } else if (s.charAt(i) == 'n') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++; // nj
                    }
                }
            } else if (s.charAt(i) == 's') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++; // s=
                    }
                }
            } else if (s.charAt(i) == 'z') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++; // z=
                    }
                }
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}