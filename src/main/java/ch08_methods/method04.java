package ch08_methods;

import java.util.Scanner;

/*
        bmi 계산기 method를 정의하고 실행시킬겁니다.
        메서드명 calculateBmi()
        return type : void
        매개변수 유무 : 없음
     */
public class method04 {
    // 여기에 정의할겁니다
        public static void calculateBmi() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("키(cm)를 입력하세요 >>> ");
            double height = scanner.nextDouble();
            System.out.print("몸무게(kg)를 입력하세요 >>> ");
            double weight = scanner.nextDouble();
            double BMI;
            double m = height / 100;
            BMI = weight / (m * m);
            String grade;
            if (BMI > 25) {
                grade = "비만";
            } else if (BMI > 23) {
                grade = "과체중";
            } else if (BMI > 18.5) {
                grade = "정상";
            } else {
                grade = "저체중";
            }
            System.out.println("당신의 BMI 지수는 " + BMI + "이고, " + grade + "입니다.");


        }

    public static void main(String[] args) {
        calculateBmi();
        /*
            실행 예
            키(cm)를 입력하세요 >>>
            몸무게(kg)를 입력하세요 >>>
            당신의 BMI 지수는 ~~이고, ~~입니다.
         */
    }
}
