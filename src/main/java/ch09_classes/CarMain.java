package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "빨강";
        car1.speed = 100;
        Car car2 = new Car();
        car2.color = "노랑";
        car2.speed = 200;
        car1.drive();
        car1.brake();
        car1.displayInfo();
        car2.drive();
        car2.brake();
        car2.displayInfo();



    }
}
