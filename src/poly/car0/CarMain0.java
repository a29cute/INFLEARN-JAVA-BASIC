package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        ModelK3Car modelK3Car = new ModelK3Car();
        driver.setK3Car(null);
        driver.setModelK3Car(modelK3Car);
        driver.drive();
    }
}
