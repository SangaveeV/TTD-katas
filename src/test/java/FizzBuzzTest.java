import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void displayFizzForMultiplesOfThree(){
        FizzBuzz game=new FizzBuzz();
        game.play(10);
        assertEquals("Fizz",game.result().get(2));
    }

    @Test
    void displayBuzzForMultiplesOfFive(){
        FizzBuzz game=new FizzBuzz();
        game.play(10);
        assertEquals("Buzz",game.result().get(4));
    }

    @Test
    void displayFizzBuzzForMultiplesOfThreeAndFive(){
        FizzBuzz game=new FizzBuzz();
        game.play(20);
        assertEquals("FizzBuzz",game.result().get(14));
    }
}
