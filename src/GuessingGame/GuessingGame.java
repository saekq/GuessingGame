package GuessingGame;

    import java.util.Random;
    import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select language:");
        System.out.println("1 - Magyar");
        System.out.println("2 - English");
        int languageChoice = scanner.nextInt();

        switch (languageChoice) {
            case 1:
                playGame(true);
                break;
            case 2:
                playGame(false);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static void playGame(boolean isHungarian) {
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        int eastereggNumber = random.nextInt(101);
        String congratulationsMessage = isHungarian ? "Gratulalok! Kitalaltad a szamot " : "Congratulations! You guessed the number in ";
        String attemptsMessage = isHungarian ? " probalkozas utan!" : " attempts!";
        String eastereggMessage = isHungarian ? "Ez egy Easteregg :D" : "This is an Easteregg :D";
        String tooLowMessage = isHungarian ? "Tul alacsony. Probalkozz ujra!" : "Too low. Try again!";
        String tooHighMessage = isHungarian ? "Tul magas. Probalkozz ujra!" : "Too high. Try again!";
        
        System.out.println(isHungarian ? "Gondoltam egy szamra 1 es 100 kozott. Melyik szamra gondolhattam?" : "I'm thinking of a number between 1 and 100. Which number was I thinking of?");

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println(tooLowMessage);
            } else if (guess > secretNumber) {
                System.out.println(tooHighMessage);
            } else {
                if (guess == eastereggNumber) {
                    System.out.println(congratulationsMessage + attempts + attemptsMessage);
                    System.out.println(eastereggMessage);
                } else {
                    System.out.println(congratulationsMessage + attempts + attemptsMessage);
                }
            }
        } while (guess != secretNumber);
    }
}





