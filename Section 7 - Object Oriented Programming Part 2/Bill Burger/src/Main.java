import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static int userInput;
    private static Hamburger classicHamburger;
    private static Healthy healthyHamburger;
    private static Deluxe deluxeHamburger;


    public static void main(String[] args) {
        System.out.println("Welcome to Bills Burgers\n");
        System.out.println("What kind of burger would you like?\n");
        System.out.println("1. Classic Hamburger");
        System.out.println("2. Healthy Hamburger");
        System.out.println("3. Deluxe Hamburger\n");

        System.out.print("Enter numeric value: ");
        checkuserInput();
        addItemsToBurger();

        System.out.println("Your burger has the following toppings");
        displayBurgerToppings();
        displayBurgerPrice();

    }

    public static void checkuserInput() {
        boolean validInteger = scanner.hasNextInt();
        if (validInteger) {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("You selected a classic burger");
                    classicHamburger = new Hamburger("Classic Hamburger", "White", "Beef", 2.0);
                    break;

                case 2:
                    System.out.println("You selected a healthy burger");
                    healthyHamburger = new Healthy("Healthy Hamburger", "Wheat", "Turkey", 3.0);
                    break;

                case 3:
                    System.out.println("You selected a deluxe burger");
                    deluxeHamburger = new Deluxe("Deluxe Hamburger", "White", "Beef", 2.0);
                    break;
            }
        } else {
            System.out.println("Please enter a valid numeric value");

        }

        scanner.close();
    }

    public static void addItemsToBurger(){
        if(classicHamburger != null){
            classicHamburger.addTomato();
            classicHamburger.addCheese();
            classicHamburger.addOnion();
            classicHamburger.addLettuce();
        }else if(healthyHamburger != null){
            healthyHamburger.addAvacado();
            healthyHamburger.addSprouts();
            healthyHamburger.addTomato();
            healthyHamburger.addCheese();
            healthyHamburger.addOnion();
            healthyHamburger.addLettuce();
        }else if(deluxeHamburger != null){
            deluxeHamburger.addCheese();
        }
    }

    public static void displayBurgerToppings(){
        if(classicHamburger != null){
            classicHamburger.getToppings();
        }else if(healthyHamburger != null){
            healthyHamburger.getToppings();
        }else if(deluxeHamburger != null){
            deluxeHamburger.getToppings();
        }
    }

    public static void displayBurgerPrice(){
        if(classicHamburger != null){
            System.out.println("The Total cost of your burger is $" +  classicHamburger.getBurgerPrice() + "\nBurger Base Price: $" + classicHamburger.getHamburgerPrice() +
                    " \nToppings Price: $" + classicHamburger.calculateToppingsPrice());
        }else if(deluxeHamburger != null){
            System.out.println("The Total cost of your burger is $" +  deluxeHamburger.getBurgerPrice() + "\nBurger Base Price: $" + deluxeHamburger.getHamburgerPrice() +
                    " \nToppings Price: $" + deluxeHamburger.calculateToppingsPrice());
        }else if(healthyHamburger != null){
            System.out.println("The Total cost of your burger is $" +  healthyHamburger.getBurgerPrice() + "\nBurger Base Price: $" + healthyHamburger.getHamburgerPrice() +
                    " \nToppings Price: $" + healthyHamburger.calculateToppingsPrice());
        }
    }
}
