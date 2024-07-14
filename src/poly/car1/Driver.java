package poly.car1;

public class Driver {
    private  Car car;

    public void setCar(Car car) {
        System.out.println("자동차 설정 : " + car); // 인스턴스가 출력된다.
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();

    }
}
