import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone;
    private static boolean userContinue = true;
    private static int userSelection;

    public static void main(String[] args){
        System.out.println("Cell Phone Powering up...");
        System.out.println("Please enter your cell phone Number");
        String cellPhoneNumber = scanner.nextLine();
        myPhone = new MobilePhone(cellPhoneNumber);
        while(userContinue){
            printInstructions();
            checkUserInput();

            switch (userSelection){
                case 1:
                    storeContact();
                    break;

                case 2:
                    modifyContact();
                    break;

                case 3:
                    removeContact();
                    break;

                case 4:
                    printContacts();
                    break;

                case 5:
                    System.out.println("Exiting");
                    userContinue = false;
                    break;

                default:
                    System.out.println("Please Enter a valid entry");
            }

        }


    }

    public static void printInstructions(){
        System.out.println("\nOption 1: Store Contact");
        System.out.println("Option 2: Modify Contact");
        System.out.println("Option 3: Remove Contact");
        System.out.println("Option 4: Query Contacts");
        System.out.println("Option 5: Quit");
    }

    public static void checkUserInput(){
        if(scanner.hasNextInt()){
            userSelection = scanner.nextInt();
        }else{
            userSelection = 0;
        }
        scanner.nextLine();
    }

    public static void storeContact(){
        System.out.println("Please enter name of contact");
        String contactName = scanner.nextLine();
        System.out.println("Please enter cell phone number of contact");
        String contactNumber = scanner.nextLine();
        myPhone.addContact(contactName,contactNumber);
    }

    public static void modifyContact(){
        System.out.println("Please enter name of contact to modify");
        String contactName = scanner.nextLine();
        System.out.println("Please enter update cell phone number");
        String phoneNumber = scanner.nextLine();
        myPhone.modifyContact(contactName,phoneNumber);
    }

    public static void removeContact(){
        System.out.println("Please enter name of contact to remove");
        String contactName = scanner.nextLine();
        myPhone.removeContact(contactName);
    }

    public static void printContacts(){
        myPhone.queryContacts();
    }


}
