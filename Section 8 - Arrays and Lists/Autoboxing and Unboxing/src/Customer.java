import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    Customer(String customerName){
        this.customerName = customerName;
        transactions = new ArrayList<Double>();
    }

    Customer(String customerName, double initialDeposit){
        this(customerName);
        transactions = new ArrayList<Double>();
        addTransaction(initialDeposit);
    }

    public void addTransaction(double transaction){
        this.transactions.add(Double.valueOf(transaction));
    }

    public void showTransactions(){
        if(this.transactions.size() == 0){
            System.out.println(this.customerName + " has no transactions");
        }else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(i + 1 + ") " + transactions.get(i));
            }
        }
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
