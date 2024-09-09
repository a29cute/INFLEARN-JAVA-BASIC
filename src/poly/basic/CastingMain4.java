package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅
        Child child1 = (Child)parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2;  // 런타임 오류, Parent 객체 생성시에는 자식 메모리는 생성되지 않는다.
        child2.childMethod();
    }
}
