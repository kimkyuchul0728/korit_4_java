package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(20250002);
        Student student3 = new Student("김삼");
        Student student4 = new Student(20250004, "김사");
        Student student5 = new Student(20250005, "김오", 80.7);
        // 이상의 방법들로 객체를 생성했을 때, 비어있는 속성값들이 있습니다.
        // 채우기 위한 방법은 20250424에 학습했습니다.
        student1.studentCode = 20250001;
//        student2.studentCode = 20250002;
        student3.studentCode = 20250003;
//        student4.studentCode = 20250004;
//        student5.studentCode = 20250005;
        student1.name = "김일";
        student2.name = "김이";
//        student3.name = "김삼";
//        student4.name = "김사";
//        student5.name = "김오";
        student1.score = 4.5;
        student2.score = 100;
        student3.score = 95.8;
         student4.score = 4.0;
//        student5.score = 80.7;
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}
