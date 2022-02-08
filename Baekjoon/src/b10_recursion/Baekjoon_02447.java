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
    
    static void star(int n) {

        if (n == 1) {
            System.out.print("*");
        }
        else {
            for(int i = 0; i < 9; i++) {
                if(i == 4) {
                    System.out.print(" ");
                } else if ((i+1) % 3 == 0) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }

    }

    public static void main(String[] args) {
        
        for(int i = 0; i < 9; i++) {
            if(i == 4) {
                System.out.print(" ");
            } else if ((i+1) % 3 == 0) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }
    }
}
