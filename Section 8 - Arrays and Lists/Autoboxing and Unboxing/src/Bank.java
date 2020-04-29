import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> bankBranches;

    Bank(String bankName){
        this.bankName = bankName;
        this.bankBranches = new ArrayList<Branch>();
    }

    public void addBranch(String branchName){
        if(checkBranch(branchName)) {
            this.bankBranches.add(new Branch(branchName));
            System.out.println("The " + branchName + " branch has been added");
        }else{
            System.out.println(branchName + "could not be added because branch already exists");
        }
    }

    public void addCustomerToBranch(String branchName, String customer, Double deposit){
        Branch tempBranch;
        if(!checkBranch(branchName)){
            tempBranch = retrieveBranch(branchName);
            tempBranch.addCustomer(customer,deposit);
        }else{
            System.out.println(branchName + " is not a valid branch");
        }
    }

    public void addCustomerTransaction(String branchName, String customer, double transaction){
        Branch tempBranch;
        if(!checkBranch(branchName)){
            tempBranch = retrieveBranch(branchName);
            tempBranch.makeTransaction(customer, transaction);
        }else{
            System.out.println(branchName + " is not a valid branch");
        }
    }

    private boolean checkBranch(String branchName){
        for(Branch branch: bankBranches){
            if(branch.getBranchName().equals(branchName)){
                return false;
            }
        }
        return true;
    }

    private Branch retrieveBranch(String branchName){
        for(Branch branch: bankBranches){
            if(branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public void showBankBranches(){
        if(this.bankBranches.size() == 0){
            System.out.println(this.bankName + " has no branches");
        }else{
            System.out.println("The " + this.bankName + " bank has the below branches:");
            for(Branch branch : bankBranches){
                System.out.println("-" + branch.getBranchName());
            }
        }
    }

    public void showCustomersOfBranch(String branchName){
        Branch tempBranch = retrieveBranch(branchName);
        tempBranch.showCustomers();
    }

    public void showCustomersOfBranchAndTransactions(String branchName){
        Branch tempBranch = retrieveBranch(branchName);
        tempBranch.showCustomersAndTransactions();
    }
}
