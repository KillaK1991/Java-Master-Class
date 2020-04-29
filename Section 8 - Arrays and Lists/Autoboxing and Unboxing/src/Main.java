public class Main {

    public static void main(String[] args){

        //Creating a new Bank
        Bank bankOfHawaii = new Bank("Bank Of Hawaii");

        //Adding branches to the bank
        bankOfHawaii.addBranch("Ward Branch");
        bankOfHawaii.addBranch("Ala Moana Branch");
        bankOfHawaii.addBranch("Manoa Branch");
        bankOfHawaii.addBranch("Waianae Branch");
        bankOfHawaii.addBranch("Kapalama Branch");

        //Adding customers to the Ward Branch

        bankOfHawaii.addCustomerToBranch("Ward Branch", "Jim", 50.00);
        bankOfHawaii.addCustomerToBranch("Ward Branch", "Jerry", 100.00);
        bankOfHawaii.addCustomerToBranch("Ward Branch", "James", 75.00);
        bankOfHawaii.addCustomerToBranch("Ward Branch", "Jim", 10.00);

        //Adding customers to the Kapalama Branch

        bankOfHawaii.addCustomerToBranch("Kapalama Branch", "Keawe", 200.00);
        bankOfHawaii.addCustomerToBranch("Kapalama Branch", "Ku", 300.00);
        bankOfHawaii.addCustomerToBranch("Kapalama Branch", "Ikaika", 150.00);
        bankOfHawaii.addCustomerTransaction("Kapalama Branch", "Keawe", 10.00);

        //Method to show the Branches of the bank
        bankOfHawaii.showBankBranches();

        //Method to show the customers of a branch
        bankOfHawaii.showCustomersOfBranch("Ward Branch");
        bankOfHawaii.showCustomersOfBranch("Kapalama Branch");

        //Method to show the customers of a branch along with their transactions
        bankOfHawaii.showCustomersOfBranchAndTransactions("Ward Branch");
        bankOfHawaii.showCustomersOfBranchAndTransactions("Kapalama Branch");

        //Test Cases to test
        bankOfHawaii.showCustomersOfBranch("Manoa Branch");
        bankOfHawaii.showCustomersOfBranchAndTransactions("Waianae Branch");
        bankOfHawaii.addBranch("Ward Branch");
    }
}
