public class Main {
    public static void main(String[] args){
//        BankAccount liquidAccount = new BankAccount();
//        BankAccount snakeAccount = new BankAccount("Solid Snake", 123456, 1000000);
//        snakeAccount.depositFunds(1000);
//        snakeAccount.withdrawFunds(10000);
//        snakeAccount.withdrawFunds(1000000);


        VipCustomer newVip = new VipCustomer();
        System.out.println(newVip.getName()); //Should be Snake Eater
        System.out.println(newVip.getCreditLimit()); //Should be $1000000
        System.out.println(newVip.getEmailAddress()); //Should be StillInADream@gmail.com

        VipCustomer secondVip = new VipCustomer("Otacon", 10);
        System.out.println(secondVip.getName()); //Should be Otacon
        System.out.println(secondVip.getCreditLimit()); //Should be 10
        System.out.println(secondVip.getEmailAddress()); //Should be Default@gmail.com

        VipCustomer thirdVip = new VipCustomer("Gray Fox", 0, "FoxDie@gmail.com");
        System.out.println(thirdVip.getName()); //Should be Gray Fox
        System.out.println(thirdVip.getCreditLimit()); //Should be 0
        System.out.println(thirdVip.getEmailAddress()); //Should be FoxDie@gmail.com
    }

}
