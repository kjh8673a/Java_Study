package b10_recursion;

/*
10 재귀
문제번호: 02447
제목: 별 찍기 - 10


풀이)
n = 3의 거듭제곱(3, 9, 27...)

n = 3 ->
***
* *
***
*/

public class Baekjoon_02447 {
    
    static void star(int n, int x, int y) {
        if (n > 3) {
            star(n/3, x, y);
        } else if (n == 3) {
            for (x = 0; x < 3; x++) {
                for(y = 0; y < 3; y++) {
                    if(x == 1 && y == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        
    }

    public static void main(String[] args) {
        
        star(9, 0, 0);
    }
}
