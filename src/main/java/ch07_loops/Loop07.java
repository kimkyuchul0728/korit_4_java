package ch07_loops;
/*
    몇 줄의 별을 찍겠습니까? >>> 3
 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍겠습니까? >>> ");
        int row = scanner.nextInt();
        for (int i = row ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0 ; i < row ; i++) {
            for (int j = row ; j - i > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 오늘 복습 시간에 md 파일 정리할 때 # 1 풀이법으로도 작성해보세요.
    }
}
