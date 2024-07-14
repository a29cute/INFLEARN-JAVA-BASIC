package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스는 아래처럼 인스턴스 생성이 불가하다.
        // AbstractAnimal animal = new AbstractAnimal();

        AbstractAnimal dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
