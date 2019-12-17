import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {
    Tennis tennis;

    @BeforeEach
    void setUp() {
        tennis = new Tennis("Player 1", "Player 2");
    }

    @Test
    void shouldReturnLoveAll() {
        assertEquals("Love-All", tennis.score());
    }

    @Test
    void shouldReturnFifteenAndLoveForPlayersScore() {
        tennis.player1ScorePoint();
        assertEquals("Fifteen,Love", tennis.score());
    }

    @Test
    void shouldReturnFifteenAndThirtyForPlayersScore() {
        tennis.player1ScorePoint();
        tennis.player2ScorePoint();
        tennis.player2ScorePoint();
        assertEquals("Fifteen,Thirty", tennis.score());
    }

    @Test
    void isDeuceIfBothPlayersHave3Points() {
        tennis.player1Score = 3;
        tennis.player2Score = 3;
        assertEquals("Deuce", tennis.score());
    }

    @Test
    void hasAdvantageIfPlayersScoreIsThreeAndOneMoreThanOpponent() {
        tennis.player1Score = 4;
        tennis.player2Score = 3;
        assertEquals("Player 1", tennis.score());
    }

    @Test
    void hasWinnerWhenPlayersScoreMoreThanFourAndTwoMoreThanOpponent() {
        tennis.player1Score = 4;
        tennis.player2Score = 6;
        assertEquals("Player 2", tennis.score());
    }
}
