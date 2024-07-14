package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경
        Model3Kar model3Kar = new Model3Kar();
        driver.setCar(model3Kar);
        driver.drive();

    }
}
