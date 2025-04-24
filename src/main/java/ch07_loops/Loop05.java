package ch07_loops;
/*

 */
public class Loop05 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 5일차 3교시입니다.
//        for (int i = 1 ; i < 6 ; i++) {
//            for (int j = 1 ; j < 4 ; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }
//        for (int i = 2 ; i < 10 ; i++) {
//            for (int j = 1 ; j < 10 ; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }
//        for (int i = 1 ; i < 101 ; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
        for (int i = 1 ; i < 101 ; i+=10) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " " + (i + 3) + " " + (i + 4) + " " + i + 5 + " " + i + 6 + " " + i + 7 + " " + i + 8 + " " + (i + 9));

        }
    }
}
