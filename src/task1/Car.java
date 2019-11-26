package task1;

import java.util.Objects;

public class Car extends Transport implements SomeSing {
    public String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, speed);
    }

    void myMethod(String a, int b){
        System.out.println("Used method <myMethod> with args: String = "+a+", int = "+b);
    }
    void myMethod(String a){
        System.out.println("Used method <myMethod> with args: String = "+a);
    }
}
