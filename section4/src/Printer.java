public class Printer {

    private double tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean duplex;

    public Printer(double tonerLevel, boolean duplex) {
        if(tonerLevel <=100 && tonerLevel >= 0){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplex = duplex;
    }

    public void fillUpToner(double ink) {
        if(this.tonerLevel + ink <=100){
            this.tonerLevel += ink;
        }
    }

    public String printPages(int numberOfPages) {
        if(duplex) {
            numberOfPagesPrinted += numberOfPages % 2 ==0 ? numberOfPages/2 : (numberOfPages + 1)/2;
        } else { numberOfPagesPrinted += numberOfPages; }
        System.out.println(String.format("Printed %d pages", numberOfPages));
        return String.format("Printed %d pages", numberOfPages);
    }
}

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.