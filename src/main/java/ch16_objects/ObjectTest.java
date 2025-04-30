package ch16_objects;
/*
    필드를 전부 private으로 선언하시오
    String name;
    String address;

    기본생성자, 매개변수 생성자(하나짜리 두개 두개짜리 하나) 생성하시오
    ex) 기본
 */

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    public ObjectTest(String name) {
        System.out.println("name 매개변수로 객체가 생성되었습니다.");
        this.name = name;
    }

//    public ObjectTest(String address) {
//        this.address = address;
//    }
/*
    이상의 코드가 오류가 발생하는 이유 :
    1. 매개변수와 field는 서로 다른 개념
        호출 상황을 가정하겠습니다. -> ObjectTestMain에서 객체 생성을 하게 될겁니다.
    ObjectTest object1 = new ObjectTest("여러분 이름")
    ObjectTest object2 = new ObjectTest("여러분 주소")
 */
    public ObjectTest(String name, String address) {
        System.out.println("name, address 매개변수로 객체가 생성되었습니다.");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    // Object 클래스의 메서드들을 override 할 겁니다.

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " +
                address;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
