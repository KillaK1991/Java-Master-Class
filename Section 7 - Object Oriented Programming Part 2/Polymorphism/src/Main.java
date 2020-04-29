
public class Main {

    public static void main(String[] args){
        Car newCar = new Car("Base Car", 4);
        Toyota toyotaCar = new Toyota("Corolla", 4);

        newCar.startEngine();
        toyotaCar.startEngine();

        newCar.accelerate(4);
        toyotaCar.accelerate(4);

        newCar.brake();
        toyotaCar.brake();

    }
}
