public class Lecture22 {
    public static void main(String[] args){
        if(part4(part3(double1, double2)) >= 20) {
            System.out.println("limit exceeded");
        } else {
            System.out.println("f*cking siiiick");
        }
    }
    static double double1 = 20;
    static double double2 = 80;

    static double part3(double one, double two) {
        return (one + two) * 25;
    }

    static double part4(double one) {
        return one % 40;
    }
}
