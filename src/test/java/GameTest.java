import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    @Test
    public void score_Given0_ShouldBe0() {
        for(int i=1, i=20, i++){
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void score_Given1_ShouldBe20() {
        for(int i=1, i=20, i++){
            game.roll(1);
        }

        assertEquals(20, game.score());
    }

    @Test
    public void score_GivenSparePlus3_ShouldBe16() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        for(int i=1, i=17, i++){
            game.roll(0);
        }

        assertEquals(16, game.score());
    }

    @Test
    public void score_GivenStrikePlus3Plus4_ShouldBe24() {
        game.roll(10);
        game.roll(3);
        game.roll(4);
        for(int i=1, i=16, i++){
            game.roll(0);
        }

        assertEquals(24, game.score());
    }

    @Test
    public void score_GivenStrikePlus3Plus4_ShouldBe300() {
        for(int i=1, i=12, i++){
            game.roll(10);
        }

        assertEquals(300, game.score());
    }

    @BeforeEach
    private void setupGame() {
        game = new Game();
    }
}
