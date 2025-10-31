package whapper;
public class game_scoreboard {
    public static void main(String[] args) {
        Integer[] scores = {50, null, 30, 70, null, 90, 40};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score; // auto-unboxing
            }
        }

        System.out.println("Players not played: " + notPlayedCount);
        System.out.println("Total valid scores: " + totalScore);
    }
}



