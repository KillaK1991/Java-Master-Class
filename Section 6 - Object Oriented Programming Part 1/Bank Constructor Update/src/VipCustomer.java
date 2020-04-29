public class VipCustomer {

    //Field Values
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Snake Eater", 1000000, "StillInADream@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "Default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
