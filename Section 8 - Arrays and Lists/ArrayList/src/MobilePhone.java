import java.util.ArrayList;

public class MobilePhone {
    private String myMobileNumber;
    private ArrayList<Contact> myContacts;

    MobilePhone(String myMobileNumber){
        this.myMobileNumber = myMobileNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public String getMyMobileNumber() {
        return myMobileNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    //Method to add a new Contact entry to the ArrayList
    public void addContact(String contactName, String contactNumber){
        if(myContacts.size() == 0){
            addNewContact(contactName, contactNumber);
        }else if(checkContact(contactName)){
            System.out.println("The contact " + contactName + " already exists in your contact list");
        }else{
            addNewContact(contactName, contactNumber);
        }
    }

    //Method to check if a duplicate contact exisits
    private boolean checkContact(String contactName){
        boolean contactExists = false;
        for(Contact contact: myContacts){
            if(contact.getContactName().equals(contactName)){
                contactExists = true;
                break;
            }
        }
        return contactExists;
    }

    //Method to add Contact to ArrayList
    private void addNewContact(String contactName, String contactNumber){
        myContacts.add(new Contact(contactName, contactNumber));
        System.out.println("Added " + contactName + " to contacts list");
    }

    //Method to modify an existing contact
    public void modifyContact(String contactName, String contactNumber){
        if(checkContact(contactName)){
            modifyExistingContact(contactName,contactNumber);
        }else{
            System.out.println(contactName + " is not a contact that exists in your contact list");
        }
    }

    //Method to modify contact number of existing contact
    private void modifyExistingContact(String contactName,String contactNumber){
        for(Contact contact:myContacts){
            if(contact.getContactName().equals(contactName)){
                contact.setContactNumber(contactNumber);
                break;
            }
        }
    }

    //Method to remove contact from contactlist
    public void removeContact(String contactName){
        if(checkContact(contactName)){
            for(Contact contact: myContacts){
                if(contact.getContactName().equals(contactName)){
                    int contactPosition = myContacts.indexOf(contact);
                    myContacts.remove(contactPosition);
                    break;
                }
            }
        }else{
            System.out.println(contactName + " is not a that exists in your contact list");
        }
    }

    //Query contact names
    public void queryContacts(){
        if(myContacts.size() == 0){
            System.out.println("Your contact list is currently empty");
        }else{
            for(Contact contact:myContacts){
                System.out.println("\nName: " + contact.getContactName() + "\nNumber: " + contact.getContactNumber());
            }
        }
    }
}
