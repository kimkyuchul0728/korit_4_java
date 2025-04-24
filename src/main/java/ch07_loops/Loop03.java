package ch07_loops;
/*

 */
public class Loop03 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 101) {
//            System.out.print(i++);
//        }
        // # 1 반복을 100번 돌리는 방법
        int i1 = 1;
        while (i1 < 101) {
            System.out.print(i1 + " ");
            if (i1 % 10 == 0) {
                System.out.println();
            }
            i1++;
        }

        // #2 반복을 10번 돌리는 법
//        int i2 = 1;
//        while (i2 < 101) {
//            System.out.println(i2 + " " + (i2 + 1) + " " + (i2 + 2) + " " + (i2 + 3) + " " + (i2 + 4) + " " + (i2 + 5) + " " + (i2 + 6) + " " + (i2 + 7) + " " + (i2 + 8) + " " + (i2 + 9) + " " );
//            i2 += 10;




    }
}
