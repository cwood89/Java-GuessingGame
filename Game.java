import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    final int randNum = createRandomNumber();
    int userGuess = getUserInput();
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
    in.close();
    return guess;
  }

  public static int getUserInput(int guess) { // for testing
    System.out.println("Enter an number between 1 and 100: ");
    return guess;
  }
}