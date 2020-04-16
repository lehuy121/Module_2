package _7clean_code.baitap;

public class TennisGame {
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_FIRST_PLAYER = "Advantage player1";
    public static final String ADVANTAGE_SECOND_PLAYER = "Advantage player2";
    public static final String FIRST_PLAYER_WIN = "Win for player1";
    public static final String SECOND_PLAYER_WIN = "Win for player2";
    public static final String DASH = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int DEUCE_SCORE = 4;
    public static String score;
    public static int tempScore;

    public static String getScore(String firstPlayer, String secondPlayer, int firstPlayerScore, int secondPlayerScore) {
        score = "";
        int tempScore = 0;
        if (firstPlayerScore == secondPlayerScore) {
            scoreForAll(firstPlayerScore);
        } else if (firstPlayerScore >= DEUCE_SCORE || secondPlayerScore >= DEUCE_SCORE) {
            checkWin(firstPlayerScore, secondPlayerScore);
        } else {
            calculateScore(firstPlayerScore, secondPlayerScore);
        }
        return score;
    }

    static void scoreForAll(int playerScore) {
        switch (playerScore) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
    }

    static void calculateScore(int firstPlayerScore, int secondPlayerScore) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstPlayerScore;
            else {
                score += DASH;
                tempScore = secondPlayerScore;
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
    }

    static void checkWin(int firstPlayerScore, int secondPlayerScore) {
        int minusResult = firstPlayerScore - secondPlayerScore;
        boolean isFirstPlayerAdvantage = minusResult == 1;
        boolean isSecondPlayerAdvantage = minusResult == -1;
        boolean isFirstPlayerWin = minusResult >= 2;

        if (isFirstPlayerAdvantage) {
            score = ADVANTAGE_FIRST_PLAYER;
        } else if (isSecondPlayerAdvantage) {
            score = ADVANTAGE_SECOND_PLAYER;
        } else if (isFirstPlayerWin) {
            score = FIRST_PLAYER_WIN;
        } else {
            score = SECOND_PLAYER_WIN;
        }
    }
}