import java.util.Scanner;

public class ArrayListChallenge {

    static public void main(String... args) {
        MobilePhone mobile = new MobilePhone();
        boolean menuAvailable = true;
        String name;
        String number;
        while(menuAvailable) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Menu:\nPrint list of contacts: 1\nAdd new Contact: 2\nUpdate Contact: 3" +
                    "\nRemove contact: 4\nSearch Contact: 5\nQuit: 0");

            switch (Integer.getInteger(userInput.nextLine())) {
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    System.out.println("Contact Name:");
                    name = userInput.nextLine();
                    System.out.println("Contact Number:");
                    number = userInput.nextLine();
                    mobile.store(name, number);
                    break;
                case 3:
                    System.out.println("Contact Name to modify:");
                    name = userInput.nextLine();
                    System.out.println("New Contact Number:");
                    number = userInput.nextLine();
                    mobile.store(name, number);
                    break;
                case 4:
                    System.out.println("Contact Name to modify:");
                    name = userInput.nextLine();
                    mobile.remove(name);
                    break;
                case 5:
                    System.out.println("Contact Name to modify:");
                    name = userInput.nextLine();
                    mobile.query(name);
                    break;
                case 0:
                    menuAvailable = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }
    }
}

// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.