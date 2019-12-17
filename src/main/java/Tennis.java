public class Tennis {
    String player1;
    String player2;
    int player1Score = 0;
    int player2Score = 0;
    String advantage;
    String winner;

    public Tennis(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    String score() {
        if (hasWinner()) {
            return winner;
        } else if (isDeuce()) {
            return "Deuce";
        } else if (hasAdvantage()) {
            return advantage;
        } else if (player1Score == player2Score) {
            return translate(player1Score) + "-All";
        }
        return translate(player1Score) + "," + translate(player2Score);
    }

    private boolean hasWinner() {
        if (player1Score >= 4 && player1Score == player2Score + 2) {
            winner = player1;
            return true;
        } else if (player2Score >= 4 && player2Score == player1Score + 2) {
            winner = player2;
            return true;
        }
        return false;
    }

    private boolean hasAdvantage() {
        if (player1Score >= 3 && player1Score == player2Score + 1) {
            advantage = player1;
            return true;
        } else if (player2Score >= 3 && player2Score == player1Score + 1) {
            advantage = player2;
            return true;
        }
        return false;
    }

    private boolean isDeuce() {
        return player1Score == player2Score && player1Score == 3;
    }

    void player1ScorePoint() {
        player1Score++;
    }

    void player2ScorePoint() {
        player2Score++;
    }

    String translate(int playerScore) {
        if (playerScore == 0)
            return "Love";
        else if (playerScore == 1)
            return "Fifteen";
        else if (playerScore == 2)
            return "Thirty";
        else if (playerScore == 3)
            return "Forty";
        return "";
    }

}
