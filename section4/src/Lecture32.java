public class Lecture32 {

    public static void main (String[] args) {
        System.out.println(areThereThreePrimes(2,3));
        System.out.println(areThereThreePrimes(12,30));
        System.out.println(areThereThreePrimes(211,300));
        System.out.println(areThereThreePrimes(1211,1300));
        System.out.println(areThereThreePrimes(11211,11300));
    }
    public static int areThereThreePrimes(int bottomOfRange, int topOfRange) {
        int counter = 0;
        for (int j = bottomOfRange; j <= topOfRange; j ++) {
            if(counter == 3) return 0;
            if (isPrime(j)) {
                System.out.println(String.format("%d is a prime!",j));
                counter ++;
            }
        }
        return 1;
    }
    public static boolean isPrime(int n) {
        if (n==1) return false;

        for (int i =2; i< n/2; i ++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
}
// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit