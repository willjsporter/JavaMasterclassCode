public class Lecture33 {
    public static void main (String [] args) {
        System.out.println(isEvenNumber(0));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));

        int number = 5;
        do {
            if (!isEvenNumber(number)){
                number ++;
                continue;
            }
            System.out.println(number);
        } while(number < 20);
    }

    public static boolean isEvenNumber (int num) {
        return num % 2 == 0 ? true : false;
    }
}
// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;