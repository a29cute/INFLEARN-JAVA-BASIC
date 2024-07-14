package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
        this(name, age, 50);
    }

    // 생성자(메서드와 비슷하지만 반환타입 없음)
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
