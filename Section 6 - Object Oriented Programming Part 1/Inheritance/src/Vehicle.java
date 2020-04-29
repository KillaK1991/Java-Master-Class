public class Vehicle {
    private String name;
    private String size;

    private int currentSpeed;
    private String currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = "";
    }

    public void steer(String currentDirection){
        this.currentDirection = currentDirection;
    }

    public void move(int currentSpeed, String currentDirection){
        this.currentSpeed = this.currentSpeed + currentSpeed;
        System.out.println("You are moving at " + this.currentSpeed + " mph, going " + this.currentDirection);
    }

    public void stop(int currentSpeed, String currentDirection){
        this.currentSpeed = 0;
        this.currentDirection = "Stopped";
    }

    public String getName(){
        return this.name;
    }

    public String getSize(){
        return this.size;
    }

    public int getCurrentSpeed(){
        return this.currentSpeed;
    }

    public String getCurrentDirection(){
        return this.currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
}
