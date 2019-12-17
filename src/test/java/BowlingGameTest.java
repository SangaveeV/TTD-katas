import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame game;
    @BeforeEach
    void setUp(){
        game=new BowlingGame();
    }

    @Test
    void gutterGameTest() {
        game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    void shouldBe20forOnePinsInEachRoll() {
        rollMany(20,1);
        assertEquals(20, game.score());
    }

    @Test
    void spareWhenTenBallsKnockedInTwoRolls(){
        game.roll(4);
        game.roll(6);
        game.roll(4);
        rollMany(17,0);
        assertEquals(18,game.score());
    }

    @Test
    void strikeWhenTenBallsAreKnockedInOneRoll(){
        game.roll(10);
        game.roll(4);
        game.roll(2);
        rollMany(17,0);
        assertEquals(22,game.score());
    }

    @Test
    void scoreForManyRolls(){
        rollMany(12,5);
        assertEquals(85,game.score());
    }

    void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }


}
