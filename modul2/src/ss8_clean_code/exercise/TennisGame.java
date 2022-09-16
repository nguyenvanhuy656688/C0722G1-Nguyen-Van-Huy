package ss8_clean_code.exercise;

public class TennisGame {
    public static final int SCORE_ZERO = 0;
    public static final int SCORE_ONE = 1;
    public static final int SCORE_TWO = 2;
    public static final int SCORE_THREE = 3;


    public static String result(int playerScore1) {
        switch (playerScore1) {
            case SCORE_ZERO:
                return "Love-All";
            case SCORE_ONE:
                return "Fifteen-All";
            case SCORE_TWO:
                return "Thirty-All";
            case SCORE_THREE:
                return "Forty-All";
            default:
                return "Deuce";

        }
    }

    public static String winPlayer(int playerScore1, int playerScore2) {
        boolean isPlayerScore1 = playerScore1 >= 4;
        boolean isPlayerScore2 = playerScore2 >= 4;
        String score ="Draw";

        if (isPlayerScore1 || isPlayerScore2) {
            int minusResult = playerScore1 - playerScore2;
            boolean isMinusResult1 = minusResult == 1;
            boolean isMinusResult2 = minusResult == -1;
            boolean isMinusResult3 = minusResult >= 2;


            if (isMinusResult1) score = " in favor of player 1";
            else if (isMinusResult2) score = "in favor of player 2";
            else if (isMinusResult3) score = "Win for player1";
            else score = "Win for player2";
        }
        return score;
    }

    public static String checkScore(int playerScore1, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = playerScore1;
            } else {
                score.append("-");
                tempScore = player2Score;
            }
            switch (tempScore) {
                case SCORE_ZERO:
                    score.append("Love");
                    break;
                case SCORE_ONE:
                    score.append("Fifteen");
                    break;
                case SCORE_TWO:
                    score.append("Thirty");
                    break;
                case SCORE_THREE:
                    score.append("Forty");
                    break;
            }
        }
        return score.toString();
    }
}
