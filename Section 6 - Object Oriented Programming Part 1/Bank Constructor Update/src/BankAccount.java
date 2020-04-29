public class BankAccount {

    //Field Values
    private String customerName;
    private String email;
    private String phoneNumber;
    private int accountNumber;
    private double balance;

    public BankAccount(){
        this("Liquid Snake", 654321, 1000000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, int accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void depositFunds(double deposit){
        System.out.println("You have deposited $" + deposit + " dollars");
        this.balance = this.balance + deposit;
        System.out.println("Your new balance is $" + this.balance);
    }

    public void withdrawFunds(double withdraw){
        if(this.balance - withdraw >= 0){
            this.balance  = this.balance - withdraw;
            System.out.println("You withdrew $" + withdraw + " and your new balance is $" + this.balance);
        }else{
            System.out.println("Your current balance is $" + balance + " and cannot withdraw $" + withdraw);
        }
    }


}
