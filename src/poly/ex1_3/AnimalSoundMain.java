package poly.ex1_3;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        dog.move();

        cat.sound();
        cat.move();

        caw.sound();
        caw.move();
        System.out.println("동물 소리 테스트 종료");

    }
}
