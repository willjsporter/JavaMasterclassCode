public class Lecture29 {

    public static void main (String [] args) {
        calculateScore("Jim", 1234);
        calculateScore(1234);
        calculateScore("Jim");
        calculateScore();

        System.out.println("<no1>" + calculateScore("Jim", 1234) + "<no1>");
        System.out.println("<no2>" + calculateScore(1234) + "<no2>");
//        System.out.println("<no3>" + calculateScore("Jim") + "<no3>");
        System.out.println("<no4>" + calculateScore() + "<no4>");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(String name) {
        System.out.println(name + " player scored " + 0 + " points");
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
