public class Lecture28 {
    public static void main(String[] args){
        displayHighScorePosition("Aaron", calculateHighScorePosition(1500));
        displayHighScorePosition("Bruce", calculateHighScorePosition(900));
        displayHighScorePosition("Claudio", calculateHighScorePosition(400));
        displayHighScorePosition("Tom", calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition (String playerName, int position){
        System.out.println(playerName + " managed to get into " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int score){
        int position;
        if(score > 1000) position = 1;
        else if(score > 500) position = 2;
        else if(score > 100) position = 3;
        else position = 4;
        return position;
    }
}
