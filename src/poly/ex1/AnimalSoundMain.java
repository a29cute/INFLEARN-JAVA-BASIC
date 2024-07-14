package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        cat.sound();
        soundCaw(caw);
        System.out.println("동물 소리 테스트 종료");

    }

    private static void soundCaw(Caw caw){
        caw.sound();
    }

}
