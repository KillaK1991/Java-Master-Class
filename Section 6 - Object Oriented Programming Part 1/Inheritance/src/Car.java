public class Car extends Vehicle {
    private String vinNumber;
    private int numberOfDoors;
    private int numberOfTires;
    private int carSeats;
    private int gears;
    private int currentGear;

    public Car(String name, String size, String vinNumber, int numberOfDoors, int numberOfTires, int carSeats, int gears) {
        super(name, size);
        this.vinNumber = vinNumber;
        this.numberOfDoors = numberOfDoors;
        this.numberOfTires = numberOfTires;
        this.carSeats = carSeats;
        this.gears = gears;
        this.currentGear = 0;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
