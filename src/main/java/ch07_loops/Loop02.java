package ch07_loops;
/*
            while(조건식1) {
                반복실행문1a
                while(조건식2) {
                    반복실행문2
                }
                반복실행문1b
            }

            그러다보니까 while과 if를 섞어서도 쓸 수 있습니다.
*/
public class Loop02 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 1일차 3교시입니다 / 5일차 3교시입니다.
//        int day = 1;
//        while (day < 6) {
//            int lesson = 1;             //반복은 내에 변수를 선언하고 초기화했습니다.
//            while (lesson < 4) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++;
//        }

        // 이상의 코드를 응용하여
        /*
            구구단이 출력되도록 2중 while문을 작성하시오.
         */
         int A = 2;
         while (A < 10) {
             int B = 1;
             while (B < 10) {
                 System.out.println(A + " X " + B + " = " + (A * B));
                 B++;
             }
             A++;
         }
    }
}
