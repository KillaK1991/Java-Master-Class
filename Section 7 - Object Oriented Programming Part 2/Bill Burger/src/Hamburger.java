public class Hamburger {

    //Constant variables
    private final static double LETTUCE_PRICE = 0.10;
    private final static double TOMATO_PRICE = 0.05;
    private final static double CHEESE_PRICE = 0.50;
    private final static double ONION_PRICE = 0.25;

    //Field values
    private String burgerName;
    private String rollType;
    private String meatType;
    private double hamburgerPrice;
    private int lettuce;
    private int tomato;
    private int cheese;
    private int onion;
    private int totalAdditions = 1;

    //Hamburger Constructor
    public Hamburger(){

    }

    public Hamburger(String burgerName, String rollType, String meatType, double hamburgerPrice){
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.meatType = meatType;
        this.hamburgerPrice = hamburgerPrice;
    }


    //Public Hamburger Methods
    public void addLettuce(){
        if(addItem()){
            System.out.println("Lettuce added");
            this.lettuce = this.lettuce + 1;
        }
    }

    public void addTomato(){
        if(addItem()){
            System.out.println("Tomato added");
            this.tomato = this.tomato + 1;
        }
    }

    public void addCheese(){
        if(addItem()){
            System.out.println("Cheese added");
            this.cheese = this.cheese + 1;
        }

    }

    public void addOnion(){
        if(addItem()){
            System.out.println("Onion added");
            this.onion = this.onion + 1;
        }
    }

    public void addTopping(){
        this.totalAdditions = this.totalAdditions + 1;
    }

    public boolean addItem(){
        if(this.totalAdditions <= 4){
            addTopping();
            return true;
        }else{
            cannotAddItem();
            return false;
        }
    }

    public void cannotAddItem(){
        System.out.println("Cannot add any more toppings to your burger");
    }


    public double calculateToppingsPrice(){
        double lettucePrice = this.lettuce * LETTUCE_PRICE;
        double tomatoPrice = this.tomato * TOMATO_PRICE;
        double cheesePrice = this.cheese * CHEESE_PRICE;
        double onionPrice = this.onion * ONION_PRICE;
        return lettucePrice + tomatoPrice + cheesePrice + onionPrice;
    }

    public double getBurgerPrice(){
        return this.hamburgerPrice + calculateToppingsPrice();
    }

    public void getToppings(){
        if(this.lettuce >= 1){
            System.out.println("Lettuce: " + getLettuce());
        }

        if(this.tomato >= 1){
            System.out.println("Tomato: " + getTomato());
        }

        if(this.cheese >= 1){
            System.out.println("Cheese: " + getCheese());
        }

        if(this.onion >= 1){
            System.out.println("Onion: " + getOnion());
        }
    }

    //Hamburger getter methods

    public String getBurgerName() {
        return this.burgerName;
    }

    public String getRollType() {
        return this.rollType;
    }

    public String getMeatType() {
        return this.meatType;
    }

    public double getHamburgerPrice() {
        return this.hamburgerPrice;
    }

    public int getTotalAdditions(){
        return this.totalAdditions;
    }

    public int getLettuce() {
        return this.lettuce;
    }

    public int getTomato() {
        return this.tomato;
    }

    public int getCheese() {
        return this.cheese;
    }

    public int getOnion() {
        return this.onion;
    }
}
