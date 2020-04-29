public class Toyota extends Car{

    //Field Values
    private String name;
    private int cylinders;

    public Toyota(String name, int cylinders){
       super(name, cylinders);

    }

    @Override
    public void startEngine() {
        System.out.println(this.getName() + " Engine Started");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(this.getName() + " Running at " + speed + " mph");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " braked");
    }

}
