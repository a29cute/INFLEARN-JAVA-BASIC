package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅

        parent1.parentMethod();
    }
}
