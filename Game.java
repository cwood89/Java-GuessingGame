import java.util.Scanner;

public class Game {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    String repeat = "y";

    while (repeat.equalsIgnoreCase("y")) {

      final int randNum = createRandomNumber();

      System.out.println("================================");

      System.out.println("You shouldn't cheat: " + randNum); // cheating

      int userGuess = getUserInput();

      while (!Game.guessIsCorrect(userGuess, randNum)) {
        userGuess = getUserInput();
      }

      System.out.println("Play again? Y/N ");
      repeat = in.nextLine();

    }

    in.close();

  }

  public static final int createRandomNumber() {
    return (int) (Math.random() * 100 + 1);
  }

  public static int getUserInput() {
    System.out.println("Enter an number between 1 and 100 or Q to quit: ");
    String input = in.nextLine();
    int guess = 0;
    if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("")) {
      System.out.println("Goodbye!");
      System.exit(0);
    } else {
      guess = Integer.parseInt(input);
    }

    while (guess > 100 || guess < 1) {
      System.out.println("Please enter a valid number");
      guess = Integer.parseInt(in.nextLine());
    }
    return guess;
  }

  public static int getUserInput(int guess) { // for testing
    System.out.println("Enter an number between 1 and 100: ");
    return guess;
  }

  public static boolean guessIsCorrect(int guess, int rand) {
    int attempts = 0;
    if (guess == rand) {
      System.out.println("You Guessed Correctly!");
      return true;
    } else {
      attempts++;

      if (guess < rand) {
        System.out.println("You guessed too low, guess Again");
      } else if (guess > rand) {
        System.out.println("You guessed too high, guess Again");
      }

      System.out.println("Number of attempts: " + attempts);
      System.out.println("================================");
      return false;
    }
  }
}