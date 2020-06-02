import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    final int randNum = createRandomNumber();
    System.out.println(randNum); // cheating
    int userGuess = getUserInput();

    while (!Game.guessIsCorrect(userGuess, randNum)) {
      userGuess = getUserInput();
    }

  }

  public static final int createRandomNumber() {
    return (int) (Math.random() * 100 + 1);
  }

  public static int getUserInput() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an number between 1 and 100: ");
    int guess = in.nextInt();
    while (guess > 100 || guess < 1) {
      System.out.println("Please enter a valid number");
      guess = in.nextInt();
    }
    return guess;
  }

  public static int getUserInput(int guess) { // for testing
    System.out.println("Enter an number between 1 and 100: ");
    return guess;
  }

  public static boolean guessIsCorrect(int guess, int rand) {
    if (guess == rand) {
      System.out.println("You Guessed Correctly!");
      return true;
    } else {
      System.out.println("Guess Again");
      return false;
    }
  }
}