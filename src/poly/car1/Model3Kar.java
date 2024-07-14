package poly.car1;

public class Model3Kar implements Car{

    @Override
    public void startEngine(){
        System.out.println("ModelK3Car.startEngine");
    }

    @Override
    public void offEngine(){
        System.out.println("ModelK3Car.offEngine");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("ModelK3Car.pressAccelEngine");
    }

}
