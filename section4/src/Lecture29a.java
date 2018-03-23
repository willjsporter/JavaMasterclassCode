public class Lecture29a {
    public static void main (String [] args) {
        System.out.println(calcFeetAndInchesToCM(123.45));
        System.out.println(calcFeetAndInchesToCM(12,34));
        System.out.println(calcFeetAndInchesToCM(12,4));
    }

    public static double calcFeetAndInchesToCM(double feet, double inches) {
        if (feet <0 || inches <0 || inches > 12){
            return -1;
        }
        else {return (feet * 12 + inches)*2.54;}
    }

    public static double calcFeetAndInchesToCM(double inches) {
        if (inches < 0) {
            return -1;
        }
        else {
            double feet = (int) inches/12;
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCM(feet, remainingInches);
        }
    }
}
