package ch09_classes;

import java.lang.reflect.Field;

public class ClassA {
    int num;
    String name;
    int score;
    public void displayProfile() {
        System.out.println("[ 실행 결과 ]");
        System.out.println(num + " 학번의 학생의 이름은 " + name + "이고, " + score + "점입니다.");
    }


    public void callName() {        //public static void가 아니네요
        System.out.println(name + "을 부릅니다.");
    }
}
