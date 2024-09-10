package poly.ex1_3;

public class Dog extends Animal {
    String name = "강아지";

    public void sound() {
        System.out.println("멍멍");
    }

    public void move() {
        System.out.println(name + "가 움직입니다.");
    }
}
