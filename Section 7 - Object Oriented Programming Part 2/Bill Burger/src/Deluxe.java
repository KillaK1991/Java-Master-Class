public class Deluxe extends Hamburger {

    private final static double CHIPS_PRICE = 0.25;
    private final static double DRINK_PRICE = 0.75;

    //Field Values
    private int chips;
    private int drink;

    public Deluxe(String burgername, String rollType, String meatType, double hamburgerPrice){
        super(burgername, rollType, meatType, hamburgerPrice);
        this.chips = 1;
        this.drink = 1;
    }

    @Override
    public boolean addItem() {
        if(getTotalAdditions() < 0){
            addTopping();
            return true;
        }else{
            cannotAddItem();
            return false;
        }
    }

    @Override
    public double calculateToppingsPrice() {
        double chipsPrice = this.chips * CHIPS_PRICE;
        double drinkPrice = this.drink * DRINK_PRICE;
        return chipsPrice + drinkPrice;
    }

    @Override
    public double getBurgerPrice() {
        return getHamburgerPrice() + calculateToppingsPrice();
    }

    @Override
    public void getToppings(){
        System.out.println("Chips: " + this.chips);
        System.out.println("Drink: " + this.drink);
    }
}
