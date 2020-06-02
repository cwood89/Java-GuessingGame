import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
  Game guessingGame;

  @Before
  public final void setup() {
    guessingGame = new Game();
  }

  @Test
  public void testRandomBetween1and100() {
    int num = Game.createRandomNumber();
    Assert.assertTrue(num <= 100 && num >= 1);
  }

  @Test
  public final void testUserGuessExist() {

    int guess = Game.getUserInput(50);
    Assert.assertTrue(guess <= 100 && guess >= 1);
  }
}