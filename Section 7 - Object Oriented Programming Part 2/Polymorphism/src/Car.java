public class Car {

    //Field Values
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engineOn;
    private int currentSpeed;

    public Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine(){
        if(this.engine){
            System.out.println("Engine Started on " + this.name);
            this.engineOn = true;
        }else{
            System.out.println("No engine to start");
        }
    }

    public void accelerate(int speed){
        if(this.engineOn){
            this.currentSpeed = this.currentSpeed + speed;
            System.out.println("Accelerating to " + speed + "mph");
        }else{
            System.out.println("Engine is off. Turn Engine on to accelerate car");
        }
    }

    public void brake(){
        if(this.engineOn && this.currentSpeed > 0){
            this.currentSpeed = 0;
            System.out.println("Braked");
        }else{
            System.out.println("Vehicle not in motion, so no brake needed");
        }
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
