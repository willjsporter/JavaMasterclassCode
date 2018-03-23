import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class MobilePhone {

    private static ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<>();
    }

    public String printContacts(){
        return this.contactList
            .stream()
            .map(contact -> "name: " + contact.name + ", number: " + contact.number)
            .reduce("Contacts list:", (x,y) -> x + "\n" + y);
    }

    public void store (String name, String number) {
        this.contactList.add(new Contact(name, number));
    }

    public void modify (String name, String number) {

    this.contactList = this.contactList
                            .stream()
                            .map(contact -> contact.name.equals(name) ? new Contact(name, number) : contact)
                            .collect(toCollection(ArrayList::new));
//
//        for(int i = 0; i<contactList.size(); i++){
//            if(contactList.get(i).getName().equals(name)){
//                contactList.set(i, new Contact(name, number));
//                System.out.println(contactList.get(i).getName() + " has phone no. " + contactList.get(i).getNumber());
//                break;
//            }
//        }

    }

    public void remove (String name) {

        this.contactList = this.contactList
                .stream()
                .filter(contact -> !contact.name.equals(name))
                .collect(toCollection(ArrayList::new));
    }

    public String query (String name) {

        return this.contactList
                .stream()
                .filter(contact -> contact.name.equals(name))
                .map(remainingContact -> "name: " + remainingContact.name + ", number: " + remainingContact.number)
                .reduce("Possible contacts to list:", (x,y) -> x + "\n" + y);
    }




}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contact (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contact
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.