package ch07_loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        int i = 0;
//        int sum = 0;
//        while (i < 101) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//            i++;
//        } System.out.println(sum);
        /*
            구구단이 출력되도록 2중 while문을 작성하시오.
         */
//        int A = 2;
//        while (A < 10) {
//            int B = 1;
//            while (B < 10) {
//                System.out.println(A + "x" + B + "=" + (A * B));
//                B++;
//            }A++;
//        }
//        int A = 1;
//        while (A < 101) {
//            System.out.print(A + " ");
//            if (A % 10 ==0) {
//                System.out.println();
//            } A++;
//        }
// 1부터 100까지 중 홀수 합을 구하는 for문을 작성하시오. (즉, for문 내에 if가 중헙 가능)
//        int num = 0;
//        for (int A = 1 ; A < 101 ; A+=2) {
//            num += A;
//        } System.out.println(num);
        /*
            숫자를 입력 받아서 1부터 n까지 더하는 반복문을 작성할 겁니다.

            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int A = 1 ; A < (num + 1) ; A++) {
            sum += A;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
    }
}
