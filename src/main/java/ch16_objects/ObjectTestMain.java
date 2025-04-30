package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest();
        ObjectTest objectTest2 = new ObjectTest("김규철");
        ObjectTest objectTest3 = new ObjectTest("김규철", "부산시 사하구");
        objectTest3.displayInfo();
        System.out.println(objectTest3);
        Teacher teacher1 = new Teacher("김규철", "코리아아이티학교");
        System.out.println(teacher1);
    }
}
