package ch04_scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //이름 나이 주소를 작성하고 이를 이용한 자기소개 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 작성하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("나이를 작성하세요 >>> ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소를 작성하세요 >>> ");
        String address = scanner.nextLine();
        System.out.println("내 이름은" + name + "이고, 나이는 " + age + "살이야. 나는 " + address + "에 살고 있어");

    }
}
