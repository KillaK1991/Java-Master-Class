public class Healthy extends Hamburger {

    private final static double AVACADO_PRICE = 0.75;
    private final static double SPROUTS_PRICE = .20;

    //Constant Variables
    private int avacado;
    private int sprouts;
    
    public Healthy(String burgerName, String rollType, String meatType, double hamburgerPrice) {
        super(burgerName, rollType, meatType, hamburgerPrice);
    }

    public void addAvacado(){
        if(addItem()){
            System.out.println("Avacado added");
            this.avacado = this.avacado + 1;
        }
    }

    public void addSprouts(){
        if(addItem()){
            System.out.println("Sprouts added");
            this.sprouts = this.sprouts + 1;
        }
    }

    @Override
    public boolean addItem(){
        if(this.getTotalAdditions() <= 6){
            addTopping();
            return true;
        }else{
            cannotAddItem();
            return false;
        }
    }

    @Override
    public double calculateToppingsPrice() {
        double avacadoPrice = this.avacado * AVACADO_PRICE;
        double sproutsPrice = this.sprouts * SPROUTS_PRICE;
        return avacadoPrice + sproutsPrice + super.calculateToppingsPrice();
    }

    @Override
    public double getBurgerPrice(){
        return getHamburgerPrice() + calculateToppingsPrice();
    }

    @Override
    public void getToppings() {
        super.getToppings();
        if(this.avacado >= 1){
            System.out.println("Avacado: " + getAvacado());
        }

        if(this.sprouts >= 1){
            System.out.println("Sprouts: " + getSprouts());
        }

    }

    //Healthy getters
    public int getAvacado() {
        return avacado;
    }

    public int getSprouts() {
        return sprouts;
    }
}
