package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 비어있는 String 배열을 1개짜리를 만들겁니다.

        // 0번지에 김영 1번지에 김이 ... 3번지에 김삼까지
        // Scanner로 입력할 수 있도록 작성하겠습니다.
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];
        for (int i = 0 ; i < names.length ; i++) {
            System.out.print( i + 1 + "번 째의 학생 이름을 입력하세요 >>> ");
            names[i] = scanner.nextLine();
            System.out.println(names[i]);
        }
        // 주소지에 값을 대입하기 위한 반복문 작성

        for (int i = 0 ; i < names.length ; i++) {
            System.out.println(i + 1 + "번 쩨의 학생 출력 : " + names[i] + " ");
        }
    }
}
