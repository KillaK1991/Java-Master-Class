public class Main {

    public static void main(String[] args){
        BankAccount liquidAccount = new BankAccount();
        BankAccount snakeAccount = new BankAccount("Solid Snake", 123456, 1000000);
        snakeAccount.depositFunds(1000);
        snakeAccount.withdrawFunds(10000);
        snakeAccount.withdrawFunds(1000000);
    }
}
