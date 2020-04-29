import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> branchCustomers;

    Branch(String branchName){
        this.branchName = branchName;
        branchCustomers = new ArrayList<Customer>();
    }

    public void addCustomer(String customerName, double deposit){
        if(checkCustomer(customerName)){
            branchCustomers.add(new Customer(customerName, deposit));
            System.out.println(customerName + " added to the " + this.branchName + " with an initial deposit of $" + deposit);
        }else{
            System.out.println(customerName + " could not be added because customer already exists at this branch");
        }
    }

    public void makeTransaction(String customerName, double transactionAmount){
        if(!checkCustomer(customerName)){
            commitTransaction(customerName, transactionAmount);
        }else{
            System.out.println("Transactions could not be completed because " + customerName + " is not a member of this branch");
        }
    }

    private boolean checkCustomer(String customerName){
        for(Customer customer : branchCustomers){
            if(customer.getCustomerName().equals(customerName)){
                return false;
            }
        }
        return true;
    }

    private void commitTransaction(String customerName, Double transactionAmount){
        for(Customer customer : branchCustomers){
            if(customer.getCustomerName().equals(customerName)){
                customer.addTransaction(transactionAmount);
            }
        }
    }

    public void showCustomers(){
        if(this.branchCustomers.size() == 0){
            System.out.println(this.branchName + " has no customers");
        }else{
            System.out.println("The " + this.branchName + " has the following customers");
            for(Customer customer : branchCustomers){
                System.out.println(customer.getCustomerName());
            }
        }
    }

    public void showCustomersAndTransactions(){
        if(this.branchCustomers.size() == 0){
            System.out.println(this.branchName + " has no customers");
        }else{
            System.out.println("Below is a list of customers of the " + this.branchName + " along with their transactions");
            for(Customer customer : branchCustomers){
                System.out.println(customer.getCustomerName());
                customer.showTransactions();
            }
        }
    }

    public String getBranchName(){
        return this.branchName;
    }
}
