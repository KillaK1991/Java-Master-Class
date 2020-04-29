public class Carpet {

    //Field Values
    private double cost;

    public Carpet(double cost){
        if(cost >= 0){
            this.cost = cost;
        }

        if(cost < 0){
            this.cost = 0;
        }
    }

    public double getCost(){
        return this.cost;
    }
}
