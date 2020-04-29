public class Hyundai extends Car {

    //Field Values
    private String name;
    private int cylinders;

    public Hyundai(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    public void brake() {
        super.brake();
    }
}
