package poly.car0;

public class Driver {

    private K3Car k3Car;
    private ModelK3Car modelK3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModelK3Car(ModelK3Car modelK3Car) {
        this.modelK3Car = modelK3Car;
    }


    public void drive(){
        System.out.println("자동차를 운전합니다.");

        if(k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelEngine();
            k3Car.offEngine();
        } else if(modelK3Car != null){
            modelK3Car.startEngine();
            modelK3Car.pressAccelEngine();
            modelK3Car.offEngine();
        }

    }
}
