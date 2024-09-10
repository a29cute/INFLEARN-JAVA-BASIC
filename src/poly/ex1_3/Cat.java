package poly.ex1_3;

public class Cat extends Animal {
    String name = "고양이";

    public void sound() {
        System.out.println("야옹");
    }

    public void move() {
        System.out.println(name + "가 움직입니다.");
    }
}
