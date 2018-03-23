public class Contact {

    public final String name;
    public final String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

//    public void setName(String name) {
////        this.name = name;
////       // return this;
////    }
////
////    public void setNumber(String number) {
////        this.number = number;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getNumber() {
//        return number;
//    }
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